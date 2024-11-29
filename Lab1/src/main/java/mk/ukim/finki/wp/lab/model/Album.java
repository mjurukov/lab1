package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Album {
    @Id
    private Long id;
    private String name;
    private String genre;
    private String releaseYear;
    private List<Song> songs;
}
