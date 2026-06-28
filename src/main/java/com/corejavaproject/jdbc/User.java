package com.corejavaproject.jdbc;

import java.util.Date;

import java.time.LocalDate;

public record User(String firstName, String lastName, String email, LocalDate hireDate) {

}