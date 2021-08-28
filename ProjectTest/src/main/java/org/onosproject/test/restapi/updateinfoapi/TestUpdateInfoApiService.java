package org.onosproject.test.restapi.updateinfoapi;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Test update information api interface.
 */
public interface TestUpdateInfoApiService {

    /**
     * Update information about other controller.
     *
     * @param data String data to update
     * @return JSON representation
     */
    JsonNode updateData(String data);
}
