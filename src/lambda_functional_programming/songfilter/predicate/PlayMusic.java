package lambda_functional_programming.songfilter.predicate;

import java.util.function.Predicate;

import lambda_functional_programming.songfilter.model.Song;

public class PlayMusic {

	 public static void main(String[] args) {
	        MusicPlayer player = new MusicPlayer();

	        // Create songs and add them to the playlist
	        Song song1 = new Song("Song1", "Artist1", 240);
	        Song song2 = new Song("Song2", "Artist2", 180);
	        Song song3 = new Song("Song3", "Artist3", 300);
	        player.addSong(song1);
	        player.addSong(song2);
	        player.addSong(song3);

	        // Define predicates for filtering songs
	        Predicate<Song> longDurationFilter = song -> song.getDurationInSeconds() > 200;
	        Predicate<Song> artistFilter = song -> song.getArtist().equals("Artist3");

	        // Play songs that match the predicates
	        System.out.println("Playing long duration songs:");
	        player.playFilteredSongs(longDurationFilter);

	        System.out.println("\nPlaying songs by Artist:");
	        player.playFilteredSongs(artistFilter);
	    }
}
