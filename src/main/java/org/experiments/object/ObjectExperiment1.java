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
public class ObjectExperiment1 {

    public SomeService doSmth(SomeService arg1, int arg2) {

        int v = arg1.getIntValue() + 10 + arg2;
        arg1.getGreaterIntValue(v);
        return arg1;
    }

}