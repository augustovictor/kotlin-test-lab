package com.br.augustovictor.testing.kotlintestinglab.business

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity

data class Movie(
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name="uuid2", strategy = "uuid2")
        var id: String? = null,
        var title: String? = null
)