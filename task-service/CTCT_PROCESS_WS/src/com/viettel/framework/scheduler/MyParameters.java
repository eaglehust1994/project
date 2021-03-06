/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.framework.scheduler;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author qlmvt_MinhHT1
 */
public class MyParameters {

    Map<String, Object> counters = new HashMap<String, Object>();

    public void add(String counterName, Object value) {
        counters.put(counterName, value);
    }

    public Object getValue(String counterName) {
        return counters.get(counterName);
    }

    public void setValue(String counterName, Object value) {
        counters.remove(counterName);
        add(counterName, value);
    }

    public int size() {
        return counters.size();
    }

    public void printf() {
        System.out.println(this.getValue("counter"));
    }
}
