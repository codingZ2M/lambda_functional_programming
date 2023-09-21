package lambda_functional_programming.songfilter.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import lambda_functional_programming.songfilter.model.Song;
public class PlayMusic {

	 public static void main(String[] args) {
	        // Create a supplier that generates a playlist of songs
	        Supplier<List<Song>> playlistSupplier = () -> {
	            List<Song> playlist = new ArrayList<>();
	            playlist.add(new Song("Song1", "Artist1", 240));
	            playlist.add(new Song("Song2", "Artist2", 180));
	            playlist.add(new Song("Song3", "Artist3", 300));
	            return playlist;
	        };

	        // Create a music player with the playlist supplier
	        MusicPlayer player = new MusicPlayer(playlistSupplier);

	        // Play songs from the generated playlist
	        System.out.println("Playing songs from the generated playlist:");
	        player.playSongs();
	    }
}
