package org.globant.talentodigital.telefonica.restController;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExceptionMessage {
    private int statusCode;
    private LocalDate timestamp;
    private String message;
}
