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
public class ArithmeticalExperiment6 {

    public int doSmthComplex(int arg1, int arg2) {

        int m = arg1 * arg2;
        int c = 0;
        if (m > 1200) {
            c = 1;
            if (arg2 > 4) {
                return 5;
            }
        }
        return c;
    }

}