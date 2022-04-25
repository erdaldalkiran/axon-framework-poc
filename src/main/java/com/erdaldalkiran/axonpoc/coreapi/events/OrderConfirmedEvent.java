package com.erdaldalkiran.axonpoc.coreapi.events;

import java.util.UUID;

public record OrderConfirmedEvent(UUID foodCartId) {
}

