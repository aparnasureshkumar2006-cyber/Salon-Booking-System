package com.aparna.service;

import com.aparna.domain.BookingStatus;
import com.aparna.dto.BookingRequest;
import com.aparna.dto.SalonDTO;
import com.aparna.dto.ServiceDTO;
import com.aparna.dto.UserDTO;
import com.aparna.model.Booking;
import com.aparna.model.SalonReport;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface BookingService {

    Booking createBooking(BookingRequest booking, UserDTO user, SalonDTO salon, Set<ServiceDTO> serviceDTOSet) throws Exception;
    List<Booking> getBookingsByCustomer(Long customerId);
    List<Booking> getBookingsBySalon(Long salonId);
    Booking getBookingById(Long id) throws Exception;
    Booking updateBooking(Long bookingId, BookingStatus status) throws Exception;
    List<Booking> getBookingsByData(LocalDate data,Long salonId);
    SalonReport getSalonReport(Long salonId);
}
