package team.bakkas.functionalAdvice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunctionalEndpointExceptionHandlerApplication

fun main(args: Array<String>) {
    runApplication<FunctionalEndpointExceptionHandlerApplication>(*args)
}
