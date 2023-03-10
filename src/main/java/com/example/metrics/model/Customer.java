package com.example.metrics.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record Customer(String name, UUID id) {
}
