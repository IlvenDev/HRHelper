package org.ilvendev.api.payroll.dto;

import lombok.Data;
import org.ilvendev.enums.PaymentStatus;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PaymentDTO {
    private int id;
    private String bankAccountNumber;
    private BigDecimal amount;
    private String currency;
    private PaymentStatus status;
    private Date dueDate;
    private Date paymentDate;

    // Getters and Setters
}
