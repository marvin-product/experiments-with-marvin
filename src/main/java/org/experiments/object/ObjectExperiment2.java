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
public class ObjectExperiment2 {

    public int doSmth(SomeService arg1, String arg2, int arg3) {

        if (30 < arg1.getGreaterIntValue(arg3)) {
            String s = arg1.getLongerStringValue(arg2);
            if (5 > s.length()) {
                return 66;
            }
        }
        return 45;
    }

}