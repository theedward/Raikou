// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
  repositories {
    google()
    mavenCentral()
  }

  val kotlinPluginVersion = "1.7.10"
  dependencies {
    classpath("com.android.tools.build:gradle:7.2.2")
    classpath(kotlin("gradle-plugin", version = kotlinPluginVersion))
    classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinPluginVersion")

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}

allprojects {
  repositories {
    mavenCentral()
    google()
  }
}

tasks.register<Delete>("clean").configure {
  delete(rootProject.buildDir)
}