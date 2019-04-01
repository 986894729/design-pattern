package com.qin.adapter;

/**
 * @author by Tracy
 * @Classname Mp4Player
 * @Description mp4播放器
 * @Date 2019/4/1 13:39
 */
public class Mp4Player implements AdvancedMediaPlayer{


    @Override
    public void playVlc(String url) {

    }

    @Override
    public void playMap4(String url) {
        System.out.println("开始播放mp4:"+url);
    }
}
