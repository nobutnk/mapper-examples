package com.nobutnk.mapper.examples.nested;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.nobutnk.mapper.examples.nested.dto.ChildDestination;
import com.nobutnk.mapper.examples.nested.dto.ChildMapper;
import com.nobutnk.mapper.examples.nested.dto.ChildSource;
import com.nobutnk.mapper.examples.nested.dto.ParentDestination;
import com.nobutnk.mapper.examples.nested.dto.ParentSource;

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
