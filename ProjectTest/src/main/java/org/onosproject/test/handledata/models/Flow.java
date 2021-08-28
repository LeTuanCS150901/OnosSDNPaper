/**
 * Flow.
 */
package org.onosproject.test.handledata.models;

public class Flow {
    public int priority;
    public int timeout;
    public boolean isPermanent;
    public String deviceId;
    public Treatment treatment;
    public Selector selector;
}
