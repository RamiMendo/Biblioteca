package com.ramitax.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ejemplar")
@Entity
public class Ejemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Libro libro;

    @Column(nullable = false)
    private Integer numero_ejemplar;

    @Column(nullable = false)
    private Boolean deteriorado;

    @Column(nullable = false)
    private Boolean prestado;
}
