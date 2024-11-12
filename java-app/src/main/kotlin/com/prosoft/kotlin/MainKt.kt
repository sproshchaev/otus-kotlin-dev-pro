package com.prosoft.kotlin


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.prosoft.java", "com.prosoft.kotlin"])
open class MainKt

fun main(args: Array<String>) {
    runApplication<MainKt>(*args)
}
