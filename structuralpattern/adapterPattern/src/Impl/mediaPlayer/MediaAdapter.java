package Impl.mediaPlayer;

import Impl.advancedMediaPlayer.Mp4Player;
import Impl.advancedMediaPlayer.VlcPlayer;
import Interface.AdvancedMediaPlayer;
import Interface.MediaPlayer;

/**
 * MediaPlayer 接口的实体类。
 * Created by 李伟民 on 17/7/18.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}