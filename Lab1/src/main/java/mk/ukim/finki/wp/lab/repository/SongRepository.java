package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> songs = new ArrayList<>(List.of(
            new Song("1", "Still Need Horizon", "dance", 2001, new ArrayList<>()),
            new Song("2", "DJ Matter", "techno", 2002, new ArrayList<>()),
            new Song("3", "Sailors Aria", "house", 2003, new ArrayList<>()),
            new Song("4", "Tropical Imagination", "metal", 2004, new ArrayList<>()),
            new Song("5", "Chill Dream", "rock", 2005, new ArrayList<>())
    ));



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
