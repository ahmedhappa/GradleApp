package com.udacity.gradle.builditbigger;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Ahmed on 11/02/2018.
 */

@RunWith(AndroidJUnit4.class)
public class AsyncAndroidTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void checkJokeIsRetrievedFromServer(){
        onView(withId(R.id.tell_joke_button)).perform(click());
        onView(withId(R.id.joke_text)).check(matches(withText("hi from my first joke")));
    }
}
