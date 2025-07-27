package com.cpd.hotel_system.hotel_management_service_api.entity;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "room_count")
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type", nullable = false)
    private BranchType branchType;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Room> rooms;

    // Getters and setters omitted for brevity
}
