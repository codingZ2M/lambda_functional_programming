package lambda_functional_programming.songfilter.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lambda_functional_programming.songfilter.model.Song;

class MusicPlayer {
 
    private List<Consumer<Song>> songConsumers;

    public MusicPlayer() {
        songConsumers = new ArrayList<>();
    }

  
    // Add a song consumer to the list
    public void addSongConsumer(Consumer<Song> songConsumer) {
        songConsumers.add(songConsumer);
    }

    // Play a song and apply all registered song consumers
    public void playSong(Song song) {
        for (Consumer<Song> songConsumer : songConsumers) {
            songConsumer.accept(song);
        }
    }
 
}
