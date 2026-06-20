package com.aparna.mapper;

import com.aparna.modal.Salon;
import com.aparna.payload.dto.SalonDTO;

public class SalonMapper {

    public static SalonDTO mapToDTO(Salon salon){
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(salon.getId());
        salonDTO.setName(salon.getName());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setOwnerId(salon.getOwnerId());
        salonDTO.setPhoneNumber(salon.getPhoneNumber());
        salonDTO.setCity(salon.getCity());
        salonDTO.setImages(salon.getImages());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setEmail(salon.getEmail());
        return salonDTO;
    }
}
