/*
 * #%L
 * Errai Prototype
 * %%
 * Copyright (C) 2015 - 2017 Doltech
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.insclix.mvc.server.config.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.*;

public class JsonObjectMapper extends ObjectMapper {

    public JsonObjectMapper() {
        SerializationConfig serialConfig = getSerializationConfig()
                .without(SerializationFeature.FAIL_ON_EMPTY_BEANS);

        DeserializationConfig deSerialConfig = getDeserializationConfig()
                .without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        this.setConfig(serialConfig);
        this.setConfig(deSerialConfig);

        this.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }
}