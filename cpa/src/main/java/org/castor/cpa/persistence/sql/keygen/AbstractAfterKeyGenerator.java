/*
 * Copyright 2009 Ahmad Hassan, Ralf Joachim
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
package org.castor.cpa.persistence.sql.keygen;

import java.sql.Connection;

import org.castor.persist.ProposedEntity;
import org.exolab.castor.jdo.Database;
import org.exolab.castor.jdo.PersistenceException;
import org.exolab.castor.jdo.engine.SQLEngine;
import org.exolab.castor.persist.spi.Identity;

/**
 * Abstract class that implements the KeyGenerator interface for AFTER_INSERT style. The key
 * generator is used for producing identities for objects before they are created in the
 * database.
 * 
 * @author <a href="mailto:ahmad DOT hassan AT gmail DOT com">Ahmad Hassan</a>
 * @author <a href="mailto:ralf DOT joachim AT syscon DOT eu">Ralf Joachim</a>
 * @version $Revision$ $Date: 2009-07-13 17:22:43 (Tue, 28 Jul 2009) $
 */
public abstract class AbstractAfterKeyGenerator implements KeyGenerator {
    /**
     * {@inheritDoc}
     */
    public final byte getStyle() {
        return AFTER_INSERT;
    }

    /**
     * {@inheritDoc}
     */
    public final Object executeStatement(final SQLEngine engine, final String statement, 
            final Database database, final Connection conn, final Identity identity, 
            final ProposedEntity entity) throws PersistenceException {
        return null;
    }
}