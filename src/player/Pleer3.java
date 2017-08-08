package player;

import java.util.Arrays;

public class Pleer3 extends PlayAllSongs{

    final int price = 300;


    public Pleer3( String[] playlist) {
        super(playlist);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[0]);
    }


    public void playAllsong(){
        System.out.println("Проигрываются все песни: " + Arrays.asList(playlist));
    }

}
