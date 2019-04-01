package com.qin.adapter;

/**
 * @author by Tracy
 * @Classname MediaAdapter
 * @Description 播放器适配器
 * @Date 2019/4/1 13:37
 */
public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if ("mp4".equals(type)){
            advancedMediaPlayer = new Mp4Player();
        }
        if ("vlc".equals(type)){
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String type, String url) {
        if ("mp4".equals(type)){
            advancedMediaPlayer.playMap4(url);
        }
        if ("vlc".equals(type)){
            advancedMediaPlayer.playVlc(url);
        }
    }
}
