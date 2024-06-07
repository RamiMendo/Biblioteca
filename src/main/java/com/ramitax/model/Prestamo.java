package com.ramitax.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prestamo")
@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Socio socio;

    @Column(nullable = false)
    private LocalDate fecha_prestamo;

    @Column(nullable = false)
    private LocalDate fecha_devolucion;

    @Column(nullable = false)
    private LocalDate fecha_tope;
}
