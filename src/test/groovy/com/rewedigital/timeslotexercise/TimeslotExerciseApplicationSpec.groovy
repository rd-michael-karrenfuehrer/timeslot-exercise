package com.rewedigital.timeslotexercise

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TimeslotExerciseApplicationSpec extends Specification {

    @Autowired (required = false)
    private ExampleJava exampleJava

    def "load context"() {
        expect:
        exampleJava
    }
}
