/*
 * Copyright (C) 2015 Alchemy Inject Authors
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

package com.strandls.alchemy.inject;

import com.google.inject.AbstractModule;
import com.strandls.alchemy.inject.AlchemyModule.Environment;

/**
 * A dummy module used for testing module lister.
 *
 * @author ashish
 *
 */
@AlchemyModule(Environment.Prod)
public class DummyProdModule extends AbstractModule {

    /*
     * (non-Javadoc)
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
    }

}