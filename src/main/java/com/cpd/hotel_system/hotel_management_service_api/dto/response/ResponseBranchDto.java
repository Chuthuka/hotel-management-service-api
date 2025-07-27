package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBranchDto {
    private String branchId;
    private String branchName;
    private String branchType;
    private int roomCount;
    private String hotelId;
    private String addressId;
}
