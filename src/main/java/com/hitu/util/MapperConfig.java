package com.hitu.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
	
	@Bean
	public ModelMapper getModelMapper() {
		 ModelMapper modelMapper = new ModelMapper();
		 modelMapper.getConfiguration().setSkipNullEnabled(true);
		 return modelMapper;
	}
}
