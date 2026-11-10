package org.example.parkinglot.entities;

import jakarta.persistence.*;

@Entity
public class Exemple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String licensePlate;

    // getters and setters
}