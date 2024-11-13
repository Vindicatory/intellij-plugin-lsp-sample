package typealiasproblem.sample

import com.intellij.platform.lsp.api.Lsp4jServer
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import java.util.concurrent.CompletableFuture

interface SampleLspServer : Lsp4jServer
{
    @JsonRequest("document/customRequest")
    fun customRequest(params: String): CompletableFuture<String>
}