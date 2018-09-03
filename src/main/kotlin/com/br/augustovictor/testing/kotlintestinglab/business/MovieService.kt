package com.br.augustovictor.testing.kotlintestinglab.business

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieService {

    @Autowired
    private lateinit var movieRepository: MovieRepository

    fun getAll(): Movie {
        return Movie("1", "Item 1")
    }

    fun getAllMovies(): Iterable<Movie> {
        return movieRepository.findAll().map { it -> Movie(it.id, it.title) }
    }

    fun insert(movie: Movie): Movie {
        return movieRepository.save(movie)
    }
}