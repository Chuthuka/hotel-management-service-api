package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_id", nullable = false, length = 80)
    private String roomId;

    @Column(name = "room_number", length = 80)
    private String roomNumber;

    @Column(name = "room_type")
    private int type;  // Consider changing to enum if appropriate

    @Column(name = "bed_count")
    private int bedCount;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "is_available")
    private Boolean isAvailable;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Facility> facilities;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<RoomImage> roomImages;

    // Getters and setters omitted for brevity
}
