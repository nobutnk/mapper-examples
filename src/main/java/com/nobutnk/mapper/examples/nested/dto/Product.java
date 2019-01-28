package com.nobutnk.mapper.examples.nested.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {
	private String itemName;
	private String description;
	private Integer price;
}
