package com.ramitax.model;

import com.ramitax.enumerated.Editorial;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libro")
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false)
    private Editorial editorial;

    @Column(nullable = false)
    private LocalDate A_Escritura;

    @Column(nullable = false)
    private LocalDate A_Edicion;
}
