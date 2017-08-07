package player;

public class Playsong {

    String songName;
    final  int price;



    public Playsong(String songName, int price) {
        this.songName = songName;
        this.price = price;

    }
    public void playSong() {
        System.out.println("Playing: " + songName);

    }

    public int getPrice(){
        return price;
    }


}
