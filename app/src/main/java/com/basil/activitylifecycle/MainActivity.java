package com.basil.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Activity LifeCycle
     *
     * When your app starts this method will be the first to be called
     * this method creates the context
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Activity is Created", Toast.LENGTH_SHORT).show();
    }

    /**
     * At the end of this method the UI will be finished and ready for
     * the user and your activity took the screen
     */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity is Started", Toast.LENGTH_SHORT).show();
    }

    /**
     * The activity is going to stay at this method until some thing interrupts
     * your activity or the user decided to exit it
     * the best use is to start your automated animation within
     */
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity is Resumed", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method means that something has interrupted your activity
     * so for example you should stop your animation or pause your video player
     */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity is Paused", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method will be called when your activity is no longer visible for the
     * user and it's the first identification the your activity is about to destroy
     * you can do hard work within as it's your last chance
     */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity is Stopped", Toast.LENGTH_SHORT).show();
    }

    /**
     * The last method to be called and your activity is no longer there at the memory
     * very fast to implement so you should do little things here but the most imported
     * is to release any resources as camera and sensors
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity is Destroyed", Toast.LENGTH_SHORT).show();
    }
}
