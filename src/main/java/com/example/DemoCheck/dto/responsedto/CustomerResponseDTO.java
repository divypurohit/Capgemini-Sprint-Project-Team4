package com.example.DemoCheck.dto.responsedto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CustomerResponseDTO(

        Integer customerId,

        String companyName,

        String contactName,

        String city,

        String country,

        Long ordersCount,

        LocalDate lastOrderDate,

        BigDecimal creditLimit,

        String customerTier
) {}