package com.hawk.ffmpeg;

/**
 * Created by lan on 2017-12-29.
 */

public class FFmpeg {
    static {
        System.loadLibrary("avutil");
        System.loadLibrary("fdk-aac");
        System.loadLibrary("avcodec");
        System.loadLibrary("avformat");
        System.loadLibrary("swscale");
        System.loadLibrary("swresample");
        System.loadLibrary("avfilter");
        System.loadLibrary("native-lib");
    }

    public native void showFFmpegInfo();

    public native int decoder(String inputurl, String outputurl);
}
