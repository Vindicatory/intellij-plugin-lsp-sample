package typealiasproblem.sample
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.Lsp4jServer
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

@Suppress("UnstableApiUsage")
class SampleServerDescriptor(
   project: Project,
) : ProjectWideLspServerDescriptor(project, "Sample") {

   override fun isSupportedFile(file: VirtualFile): Boolean {
      return true
   }

   override val lsp4jServerClass: Class<out Lsp4jServer> = SampleLspServer::class.java
}
