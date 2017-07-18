package Impl.advancedMediaPlayer;

import Interface.AdvancedMediaPlayer;

/**
 * AdvancedMediaPlayer 接口的实体类。
 * Created by 李伟民 on 17/7/18.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}