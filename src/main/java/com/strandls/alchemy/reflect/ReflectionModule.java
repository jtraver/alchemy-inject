/*
 * Copyright (C) 2015 Strand Life Sciences.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strandls.alchemy.reflect;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.name.Names;
import com.strandls.alchemy.inject.AlchemyModule;
import com.strandls.alchemy.inject.AlchemyModule.Environment;

/**
 * {@link Guice} module for reflect package.
 *
 * @author Ashish Shinde
 *
 */
@AlchemyModule(Environment.All)
public class ReflectionModule extends AbstractModule {

    /*
     * (non-Javadoc)
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
        bind(JavaTypeQueryHandler.class).to(CachingJavaTypeQueryHandler.class);
        bind(Integer.class).annotatedWith(
                Names.named(CachingJavaTypeQueryHandler.CLASS_CACHE_TIMEOUT_MILLIS_PARAM))
                .toInstance(100000);
        bind(Integer.class).annotatedWith(
                Names.named(CachingJavaTypeQueryHandler.CLASS_CACHE_SIZE_PARAM)).toInstance(1000);
    }
}
