package mk.ukim.finki.wp.lab.service;

import java.util.List;
import mk.ukim.finki.wp.lab.model.Artist;

public interface ArtistService{
    List<Artist> listArtists();
    Artist findById(Long id);
}
