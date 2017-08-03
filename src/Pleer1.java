public class Pleer1 extends Playsong {

    final int price = 100;


    public Pleer1(String songName) {
        super(songName);
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + songName);
    }
}
