package com.andresetiawana09.androidjetpack.ui.listmovie

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class MovieListViewModelTest {
    private val viewModel = MovieListViewModel()

    @Test
    fun getDummyData() {
        val data = viewModel.getDummyData()
        assertNotNull(data)
        assertEquals(10, data.size)
    }
}