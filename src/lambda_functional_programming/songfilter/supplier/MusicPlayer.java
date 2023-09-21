package lambda_functional_programming.songfilter.supplier;

import java.util.List;
import java.util.function.Supplier;

import lambda_functional_programming.songfilter.model.Song;

class MusicPlayer {
    private Supplier<List<Song>> playlistSupplier;

    public MusicPlayer(Supplier<List<Song>> playlistSupplier) {
        this.playlistSupplier = playlistSupplier;
    }

    // Get and play songs from the playlist
    public void playSongs() {
        List<Song> playlist = playlistSupplier.get();
        for (Song song : playlist) {
            System.out.println("Now playing: " + song.getTitle());
        }
    }
}
