package lambda_functional_programming.songfilter.function_composition;

import java.util.ArrayList;
import java.util.List;

import lambda_functional_programming.songfilter.model.Song;

public class PlayList {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }
}
