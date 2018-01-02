package com.hawk.ffmpeg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    FFmpeg ffmplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ffmplayer = new FFmpeg();
        ffmplayer.showFFmpegInfo();
    }

}
