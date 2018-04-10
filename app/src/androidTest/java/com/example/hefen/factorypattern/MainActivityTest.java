package com.example.hefen.factorypattern;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Test
    public void shouldRenderView() throws Exception {
        rule.launchActivity(new Intent());

        onView(withText(R.string.url)).check(matches(isDisplayed()));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("www.google.com")));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("www.bing.com")));
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("www.yahoo.com")));
    }
}