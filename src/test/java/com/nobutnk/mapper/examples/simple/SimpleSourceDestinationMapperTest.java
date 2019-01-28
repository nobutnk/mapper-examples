package com.nobutnk.mapper.examples.simple;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.nobutnk.mapper.examples.simple.SimpleDestination;
import com.nobutnk.mapper.examples.simple.SimpleSource;
import com.nobutnk.mapper.examples.simple.SimpleSourceDestinationMapper;

public class SimpleSourceDestinationMapperTest {

	private SimpleSourceDestinationMapper mapper
		= Mappers.getMapper(SimpleSourceDestinationMapper.class);

	@Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");
        SimpleDestination destination = mapper.sourceToDestination(simpleSource);
  
        assertThat(destination.getName(),
        		is(simpleSource.getName()));
        assertThat(destination.getDescription(), 
        		is(simpleSource.getDescription()));
    }
	
    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");
        SimpleSource source = mapper.destinationToSource(destination);
        assertThat(source.getName(), is(destination.getName()));
        assertThat(source.getDescription(),
        		is(destination.getDescription()));
    }
}
