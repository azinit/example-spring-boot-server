package ru.itis.demo.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: tech.kt impl

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lang;
    private String framework;
    private String developer;
}
