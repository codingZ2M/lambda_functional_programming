package lambda_functional_programming.songfilter.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lambda_functional_programming.songfilter.model.Song;

class MusicPlayer {
    private List<Song> playlist;

    public MusicPlayer() {
        playlist = new ArrayList<>();
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        playlist.add(song);
    }

    // Play songs that match the given predicate
    public void playFilteredSongs(Predicate<Song> filter) {
        for (Song song : playlist) {
            if (filter.test(song)) {
                System.out.println("Now playing: " + song.getTitle());
            }
        }
    }
}