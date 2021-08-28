/**
 * Criterion.
 */
package org.onosproject.test.handledata.models;

public class Criteria {
    public String type;
    public long port;
    public String mac;

    public Criteria() {}

    public Criteria(String mac, String type, long port) {
        this.mac = mac;
        this.type = type;
        this.port = port;
    }
}
