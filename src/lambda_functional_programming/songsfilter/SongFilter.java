package lambda_functional_programming.songsfilter;

import lambda_functional_programming.songfilter.model.Song;

//Custom functional interface for filtering songs
@FunctionalInterface
interface SongFilter {
	
    boolean filter(Song song);
    
}