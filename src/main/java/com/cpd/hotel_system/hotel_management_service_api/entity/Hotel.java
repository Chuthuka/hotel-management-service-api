package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "hotel_id")
    private String hotelId;

    @Column(name = "hotel_name", nullable = false, length = 100)
    private String hotelName;

    @Column(name = "star_rating", nullable = false)
    private int starRating;

    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "active_status", nullable = false)
    private Boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingFrom;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Branch> branches;

    // Getters and setters omitted for brevity
}
