package com.hawk.ffmpeg;

/**
 * Created by lan on 2017-12-29.
 */

public class FFmpeg {
    static {
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("postproc-54");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avdevice-57");
        System.loadLibrary("native-lib");
    }

    public native void showFFmpegInfo();
}
