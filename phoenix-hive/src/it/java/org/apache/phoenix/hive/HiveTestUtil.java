/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.phoenix.hive;

import org.apache.hadoop.hive.ql.QTestUtil;

/**
 * HiveTestUtil cloned from Hive QTestUtil. Can be outdated and may require update once a problem
 * found.
 */
public class HiveTestUtil extends QTestUtil{
    public static final String CRLF = System.getProperty("line.separator");

    public HiveTestUtil(String outDir, String logDir, MiniClusterType clusterType, String confDir, String hadoopVer,
            String initScript, String cleanupScript, boolean withLlapIo) throws Exception {
        super(outDir, logDir, clusterType, confDir, hadoopVer, initScript, cleanupScript, false, withLlapIo);
    }

    @Override
    public int executeClient(String tname) {
        conf.set("mapreduce.job.name", "test");
        return super.executeClient(tname);
    }
    
}
