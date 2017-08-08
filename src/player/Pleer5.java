/*Имеет final цену(задается в конструкторе) и геттер
Имеет плейлист
playSong Может проиграть первую песню
playAllSongs может проиграть все песни с конца плейлиста в начало*/


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

        System.out.println("Проигрываются все песни c конца в начало: " + Arrays.asList(playlist));
    }
}
