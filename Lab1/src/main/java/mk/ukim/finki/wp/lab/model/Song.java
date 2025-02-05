package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Song {
    @Id
    String trackId;
    String title;
    String genre;
    int releaseYear;
    List<Artist> performers;
}