import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.io.File

suspend fun main() {
    val urls = listOf(
        "https://dummyimage.com/640x360/fff/aaa",
        "https://dummyimage.com/640x360/fff/aaa"
    )

    val client = HttpClient(CIO)

    runBlocking {
        val images = urls.map { url ->
            async {
                client.get(url).body<ByteArray>()
            }
        }.map { it.await() }
        images.forEachIndexed { index, image ->
            withContext(Dispatchers.IO) {
                File("src/main/images/image${index + 1}.jpg").writeBytes(image)
            }
        }
    }}

