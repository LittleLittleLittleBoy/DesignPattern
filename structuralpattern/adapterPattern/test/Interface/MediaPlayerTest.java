package Interface;

import Impl.mediaPlayer.AudioPlayer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class MediaPlayerTest {
    @Test
    public void test(){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}