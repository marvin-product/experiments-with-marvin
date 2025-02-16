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
public class ObjectExperiment5 {

     public int doSmthComplex(SomeService arg1, String arg2, SomeService arg4) {

        SomeService s1 = arg1;
        if (s1 != null) {
            SomeService s2 = s1;
            if (s2.getIntValue() > 16) {
                return 101;
            }
            return arg4.getIntValue();
        }
        String r = arg4.getStringValue();
        return r.length();
    }

}