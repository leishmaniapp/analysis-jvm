plugins {
    `java-library`
    `maven-publish`
}

allprojects {
    group = "com.leishmaniapp.analysis"
    version = "0.1.0-beta"
}

subprojects {
    plugins.apply("java-library")
    plugins.apply("maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11

        withSourcesJar()
        withJavadocJar()
    }

    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components.findByName("java"))
                version = project.version.toString()
                group = project.group
                artifactId = project.name
            }
        }
    }
}