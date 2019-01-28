package com.nobutnk.mapper.examples.simple;

import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
	SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
