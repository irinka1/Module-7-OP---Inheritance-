package player;

public class PlayAllSongs {

    String songName;

    String[] playlist;

    public PlayAllSongs(String[] playlist) {
        this.playlist =  playlist;

    }

      public void playSong() {
        System.out.println("Playing: " + songName);

    }

    public void playAllsong(){
        System.out.println(playlist);
    }
}
