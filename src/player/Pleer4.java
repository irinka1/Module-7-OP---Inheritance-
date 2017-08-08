/*Имеет final цену(задается в конструкторе) и геттер
Имеет плейлист
playSong Может проиграть последнюю песню
playAllSongs может проиграть все песни
*/

package player;

import java.util.Arrays;

public class Pleer4 extends PlayAllSongs{

    final int price = 300;


    public Pleer4( String[] playlist) {
        super(playlist);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[2]);
    }


    public void playAllsong(){
        System.out.println("Проигрываются все песни: " + Arrays.asList(playlist));
    }

}

