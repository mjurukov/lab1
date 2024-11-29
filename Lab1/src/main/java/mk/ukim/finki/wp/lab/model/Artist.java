package mk.ukim.finki.wp.lab.model;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Artist {
    @Id
    Long id;
    String firstName;
    String lastName;
    String bio;
}