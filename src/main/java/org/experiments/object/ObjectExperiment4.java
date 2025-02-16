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
public class ObjectExperiment4 {

    public int doSmthComplex(SomeService arg1) {

        String s = arg1.getStringValue();
        if (s == null) {
            return 301;
        } else if (s.length() < arg1.getIntValue()) {
            return 200;
        }
        return 100;
    }

}