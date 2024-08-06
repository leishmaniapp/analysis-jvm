plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    implementation(libs.jetbrains.annotations)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}

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
