package com.erdaldalkiran.axonpoc.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

public record SelectProductCommand(@TargetAggregateIdentifier UUID foodCartId, UUID productId, Integer quantity) {
}

