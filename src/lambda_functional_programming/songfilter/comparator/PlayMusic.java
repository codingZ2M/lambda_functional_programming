package lambda_functional_programming.songfilter.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lambda_functional_programming.songfilter.model.Song;

public class PlayMusic {

	public static void main(String[] args) {
		
        // Create a playlist of songs
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", 240));
        playlist.add(new Song("Song2", "Artist2", 180));
        playlist.add(new Song("Song3", "Artist3", 300));
        playlist.add(new Song("Song4", "Artist2", 200));
        playlist.add(new Song("Song5", "Artist1", 270));

        // Create a music player with the playlist
        MusicPlayer player = new MusicPlayer(playlist);

        
        // Define a comparator to sort songs by duration in ascending order using Method Reference
      Comparator<Song> durationComparator = Comparator.comparingInt(Song::getDurationInSeconds);
       // Comparator<Song> durationComparator = Comparator.comparingInt(song -> song.getDurationInSeconds());
        
        // Play songs sorted by duration
        System.out.println("Playing songs sorted by duration (ascending order):");
        player.playSongs(durationComparator);

        
        // Define a comparator to sort songs by artist
        Comparator<Song> artistTitleComparator = Comparator
                .comparing(Song::getArtist);
               

        
        // Play songs sorted by artist and then by title
        System.out.println("\nPlaying songs sorted by artist and then by title:");
        player.playSongs(artistTitleComparator);
    }
}
