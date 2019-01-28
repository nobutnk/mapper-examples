package com.nobutnk.mapper.examples.nested.dto;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NestedProductMapper {
	
	@Mapping(source = "children", target = "childList")
	ParentDestination sourceToDestination(ParentSource source);
	
	default List<ChildDestination> childList(List<ChildSource> children) {
        if (children == null || children.isEmpty()) {
            return null;
        }
        ChildMapper mapper = Mappers.getMapper(ChildMapper.class);
        List<ChildDestination> childList = mapper.sourceToDestinationList(children);
        
        return childList;
    }

}
