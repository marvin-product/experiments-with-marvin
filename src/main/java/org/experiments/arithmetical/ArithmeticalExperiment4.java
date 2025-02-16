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
public class ArithmeticalExperiment4 {

     public static int doSmthComplex(int arg1, boolean arg2) {

        int v = 10;
        if (arg1 < 5) {
            return 67;
        } else if (arg1 < 50) {
            if (arg2) {
                arg1 = arg1 + 30;
            } else {
                v = arg1 * 5;
            }
            if (v > 50) {
                return v;
            }
            return arg1;
        } else {
            return 29;
        }
    }

}