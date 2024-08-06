plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    implementation(project(":core"))
    implementation(libs.jetbrains.annotations)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    withSourcesJar()
    withJavadocJar()
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