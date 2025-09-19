package com.vivekt.ktpp.datamodel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Execution {
    String executionId;
    String orderId;
    Integer quantity;
    Integer price;
    String side;
}
