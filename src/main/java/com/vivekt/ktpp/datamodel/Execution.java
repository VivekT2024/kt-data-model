package com.vivekt.ktpp.datamodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Execution {
    String executionId;
    String orderId;
    Integer quantity;
    Integer price;
    String side;
}
