package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create (RequestRoomImageDto dto);
    public void update (RequestRoomImageDto dto, String RoomImageId);
    public void delete (String RoomImageId);
    public ResponseRoomImageDto findById (String RoomImageId);
    public RoomImagePaginateResponseDto findAll (int page, int size, String roomId);
}
