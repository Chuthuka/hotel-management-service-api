package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FileFormatter {

    @Column(name = "file_name", length = 255)
    private byte[] fileName;

    @Column(name = "resource_url", length = 500)
    private byte[] resourceUrl;

    @Column(name = "directory", length = 255)
    private byte[] directory;

    @Column(name = "hash", length = 64)
    private byte[] hash;

    // Getters and setters omitted for brevity
}
