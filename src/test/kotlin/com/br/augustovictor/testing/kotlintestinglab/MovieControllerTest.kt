package com.br.augustovictor.testing.kotlintestinglab

import com.br.augustovictor.testing.kotlintestinglab.business.Movie
import com.br.augustovictor.testing.kotlintestinglab.business.MovieController
import com.br.augustovictor.testing.kotlintestinglab.business.MovieService
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.RequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import java.util.*

@RunWith(SpringRunner::class)
@WebMvcTest(MovieController::class)
class MovieControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    private lateinit var movieService: MovieService

    @Test
    fun `should return a list of movies`() {
        Mockito.doReturn(Movie("1", "Item 1")).`when`(movieService).getAll()

        val request: RequestBuilder = MockMvcRequestBuilders
                .get("/movies")
                .accept(MediaType.APPLICATION_JSON)

        mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.content().json("{id:\"1\", title: \"Item 1\"}"))
                .andReturn()
    }

    @Test
    fun `should test json values`() {
        val actualResponse = "{id:1, title: \"Item 1\"}"
        JSONAssert.assertEquals("{id:1}", actualResponse, false)
    }

    @Test
    fun `should return all movies all`() {
        Mockito.doReturn(Arrays.asList(Movie("123", "Movie from test"))).`when`(movieService).getAllMovies()

        val request: RequestBuilder = MockMvcRequestBuilders
                .get("/movies/all")
                .accept(MediaType.APPLICATION_JSON)

        mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.content().json("[{id: \"123\", title: \"Movie from test\"}]"))
    }
}