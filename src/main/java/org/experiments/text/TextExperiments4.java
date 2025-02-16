package org.experiments.text;

/**
 * Please check README file before do something - this will help.
 *
 * The class contains examples of business logic focused on operations with test and symbols.
 * To see unit tests generation You can try them or make any modifications in scope of available capabilities of the
 * product.
 *
 * In context of operations with text the product supports:
 * <ul>
 *  <li>char data type</li>
 *  <li>String data type (with part of methods)</li>
 *  <li>operations with char values</li>
 *  <li>part of operations with String values:
 *  <ul>
 *      <li>operator +</li>
 *      <li>method chatAt</li>
 *      <li>method length</li>
 *      <li>method concat</li>
 *      <li>method equals</li>
 *      <li>method contains</li>
 *  </ul></li>
 * </ul>
 */
public class TextExperiments4 {

    public static String doSmthComplex(short arg1, String arg2) {

        String r = null;
        if (arg2.length() < 6) {
            return  "result " + arg1;
        } else if (arg1 > 30) {
            r = "symbol";
        }
        return r;
    }

}