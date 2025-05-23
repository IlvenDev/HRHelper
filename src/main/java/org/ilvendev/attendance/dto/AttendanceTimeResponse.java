package org.ilvendev.attendance.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.ilvendev.profiles.domain.Employee;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AttendanceTimeResponse {
    private Integer id;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;
    private Employee employee;
}
