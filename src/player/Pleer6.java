/*Плеер 6.
Has a final price (specified in the designer) and a getter
Has a playlist
playSong Can play the first song
playAllSongs can play all songs
Has a method public void shuffle () - mixes all songs in the playlist in places
*/

package player;

import java.util.Arrays;
import java.util.Random;

public class Pleer6 extends PlayAllSongs{

    public Pleer6( String[] playlist, int price) {
        super(playlist, price);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllsong(){

        System.out.println("Playing all sings: " + Arrays.asList(playlist));
    }
    public void shuffle(){
        Random rnd = new Random();
        for (int i = 1; i <2; i++) {
            int j = rnd.nextInt(i);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;

            System.out.println("All sings are mixed: " + Arrays.asList(playlist));
        }
    }

}



