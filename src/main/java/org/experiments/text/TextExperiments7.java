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
public class TextExperiments7 {

    public int doSmthComplex(String arg1) {

        if (arg1.contains("IL")) {
            if (arg1 == null) {
                return 50;
            } else{
                return 'F';
            }
        }
        return 90;
    }

}