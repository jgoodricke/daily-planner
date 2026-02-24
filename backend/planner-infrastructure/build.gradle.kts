plugins {
    id("java-library")
}

dependencies {
    implementation(project(":planner-domain"))
    implementation(project(":planner-application"))
}