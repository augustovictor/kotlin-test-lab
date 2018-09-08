package com.br.augustovictor.testing.kotlintestinglab

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AssertJTests {
    @Test
    fun testMatchers() {
        val nums: List<Int> = listOf(4,14,521,54)

        assertThat(nums)
                .hasSize(4)
                .contains(14, 4, 54)
    }
}