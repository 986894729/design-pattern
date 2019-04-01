package com.qin.adapter;

/**
 * @author by Tracy
 * @Classname AudioPlayer
 * @Description 音频播放器
 * @Date 2019/4/1 13:52
 */
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String type,String url) {
        if ("mp3".equals(type)){
            System.out.println("我自己就能播放map3:"+url);
        }else if("mp4".equals(type) || "vlc".equals(type)){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,url);
        }else {
            System.out.println("not support "+type+" play!!");
        }
    }
}
