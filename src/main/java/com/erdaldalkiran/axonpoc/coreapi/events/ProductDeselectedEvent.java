package com.erdaldalkiran.axonpoc.coreapi.events;

import java.util.UUID;

public record ProductDeselectedEvent(UUID foodCartId, UUID productId, Integer quantity) {
}
