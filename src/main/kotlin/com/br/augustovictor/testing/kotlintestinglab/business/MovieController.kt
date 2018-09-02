package com.br.augustovictor.testing.kotlintestinglab.business

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController {

    @Autowired
    private lateinit var movieService: MovieService

    @GetMapping("")
    fun getAll(): Movie {
        return movieService.getAll()
    }

    @GetMapping("/all")
    fun getAllMovies(): Iterable<Movie> {
        return movieService.getAllMovies()
    }
}