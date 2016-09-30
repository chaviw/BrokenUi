package com.example.test.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);

	//comment
    }

    @Override
    protected void onPause() {
        super.onPause();
        image.setVisibility(View.GONE);

	//comment2
	//
	//comment3
    }
}
