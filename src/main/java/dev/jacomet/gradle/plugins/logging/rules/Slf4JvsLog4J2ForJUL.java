/*
 * Copyright 2019 the original author or authors.
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
package dev.jacomet.gradle.plugins.logging.rules;

/**
 * Adds capability {@code dev.jacomet.logging:slf4j-vs-log4j2-jul:1.0} to all variants.
 */
public class Slf4JvsLog4J2ForJUL extends FixedCapabilityRule {
    public static final String CAPABILITY_NAME = "slf4j-vs-log4j2-jul";
    public static final String CAPABILITY_ID = CAPABILITY_GROUP + ":" + CAPABILITY_NAME;

    public Slf4JvsLog4J2ForJUL() {
        super(CAPABILITY_NAME);
    }
}
