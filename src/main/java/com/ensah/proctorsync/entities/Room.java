package com.ensah.proctorsync.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.UUID;


@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor @ToString
public class Room {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private int capacity;

    @OneToMany(mappedBy = "room")
    private Collection<Monitoring> monitoring;

}
