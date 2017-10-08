package player;
/*Player 1.

Has a final price (specified in the designer) and a getter

Has only 1 song (you can not declare this variable in the class of this player)

playSong Can play the song.*/
public class Pleer1 extends Playsong {


    public Pleer1(String songName, int price) {
        super(songName, price);

    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + songName);
    }
}
