plugins {
    `java-library`
    `maven-publish`
}

allprojects {
    group = "com.leishmaniapp.analysis"
    version = "1.0.1-beta"
}

subprojects {
    plugins.apply("java-library")
    plugins.apply("maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components.findByName("java"))
                version = project.version.toString()
                group = project.group
                artifactId = project.name
            }
        }
    }
}