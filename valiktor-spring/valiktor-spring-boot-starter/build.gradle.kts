plugins {
    kotlin("plugin.spring") version "1.4.10"
}

val springBootVersion = "2.2.6.RELEASE"

dependencies {
    implementation(project(":valiktor-spring:valiktor-spring"))
    implementation(project(":valiktor-spring:valiktor-spring-boot-autoconfigure"))
    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
}
