/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.curator.x.discovery.details;

import org.apache.curator.x.discovery.ServiceInstance;

import java.util.List;

/**
 * Provides a set of available instances for a getGroup so that a strategy can pick one of them
 */
public interface InstanceProvider<T> {
    /**
     * Return the current available set of instances
     *
     * @return instances
     * @throws Exception any errors
     */
    public List<ServiceInstance<T>> getInstances() throws Exception;

    /**
     * added by happyyangyuan
     * 快速根据id定位在线实例
     *
     * @param id 实例id
     * @return 对应的实例，如果不存在id，那么返回null
     */
    ServiceInstance<T> getInstance(String id);
}
