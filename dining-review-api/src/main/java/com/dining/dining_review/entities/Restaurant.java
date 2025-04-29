package com.dining.dining_review.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="RESTAURANTS")
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long uuid;

    @Column(name="Name")
    @Getter @Setter
    private String name;

    @Column(name="Theme")
    @Getter @Setter
    private String theme;

    @Column(name="AverageScore")
    @Getter @Setter
    private String averageScore;

    @Column(name="City")
    @Getter @Setter
    private String city;

    @Column(name="Description")
    @Getter @Setter
    private String description;

}
