package com.qin.adapter;

/**
 * @author by Tracy
 * @Classname AdapterPattern
 * @Description 适配器模式启动类
 * @Date 2019/4/1 13:56
 */
public class AdapterPattern {


    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3","http://www.adapter.map3");
        mediaPlayer.play("mp4","http://www.adapter.map4");
        mediaPlayer.play("vlc","http://www.adapter.vlc");
        mediaPlayer.play("png","http://www.adapter.pgn");
    }


}
