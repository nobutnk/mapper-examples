package com.nobutnk.mapper.examples.nested.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParentDestination {
	private List<ChildDestination> childList;

}
