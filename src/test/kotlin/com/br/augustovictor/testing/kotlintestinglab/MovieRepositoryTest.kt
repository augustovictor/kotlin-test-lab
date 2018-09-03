package com.br.augustovictor.testing.kotlintestinglab

import com.br.augustovictor.testing.kotlintestinglab.business.Movie
import com.br.augustovictor.testing.kotlintestinglab.business.MovieRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@DataJpaTest
class MovieRepositoryTest {

    @Autowired
    private lateinit var movieRepository: MovieRepository

    @Test
    fun `should return all movies from db`() {
        val movies: Iterable<Movie> = movieRepository.findAll()
        Assert.assertEquals("1", movies.first().id)
        Assert.assertEquals("Movie 1", movies.first().title)
    }
}