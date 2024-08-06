plugins {
    `maven-publish`

    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
}

allprojects {
    group = "com.leishmaniapp.analysis"
    version = "1.1.0"
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                version = project.version.toString()
                group = project.group
                artifactId = project.name
            }
        }
    }
}