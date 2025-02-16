package org.experiments.arithmetical;

/**
 * Please check README file before do something - this will help.
 *
 * The class contains examples of business logic focused on arithmetical operations.
 * To see unit tests generation You can try them or make any modifications in scope of available capabilities of the
 * product.
 *
 * In context of arithmetics the product supports:
 * <ul>
 *  <li>all numeric data types</li>
 *  <li>binary arithmetical operators (<b>+</b>, <b>-</b>, <b>*</b> and <b>/</b>)</li>
 *  <li>unary arithmetical operators (<b>++</b> and <b>--</b>)</li>
 *  <li>comparison operators (<b>==</b>, <b>!=</b>, <b>></b>, <b><</b>, <b>>=</b>, <b><=</b>)</li>
 * </ul>
 */
public class ArithmeticalExperiment5 {

    public int doSmthComplex(boolean flag, int arg1, int arg2) {

        int b = 11;
        int c = arg2 * arg1;
        if (arg2 != 105) {
            b = arg2 + 20 / arg1 - arg1 + 54 * arg1;
        } else {
            b = arg1 - 1 + arg2 / 2;
        }
        return arg1 + b + 10 * c - 15;
    }

}