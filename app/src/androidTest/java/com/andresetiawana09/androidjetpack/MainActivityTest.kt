package com.andresetiawana09.androidjetpack

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class MainActivityTest {
    @Rule
    @JvmField
    val activityActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp() {
        activityActivityTestRule.activity
            .supportFragmentManager.beginTransaction()
    }

    @Test
    fun testFragmentNavigation() {
        Espresso.onView(ViewMatchers.withId(R.id.fragment))
        Thread.sleep(200)
        Espresso.onView(ViewMatchers.withText("Joker")).perform(ViewActions.click())
        Thread.sleep(200)
        Espresso.pressBack()

        Espresso.onView(ViewMatchers.withId(R.id.tv_fragment)).perform(ViewActions.click())
        Thread.sleep(200)
        Espresso.onView(ViewMatchers.withText("Avenger")).perform(ViewActions.click())
        Thread.sleep(200)
        Espresso.pressBack()

        Espresso.onView(ViewMatchers.withId(R.id.favorite_fragment)).perform(ViewActions.click())
        Thread.sleep(200)
        Espresso.pressBack()
    }
}