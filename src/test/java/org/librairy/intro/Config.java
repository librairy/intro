/*
 * Copyright (c) 2016. Universidad Politecnica de Madrid
 *
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 *
 */

package org.librairy.intro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@Configuration("org.librairy.harvester.intro")
@ComponentScan({"org.librairy"})
@PropertySource({"classpath:boot.properties"})
public class Config {
}
