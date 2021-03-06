/*
 * Copyright 2011
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
package org.castor.cpa.test.test3065;

import org.junit.Ignore;

@Ignore
public class ExtendedObject extends BaseObject {
    private String _description2;
    
    public final String getDescription2() { 
        return _description2; 
    }
    
    public final void setDescription2(final String description2) {
        _description2 = description2;
    }
}
