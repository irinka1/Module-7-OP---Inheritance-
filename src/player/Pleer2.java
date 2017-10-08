package player;
/*Player 2.

Has a final price (specified in the designer) and a getter

Has only 1 song (you can not declare this variable in the class of this player)

playSong Trying to play a song gives an error to the console - "error".*/
public class Pleer2 extends Playsong{

    public Pleer2(String songName, int price) {
        super(songName, price);
    }

    @Override
    public void playSong(){
        System.out.println("error");
    }
}
