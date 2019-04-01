package com.qin.adapter;

/**
 * @author by Tracy
 * @Classname VlcPlayer
 * @Description Vlc播放器
 * @Date 2019/4/1 13:35
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String url) {
        System.out.println("开始播放vlc:"+url);
    }

    @Override
    public void playMap4(String url) {

    }
}
