package lambda_functional_programming.songsfilter;

import java.util.ArrayList;
import java.util.List;

import lambda_functional_programming.songfilter.model.Song;

public class PlayMusic {
    public static void main(String[] args) {
    	
        // Create a playlist of songs
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", 240));
        playlist.add(new Song("Song2", "Artist2", 180));
        playlist.add(new Song("Song3", "Artist3", 300));
        playlist.add(new Song("Song4", "Artist4", 200));
        playlist.add(new Song("Song5", "Artist5", 270));

        
        // Define custom filters using lambda expressions and the SongFilter interface
        SongFilter filterByDuration = song -> song.getDurationInSeconds() > 240;
        SongFilter filterByArtist = song -> song.getArtist().equals("Artist3");

        
        // Apply filters to the playlist
        List<Song> filteredSongsByDuration = filterSongs(playlist, filterByDuration);
        List<Song> filteredSongsByArtist = filterSongs(playlist, filterByArtist);

        
        // Print the filtered songs
        System.out.println("Songs with duration greater than 4 minutes:");
        filteredSongsByDuration.forEach(song -> System.out.println(song));


        System.out.println("\nSongs by Artist3:");
        filteredSongsByArtist.forEach(song -> System.out.println(song));
    }

    
    // Custom method to filter songs based on a provided filter with higher-order function
    public static List<Song> filterSongs(List<Song> playlist, SongFilter filter) {
        List<Song> filteredSongs = new ArrayList<>();
        for (Song song : playlist) {
            if (filter.filter(song)) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }
    
}