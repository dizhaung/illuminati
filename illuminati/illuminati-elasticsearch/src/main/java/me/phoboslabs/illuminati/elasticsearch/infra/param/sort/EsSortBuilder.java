/*
 * Copyright 2017 Phoboslabs.me
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.phoboslabs.illuminati.elasticsearch.infra.param.sort;

import me.phoboslabs.illuminati.common.util.StringObjectUtils;
import me.phoboslabs.illuminati.elasticsearch.infra.enums.EsOrderType;

import java.util.Map;

public class EsSortBuilder {

    private final EsSort esSort = new EsSort();

    public static EsSortBuilder Builder() {
        return new EsSortBuilder();
    }

    private EsSortBuilder () {

    }

    public EsSortBuilder setSort (EsOrderType orderType, String key) {
        String orderByString = orderType.getOrderType();

        if (StringObjectUtils.isValid(orderByString)) {
            this.esSort.setOrderDataToMap(key, orderByString);
        }

        return this;
    }

    public Map<String, String> build () {
        return this.esSort.getSort();
    }
}
