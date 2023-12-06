package by.cinema.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private UUID id;
    private String firstname;
    private String surname;
    private int age;
    private  String login;
    private  String password;
    private  UserRole userRole;
}
