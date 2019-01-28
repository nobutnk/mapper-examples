package com.nobutnk.mapper.examples.nested;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.nobutnk.mapper.examples.nested.dto.ChildSource;
import com.nobutnk.mapper.examples.nested.dto.NestedProductMapper;
import com.nobutnk.mapper.examples.nested.dto.ParentDestination;
import com.nobutnk.mapper.examples.nested.dto.ParentSource;
import com.nobutnk.mapper.examples.nested.dto.Product;

public class NestedProductMapperTest {
	
	private NestedProductMapper mapper
	= Mappers.getMapper(NestedProductMapper.class);

@Test
public void givenSourceToDestination_whenMaps_thenCorrect() {
    ParentSource parentSource = new ParentSource();
    ChildSource childSource = new ChildSource();
    Product product = new Product("testName", "test description", Integer.valueOf(100));
    childSource.setProduct(product);
    List<ChildSource> children = new ArrayList<>();
    children.add(childSource);
    parentSource.setChildren(children);
    
    ParentDestination destination = mapper.sourceToDestination(parentSource);

    assertThat(destination.getChildList().get(0).getProduct().getItemName(),
    		is(parentSource.getChildren().get(0).getProduct().getItemName()));
}

}
