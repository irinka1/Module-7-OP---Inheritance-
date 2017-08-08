/*Имеет final цену(задается в конструкторе) и геттер
Имеет плейлист
playSong Может проиграть последнюю песню
playAllSongs может проиграть все песни
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
        System.out.println("Проигрываются все песни: " + Arrays.asList(playlist));
    }

}

