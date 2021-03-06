/*******************************************************************************
 * Copyright (c) 2012, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *  - Matt MacIvor - 9/20/2012 - 2.4.2 - Initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.annotations.xmlinversereference;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class OwnedAdapter extends XmlAdapter<Adapted, Owned>{

    @Override
    public Adapted marshal(Owned arg0) throws Exception {
        return new Adapted();
    }

    @Override
    public Owned unmarshal(Adapted arg0) throws Exception {
        Owned owned = new Owned();
        owned.owner = arg0.owner;
        return owned;
    }


}
