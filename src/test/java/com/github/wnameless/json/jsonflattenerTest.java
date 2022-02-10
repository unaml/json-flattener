package com.github.wnameless.json;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.github.wnameless.json.flattener.JsonFlattener;

class jsonflattenerTest {

    @Test
    public void flattenInput() {
        String input = "{\"a\": 1, \"b\": true,\"c\": {\"d\": 3, \"e\": \"test\"}}";
        String expected = "{\"a\":1,\"b\":true,\"c.d\":3,\"c.e\":\"test\"}";
        assertEquals(expected, JsonFlattener.flatten(input));
    }

    @Test
    public void flattenInputGivenZeroReturnsEmpty() {

    }
}
