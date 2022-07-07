package com.boot.proj.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

//creating custom endpoint for actuator

@Component
@Endpoint(id = "custom")
public class CustomEndpoints {

	@ReadOperation
	public Map<String, String> customEndpoint(String id) {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		return map;
	}
}
