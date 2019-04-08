package com.eden.service;

import com.eden.LogLevelProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @created by eden
 * @since 2019-04-04 下午 5:10:53
 */

public class LogLevelService {

    @Autowired
    LogLevelProperties logLevelProperties;

    public String getLogLevel(){
        return logLevelProperties.getLevel();
    }
}
