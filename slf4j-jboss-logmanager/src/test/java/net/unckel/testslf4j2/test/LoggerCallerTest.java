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
package net.unckel.testslf4j2.test;

import static org.junit.jupiter.api.Assertions.*;

import net.unckel.testslf4j2.LoggerCaller;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 */
public class LoggerCallerTest {

     @Test
     void callLogTest() {
          LoggerCaller loggerCaller = new LoggerCaller();
          assertDoesNotThrow(() -> loggerCaller.callLog());
     }

     @Test
     void correctBindingTest() {
          Logger logger = LoggerFactory.getLogger(LoggerCallerTest.class);
          assertEquals(org.slf4j.impl.Slf4jLogger.class, logger.getClass());
     }
}
