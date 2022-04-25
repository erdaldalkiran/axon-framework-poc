package com.erdaldalkiran.axonpoc.coreapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

public record ConfirmOrderCommand(@TargetAggregateIdentifier UUID foodCartId) {
}

