package com.springswagger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "vermeg")
@Getter
@Setter
@NoArgsConstructor
public class vermeg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
private String name;
    @Column(nullable = false, length = 100)
private  String lastname;
    @Column(nullable = false, length = 100)
private String email;

}
