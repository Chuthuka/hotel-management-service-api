package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomDto {
    private String roomId;
    private int bedCount;
    private Boolean isAvailable;
    private BigDecimal price;
    private String roomType;
    private String roomNumber;
    private String branchId;

    //facilities
    private List<ResponseFacilityDto> facilities;

    //room images
    private List<ResponseRoomImageDto>roomImages;

}
