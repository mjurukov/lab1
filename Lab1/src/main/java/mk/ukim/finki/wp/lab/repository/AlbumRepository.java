package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    private List<Album> albums;

    public AlbumRepository() {
        this.albums = new ArrayList<>(List.of(
                new Album(1L, "Dance Fever", "Dance", "2001", new ArrayList<>()),
                new Album(2L, "Techno Beats", "Techno", "2002", new ArrayList<>()),
                new Album(3L, "House Vibes", "House", "2003", new ArrayList<>()),
                new Album(4L, "Metal Rage", "Metal", "2004", new ArrayList<>()),
                new Album(5L, "Rock Ballads", "Rock", "2005", new ArrayList<>())
        ));
    }

    public List<Album> findAll() {
        return albums;
    }
}
