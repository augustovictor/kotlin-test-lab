package com.br.augustovictor.testing.kotlintestinglab

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieControllerIT {

    @Autowired
    private lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun contextLoads() {}

    @Test
    fun `should retrieve all movies`() {
        val response = testRestTemplate.getForObject("/movies/all", Iterable::class.java)
        Assert.assertNotNull(response)
    }
}