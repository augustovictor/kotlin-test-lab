package com.br.augustovictor.testing.kotlintestinglab

import com.jayway.jsonpath.JsonPath
import org.junit.Test

class JsonPathTest {

    @Test
    fun testResponse() {
        val response = """
            [
                {"id": 1, "name": "Victor 1", lastname: "Costa"},
                {"id": 1, "name": "Victor 2", lastname: "Costa"},
                {"id": 1, "name": "Victor 3", lastname: "Costa"},
                {"id": 1, "name": "Victor 4", lastname: "Costa"}
            ]
            """.trimIndent()

//        val context = JsonPath.parse(response).read("$.length")

    }
}