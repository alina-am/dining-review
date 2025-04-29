package com.dining.dining_review.entities;

import com.dining.dining_review.enums.ReviewStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="REVIEWS")
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long uuid;

    @Column(name="Reviewer")
    @Getter @Setter
    private String reviewer;

    @Column(name="Restaurant")
    @Getter @Setter
    private String restaurantId;

    @Column(name="Score")
    @Getter @Setter
    private float score;

    @Column(name="Comment")
    @Getter @Setter
    private String comment;

    @Column(name="Status")
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private ReviewStatusEnum status;

}
