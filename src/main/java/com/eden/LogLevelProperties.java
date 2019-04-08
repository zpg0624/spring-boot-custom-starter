package com.eden;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @created by eden
 * @since 2019-04-04 下午 4:47:17
 */
@Data
@ConfigurationProperties(prefix = "log")
public class LogLevelProperties {

    private static String DEAFULT_LEVEL = "info";

    private String level = DEAFULT_LEVEL;
}
