package lambda_functional_programming.songfilter.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lambda_functional_programming.songfilter.model.Song;

class MusicPlayer {
    private List<Song> playlist;

    public MusicPlayer(List<Song> playlist) {
        this.playlist = playlist;
    }

    // Sort and play songs from the playlist
    public void playSongs(Comparator<Song> comparator) {
        Collections.sort(playlist, comparator);
        for (Song song : playlist) {
            System.out.println("Now playing: " + song.getTitle());
        }
    }
}