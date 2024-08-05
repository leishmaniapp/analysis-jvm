plugins {
    `java-library`
    `maven-publish`
}

allprojects {
    group = "com.leishmaniapp.analysis"
    version = "1.0.0"
}

subprojects {
    plugins.apply("java-library")
    plugins.apply("maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

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
