package com.hawk.ffmpeg;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    FFmpeg ffmplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String folderurl = Environment.getExternalStorageDirectory().getPath();
        ffmplayer = new FFmpeg();
      //  ffmplayer.showFFmpegInfo();
        ffmplayer.decoder(folderurl+"/"+"test.mp4", folderurl+"/"+"Titanic.yuv");
    }

}
