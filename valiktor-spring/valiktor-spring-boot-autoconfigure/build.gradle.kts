plugins {
    kotlin("plugin.spring") version "1.4.10"
}

val springBootVersion = "2.3.4.RELEASE"
val jacksonVersion = "2.11.2"

dependencies {
    compileOnly(project(":valiktor-spring:valiktor-spring"))
    compileOnly("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-autoconfigure:$springBootVersion")
    annotationProcessor("org.springframework.boot:spring-boot-autoconfigure-processor:$springBootVersion")

    testImplementation(project(":valiktor-spring:valiktor-spring"))
    testImplementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
}
