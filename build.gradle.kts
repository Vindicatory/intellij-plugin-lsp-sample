plugins {
  kotlin("jvm") version "2.0.21"
  id("java")
  alias(libs.plugins.intelliJPlatform)
}

repositories {
  mavenCentral()

  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
   implementation("org.eclipse.lsp4j:org.eclipse.lsp4j:0.21.0")
    intellijPlatform {
        create("IU", "2024.2.2")

        instrumentationTools()
        pluginVerifier()
        zipSigner()
    }
}

kotlin {
  jvmToolchain(17)
}

java {
   sourceCompatibility = JavaVersion.VERSION_17
}

tasks {
  wrapper {
    gradleVersion = "8.11"
  }
   processResources {
   }

   publishPlugin{
      dependsOn(processResources)
   }
}
