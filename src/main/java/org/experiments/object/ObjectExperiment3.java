package org.experiments.object;

import org.service.SomeService;

/**
 * Please check README file before do something - this will help.
 *
 * The class contains examples of business logic with operation with objects of different classes. Any class except
 * String are being treated as third-party class and in case of some actions with instances of them mocks will be made.
 * To see unit tests generation You can try them or make any modifications in scope of available capabilities of the
 * product.
 */
public class ObjectExperiment3 {

    public SomeService doSmth(String arg1, SomeService arg2) {

        int v = arg2.getIntValue();
        SomeService r = null;
        if (v > arg1.length()) {
            r = arg2;
        }
        return r;
    }

}