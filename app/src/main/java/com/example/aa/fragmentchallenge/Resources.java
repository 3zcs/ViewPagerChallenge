package com.example.aa.fragmentchallenge;

import java.util.ArrayList;

/**
 * Created by aa on 12/10/17.
 */

public class Resources {
    String name;
    String resourceType;

    public Resources(String name, String resourceType) {
        this.name = name;
        this.resourceType = resourceType;
    }


    public String getResourceType() {

        return resourceType;
    }

    public String getName() {
        return name;
    }

}
