package com.br.augustovictor.testing.kotlintestinglab

import com.br.augustovictor.testing.kotlintestinglab.business.Movie
import com.br.augustovictor.testing.kotlintestinglab.business.MovieRepository
import com.br.augustovictor.testing.kotlintestinglab.business.MovieService
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class MovieServiceTest {
    @InjectMocks
    private lateinit var movieService: MovieService

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Test
    fun `should return all movies`() {
        Mockito.doReturn(Arrays.asList(Movie("123","New movie"))).`when`(movieRepository).findAll()

        val result: Iterable<Movie> = movieService.getAllMovies()

        Assert.assertNotNull(result)
        Assert.assertEquals("123", result.first().id)
        Assert.assertEquals("New movie", result.first().title)
    }
}