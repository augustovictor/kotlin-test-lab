package com.br.augustovictor.testing.kotlintestinglab

import com.br.augustovictor.testing.kotlintestinglab.business.MovieController
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*

class ListMockTest {
    private val mock: MutableList<*> = mock(MutableList::class.java)

    @Test
    fun testSizeBasic() {
        `when`(mock.size).thenReturn(5)
        assertEquals(5, mock.size)
    }

    @Test
    fun testMultipleReturnValues() {
        `when`(mock.size).thenReturn(5).thenReturn(10)
        assertEquals(5, mock.size)
        assertEquals(10, mock.size)
    }

    @Test
    fun testAnyArgument() {
        `when`(mock.get(ArgumentMatchers.anyInt())).thenReturn("Returned object")
        assertEquals(mock.get(2), "Returned object")
    }

//    @Test
//    fun testArgumentCapturing() {
//        mock.add("SomeString")
//
//        val interceptor: ArgumentCaptor<String> = ArgumentCaptor.forClass(String::class.java)
//        verify(mock).add(interceptor.capture())
//
//        assertEquals("SomeString", interceptor.value)
//    }
//    @Test
//    fun testSpy() {
//    val mockMovieController: MovieController = spy(MovieController::class.java)
//        mockMovieController.getAll()
//
//        verify(mockMovieController).getAll()
//    }
}
