package com.nobutnk.mapper.examples.nested;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.nobutnk.mapper.examples.nested.dto.ChildDestination;
import com.nobutnk.mapper.examples.nested.dto.ChildSource;

@Mapper
public interface ChildMapper {
	
	@Mapping(source = "product", target = "product")
	ChildDestination sourceToDestination(ChildSource source);
	

	List<ChildDestination> sourceToDestinationList(List<ChildSource> source);
}
