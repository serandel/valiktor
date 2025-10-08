plugins {
    val springPluginVersion: String by extra

    kotlin("plugin.spring") version springPluginVersion
}

val springBootVersion: String by project

dependencies {
    implementation(project(":valiktor-spring:valiktor-spring"))
    implementation(project(":valiktor-spring:valiktor-spring-boot-autoconfigure"))
    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
}
