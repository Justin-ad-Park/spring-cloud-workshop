package com.elevenst.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ClientConfiguration {

	@Value("${api.version}")
	private String apiVersion;

	public String getAPIVersion() {
		return this.apiVersion;
	}

}
