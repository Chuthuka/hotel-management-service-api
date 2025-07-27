package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.AddressPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

public interface AddressService {
    public void create (RequestAddressDto dto);
    public void update (RequestAddressDto dto, String AddressId);
    public void delete (String addressId);
    public ResponseAddressDto findById (String addressId);
    public ResponseAddressDto findByBranchId (String branchId);

}
