package com.sovisrushain.auth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "super_hero")
@NoArgsConstructor
@AllArgsConstructor
public class SuperHero implements Serializable {
    @Id
    private int id;
    private String name;
}
