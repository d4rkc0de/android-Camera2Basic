package com.example.android.camera2basic;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class CameraActivityTest {

    @Rule
    public ActivityTestRule<CameraActivity> mActivityTestRule = new ActivityTestRule<>(CameraActivity.class);

    @Test
    public void cameraActivityTest() throws InterruptedException {
        ViewInteraction button = onView(
                allOf(withId(R.id.picture), withText("Picture"),
                        withParent(withId(R.id.control)),
                        isDisplayed()));
        button.perform(click());
    }

}
