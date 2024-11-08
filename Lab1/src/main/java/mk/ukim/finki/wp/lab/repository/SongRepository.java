package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

import java.util.List;

public class SongRepository {
    private List<Song> songs = List.of(
      new Song("1", "still need horizon", "dance", 2001, List.of()),
      new Song("1", "DJ Matter", "techno", 2002, List.of()),
      new Song("1", "Sailors Aria", "house", 2003, List.of()),
      new Song("1", "Tropical Imagination", "metal", 2004, List.of()),
      new Song("1", "chill dream", "rock", 2005, List.of())
    );

    public List<Song> findAll() {
        return songs;
    }

    public Song findByTrackId(String trackId) {
        return songs.stream().filter(song -> song.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistsToSong(Artist artist, Song song) {
        song.getPerformers().add(artist);
        return artist;
    }
}
