package mk.ukim.finki.wp.lab.repository;


import mk.ukim.finki.wp.lab.model.Artist;

import java.util.List;
import java.util.Optional;

public class ArtistRepository {
    private List<Artist> artists = List.of(
            new Artist(1L, "Troy", "Laurissa", "/"),
            new Artist(2L, "Delphia", "Alisha", "/"),
            new Artist(3L, "Vanessa", "Sherisse", "/"),
            new Artist(4L, "Madalyn", "Sonia", "/"),
            new Artist(5L, "Zena", "Moira", "/")
            );

    public List<Artist> findAll() {
        return artists;
    }

    public Optional<Artist> findById(Long id) {
        return artists.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }
}
