package com.br.augustovictor.testing.kotlintestinglab.business

data class MovieRepresenter(
        var id: String,
        var title: String
) {
    constructor(movie: Movie): this(
            movie.id,
            movie.title
    ) {
        id = movie.id
        title = movie.title
    }
}