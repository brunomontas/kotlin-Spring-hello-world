package com.ketchup.brunohelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BrunoHelloWorldApplication

fun main(args: Array<String>) {
	runApplication<BrunoHelloWorldApplication>(*args)
}

@RestController
class HelloWorld {
	@GetMapping("/")
	fun index() = "Hello world!"
}
