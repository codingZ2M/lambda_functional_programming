package lambda_functional_programming.songfilter.consumer;

import java.util.function.Consumer;

import lambda_functional_programming.songfilter.model.Song;

public class PlayMusic {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // Create songs and add them to the playlist
        Song song1 = new Song("Song1", "Artist1", 240);
        Song song2 = new Song("Song2", "Artist2", 180);
        Song song3 = new Song("Song3", "Artist3", 300);
        

        // Create song consumers
        Consumer<Song> songConsumer = song -> 
        								System.out.println("Now playing: " + song.getTitle() + " | Artist: " + song.getArtist());
      

        // Add song consumers to the player
        player.addSongConsumer(songConsumer);
      

        // Play all songs in the playlist
        player.playSong(song3);
    }
}