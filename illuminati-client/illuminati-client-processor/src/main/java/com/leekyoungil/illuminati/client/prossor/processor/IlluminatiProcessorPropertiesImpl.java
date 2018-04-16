package com.leekyoungil.illuminati.client.prossor.processor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leekyoungil.illuminati.common.properties.IlluminatiBaseProperties;
import com.leekyoungil.illuminati.common.properties.IlluminatiCommonProperties;
import com.leekyoungil.illuminati.common.properties.IlluminatiProperties;
import com.leekyoungil.illuminati.common.util.StringObjectUtils;

import java.util.Properties;

/**
 * Created by leekyoungil (leekyoungil@gmail.com) on 04/15/2018.
 *
 * Sample
 *  - chaosBomber: false (or true)
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IlluminatiProcessorPropertiesImpl extends IlluminatiBaseProperties {

    // * it is very dangerous function. it is activate when debug is true.
    // * after using this function. you must have to re compile.(clean first)
    private String chaosBomber;

    public IlluminatiProcessorPropertiesImpl (final Properties prop) {
        super(prop);
    }

    public String getChaosBomber() {
        return StringObjectUtils.isValid(this.chaosBomber) ? this.chaosBomber : "";
    }
}