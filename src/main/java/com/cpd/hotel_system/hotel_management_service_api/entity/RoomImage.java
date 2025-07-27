package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room_image")
public class RoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    // Getters and setters omitted for brevity
}
