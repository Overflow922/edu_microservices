plugins {
    id("io.spring.dependency-management")
    java
}

group = "com.iyuriy.microservices.core"
version = "1.0.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.spring.io/snapshot") }
}

val springBootVersion = "2.7.0-SNAPSHOT"

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:${springBootVersion}"))

    implementation(project(":api"))
    implementation("org.springframework.boot:spring-boot-starter-webflux:${springBootVersion}")
    testImplementation("org.springframework.boot:spring-boot-starter-test:${springBootVersion}")
}

tasks.withType<Test> {
    useJUnitPlatform()
}