package com.erdaldalkiran.axonpoc.coreapi.events;

import java.util.UUID;

public record ProductSelectedEvent( UUID foodCartId, UUID productId, Integer quantity) {
}

