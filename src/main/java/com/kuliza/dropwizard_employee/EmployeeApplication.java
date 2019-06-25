package com.kuliza.dropwizard_employee;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeApplication extends Application<Configuration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeApplication.class);

    public static void main(String[] args) throws Exception {
        new EmployeeApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        //used for registering the resource
        LOGGER.info("Registering REST resources");
        environment.jersey().register(new EmployeeRestController(environment.getValidator()));
    }
}
