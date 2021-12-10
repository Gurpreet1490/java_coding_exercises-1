package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    final int INCREMENT_SECONDS = 1000000000;
    private LocalDateTime localDateTime;

    public Exercise004(LocalDate date) {
        this.localDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return localDateTime.plusSeconds(INCREMENT_SECONDS);
    }
}
