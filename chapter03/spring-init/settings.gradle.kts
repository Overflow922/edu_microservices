pluginManagement {
    repositories {
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}
rootProject.name = "spring-init"
include(":microservices:product-service")
include(":microservices:review-service")
include(":microservices:recommendation-service")
include(":microservices:product-composite-service")