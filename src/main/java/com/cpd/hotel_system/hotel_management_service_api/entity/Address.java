package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private String addressId;

    @Column(name = "address_line", nullable = false, length = 250)
    private String addressLine;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "country", nullable = false, length = 100)
    private String country;

    @Column(name = "latitude", precision = 10, scale = 7)
    private BigDecimal latitude;

    @Column(name = "longitude", precision = 10, scale = 7)  // Fixed typo
    private BigDecimal longitude;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Branch branch;

    // Getters and setters omitted for brevity
}
