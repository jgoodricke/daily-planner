plugins {
    id("java")
}

allprojects {
    group = "com.planner"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(21))
        }
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    }
}

