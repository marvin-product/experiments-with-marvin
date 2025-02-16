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
public class ArithmeticalExperiment2 {

    public int doSmth(int arg1, int arg2, int arg3) {

        int r = arg1 + arg2++;
        if (r > -78) {
            return --arg3 + 45;
        }
        return -934;
    }

}