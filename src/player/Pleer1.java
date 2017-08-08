package player;

public class Pleer1 extends Playsong {


    public Pleer1(String songName, int price) {
        super(songName, price);

    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + songName);
    }
}
