/*Has a final price (specified in the designer) and a getter
Has a playlist
playSong Can play the last song
playAllSongs can play all songs
*/

package player;

import java.util.Arrays;

public class Pleer4 extends PlayAllSongs{

    public Pleer4( String[] playlist, int price) {
        super(playlist, price);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[2]);
    }


    public void playAllsong(){
        System.out.println("All songs are playing: " + Arrays.asList(playlist));
    }

}

