/*Has a final price (specified in the designer) and a getter
Has a playlist
playSong Can play the first song
playAllSongs can play all songs from the end of the playlist to the beginning*/


package player;

import java.util.Arrays;

public class Pleer5 extends PlayAllSongs{


    public Pleer5( String[] playlist, int price) {
            super(playlist, price);;
        }

        @Override
        public void playSong(){
            System.out.println("Playing: " + playlist[0]);
        }

    public void playAllsong(){

        String n1 = playlist[0];
        playlist[0] = playlist[2];
        playlist[2] = n1;

        System.out.println("All songs are playing from the end to the beginning: " + Arrays.asList(playlist));
    }
}
