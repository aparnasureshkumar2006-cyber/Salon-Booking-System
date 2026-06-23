package com.aparna.service;

import com.aparna.dto.CategoryDTO;
import com.aparna.dto.SalonDTO;
import com.aparna.dto.ServiceDTO;
import com.aparna.model.ServiceOffering;

import java.util.Set;

public interface ServiceOfferingService {

    ServiceOffering createService(SalonDTO salonDTO, ServiceDTO serviceDTO, CategoryDTO categoryDTO);
    ServiceOffering updateService(Long serviceId,ServiceOffering service) throws Exception;
    Set<ServiceOffering> getAllServiceBySalonId(Long salonId, Long categoryId);
    Set<ServiceOffering> getServiceByIds(Set<Long> ids);
    ServiceOffering getServiceById(Long id) throws Exception;
}
