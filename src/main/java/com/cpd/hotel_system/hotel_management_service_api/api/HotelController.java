package com.cpd.hotel_system.hotel_management_service_api.api;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.util.StandardResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/user/create")
    public ResponseEntity<StandardResponseDto> create(
            @RequestBody RequestHotelDto dto){
             hotelService.create(dto);
             return new ResponseEntity<>(
                     new StandardResponseDto(
                             201,"Hotel Saved!!",null
                     ),
                     HttpStatus.CREATED
             );
    }


    @PutMapping("/admin/update/{id}")
    public ResponseEntity<StandardResponseDto> update(
            @PathVariable ("id") String hotelId,
            @RequestBody RequestHotelDto dto){
        hotelService.update(dto,hotelId);
        return new ResponseEntity<>(
                new StandardResponseDto(
                        201,"Hotel Updated!!",null
                ),
                HttpStatus.CREATED
        );
    }


    @DeleteMapping("/host/delete/{id}")
    public ResponseEntity<StandardResponseDto> delete(
            @PathVariable ("id") String hotelId) {
        hotelService.delete(hotelId);
        return new ResponseEntity<>(
                new StandardResponseDto(
                        204, "Hotel Deleted!!", null
                ),
                HttpStatus.NO_CONTENT
        );
    }


    @GetMapping("/visitor/find-by-id/{id}")
    public ResponseEntity<StandardResponseDto> findById(
            @PathVariable ("id") String hotelId) {
        return new ResponseEntity<>(
                new StandardResponseDto(
                        200, "Hotel Found!!", hotelService.findById(hotelId)
                ),
                HttpStatus.OK
        );
    }


    @GetMapping("/visitor/find-all")
    public ResponseEntity<StandardResponseDto> findAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size){
        return new ResponseEntity<>(
                new StandardResponseDto(
                        200, "Hotel List!!", hotelService.findAll(page,size,searchText)
                ),
                HttpStatus.OK
        );
    }
}
