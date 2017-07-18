package Impl.advancedMediaPlayer;

import Interface.AdvancedMediaPlayer;

/**
 * AdvancedMediaPlayer 接口的实体类。
 * Created by 李伟民 on 17/7/18.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}