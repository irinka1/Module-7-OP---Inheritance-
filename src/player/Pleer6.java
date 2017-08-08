/*Плеер 6.
Имеет final цену(задается в конструкторе) и геттер
Имеет плейлист
playSong Может проиграть первую песню
playAllSongs может проиграть все песни
Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами
*/

package player;

import java.util.Arrays;
import java.util.Random;

public class Pleer6 extends PlayAllSongs{

    final int price = 300;
    public Pleer6( String[] playlist) {
        super(playlist);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllsong(){

        System.out.println("Проигрываются все песни: " + Arrays.asList(playlist));
    }
    public void shuffle(){
        Random rnd = new Random();
        for (int i = 1; i <2; i++) {
            int j = rnd.nextInt(i);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;

            System.out.println("Все песни перемешались: " + Arrays.asList(playlist));
        }
    }

}



