package player;

import java.util.Arrays;

public class Pleer3 extends PlayAllSongs{


    public Pleer3( String[] playlist, int price) {
        super(playlist, price);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[0]);
    }


    public void playAllsong(){
        System.out.println("playing all songs: " + Arrays.asList(playlist));
    }

}
