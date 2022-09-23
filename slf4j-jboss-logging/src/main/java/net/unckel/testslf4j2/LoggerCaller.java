/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package net.unckel.testslf4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class LoggerCaller {

     public void callLog() {
          Logger logger = LoggerFactory.getLogger(LoggerCaller.class);
          logger.error("Demo log entry");
     }

     public static void main(String[] args) {
          LoggerCaller loggerCaller = new LoggerCaller();
          loggerCaller.callLog();
     }
}
