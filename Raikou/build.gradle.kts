plugins {
  id("com.android.library")
  id("kotlin-android")
}

android {
  compileSdk = 33

  defaultConfig {
    minSdk = 24
    targetSdk = 33
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  sourceSets {
    named("main") {
      manifest.srcFile("src/AndroidManifest.xml")
      java.srcDirs("src/main")
    }
    named("androidTest") {
      java.srcDirs("src/test/java/com/crescentmoon/raikou")
    }
  }
}

val kotlinVersion: String = "1.6.0"

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinVersion")
}
