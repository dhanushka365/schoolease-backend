package com.schoolease;

public record StudentRegistrationRequest(
        String firstName,
        String lastName,
        String email ) {
}
