package com.br.augustovictor.testing.kotlintestinglab.business

import org.springframework.data.repository.CrudRepository

interface MovieRepository: CrudRepository<Movie, String>