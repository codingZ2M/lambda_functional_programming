package lambda_functional_programming.songfilter.function_composition;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lambda_functional_programming.songfilter.model.Song;

public class MusicPlayer {
    public static void main(String[] args) {
    	
        PlayList playList = new PlayList();
        playList.addSong(new Song("Song 1", "Artist A", 240));
        playList.addSong(new Song("Song 2", "Artist B", 180));
        playList.addSong(new Song("Song 3", "Artist C", 300));

        
        // Define functional components
        Predicate<Song> isLongSong = song -> song.getDurationInSeconds() > 240;
        Function<Song, String> songDescription = song -> song.toString();
        Consumer<String> playSong = description -> System.out.println("Now playing: " + description);

        
        // Function composition using Java's Stream API, to play long songs from the playlist
        List<String> longSongs = playList.getSongs().stream()
                .filter(isLongSong)
                .map(songDescription)
                .peek(playSong)
                .collect(Collectors.toList());
    }
}
