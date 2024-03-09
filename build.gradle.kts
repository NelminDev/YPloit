import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.serialization") version "1.9.23"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "me.nelmin.minecraft"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")

    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    test {
        useJUnitPlatform()
    }
}

val targetCompatibility = JavaVersion.VERSION_11.toString()

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = targetCompatibility
}

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = targetCompatibility
}

kotlin {
    jvmToolchain(11)
}