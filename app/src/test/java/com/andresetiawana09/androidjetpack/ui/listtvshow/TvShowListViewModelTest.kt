package com.andresetiawana09.androidjetpack.ui.listtvshow

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class TvShowListViewModelTest {
    private var viewModel = TvShowListViewModel()

    @Test
    fun getDummyData() {
        val data = viewModel.getDummyData()
        assertNotNull(data)
        assertEquals(10, data.size)
    }
}