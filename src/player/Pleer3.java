public class Pleer3 extends PlayAllSongs{

    final int price = 300;


    public Pleer3(String songName, String[] playlist) {
        super(songName, playlist);;
    }

    @Override
    public void playSong(){
        System.out.println("Playing: " + playlist[1]);
    }

    public void playAllsong(){
        System.out.println("Проигрываются все песни: " + playlist);
    }

}
