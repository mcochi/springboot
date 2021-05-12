package com.cochi.uploadfiles;

import com.cochi.uploadfiles.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadfilesApplication.class, args);
	}

}
