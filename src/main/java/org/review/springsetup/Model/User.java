package org.review.springsetup.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Setter
@Getter
@Entity
@Table(name = "`users`")  // ✅ Plural = standard convention
public class User {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name.toUpperCase();
        this.email = email;
    }

    public User() {

    }

}
