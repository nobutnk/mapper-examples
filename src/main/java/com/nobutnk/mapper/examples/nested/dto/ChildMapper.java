package com.nobutnk.mapper.examples.nested.dto;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ChildMapper {
	
	@Mapping(source = "product", target = "product")
	ChildDestination sourceToDestination(ChildSource source);
	

	List<ChildDestination> sourceToDestinationList(List<ChildSource> source);
}
