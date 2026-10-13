package com.raspberryspotify.backend.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.cloud.aws.s3")
public record StorageProperties(String bucket) {}
