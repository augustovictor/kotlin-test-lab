package com.br.augustovictor.testing.kotlintestinglab.business

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

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

    @PostMapping("", consumes = ["application/json"], produces = ["application/json"])
    fun insert(@RequestBody movie: Movie): Movie {
        return movieService.insert(movie)
    }
}