package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomImageDto {
    private String roomId;
    private MultipartFile file;

}
