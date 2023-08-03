import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	groovy
	id("org.springframework.boot") version "3.1.1"
	id("io.spring.dependency-management") version "1.1.1"
	kotlin("jvm") version "1.9.0"
	kotlin("plugin.spring") version "1.9.0"
	kotlin("plugin.jpa") version "1.9.0"
}

group = "com.rewe-digital"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.projectlombok:lombok:1.18.28")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
		exclude(group = "junit", module = "junit")
	}
	testImplementation("org.apache.groovy:groovy-all:4.0.13")
	testImplementation("org.spockframework:spock-core:2.4-M1-groovy-4.0")
	testImplementation("org.spockframework:spock-spring:2.4-M1-groovy-4.0")
	runtimeOnly("com.h2database:h2:2.2.220")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
