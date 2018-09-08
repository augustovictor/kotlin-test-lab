package com.br.augustovictor.testing.kotlintestinglab

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.Test

class HamcrastTest {
    @Test
    fun testMatchers() {
        val nums: List<Int> = listOf(4,14,521,54)

        assertThat(nums, hasSize(4))
        assertThat(nums, hasItems(54, 14))
        assertThat(nums, everyItem(greaterThan(3)))
    }
}