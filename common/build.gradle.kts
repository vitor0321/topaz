plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("maven-publish")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "common"
            isStatic = true
        }
    }

    sourceSets {
        androidMain.dependencies {
            api(kotlin("gradle-plugin:1.5.21"))
            implementation(libs.compose.ui)
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.compose.material3)
            implementation(libs.androidx.activity.compose)
            implementation(libs.androidx.material.icons)
            implementation(libs.androidx.material)
            implementation(libs.coil.compose)
            implementation(libs.coil.svg)
        }
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

project.afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("topaz") {
                groupId = "com.walcker.compose.ui"
                artifactId = "topaz"
                version = "0.0.1"
                val bundleReleaseAar = tasks.getByName("bundleReleaseAar")
                artifact(bundleReleaseAar)
                if (!version.equals("1.0")) {
                    // Adicione qualquer configuração adicional necessária para essa condição
                    // Por exemplo:
                    // val bundleOtherAar = tasks.getByName("bundleOtherAar")
                    // artifact(bundleOtherAar)
                }
            }
        }
    }
}

android {
    namespace = "com.walcker.compose.ui.topaz"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }
}