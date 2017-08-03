public class PlayAllSongs {

    String songName;

    String[] playlist = new String[] {"The best song", "Good song", "Super Song"};

    public PlayAllSongs(String songName, String[] playlist) {
        this.songName = songName;
        this.playlist =  playlist;

    }

      public void playSong() {
        System.out.println("Playing: " + songName);

    }

    public void playAllsong(){
        System.out.println(playlist);
    }
}
