/*
 * Copyright (c) 1998, 2019 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 1998, 2018 IBM Corporation and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.eclipse.persistence.internal.sessions.coordination.rmi;

import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import org.eclipse.persistence.sessions.coordination.Command;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ServantObject;
import org.omg.CORBA_2_3.portable.InputStream;
import org.omg.CORBA_2_3.portable.OutputStream;

public class _RMIRemoteCommandConnection_Stub extends Stub implements RMIRemoteCommandConnection {
    
    private static final String[] _type_ids = {
        "RMI:org.eclipse.persistence.internal.sessions.coordination.rmi.RMIRemoteCommandConnection:0000000000000000"
    };
    
    @Override
    public String[] _ids() { 
        return _type_ids.clone();
    }
    
    @Override
    public Object executeCommand(Command arg0) throws RemoteException {
        while(true) {
            if (!Util.isLocal(this)) {
                InputStream in = null;
                try {
                    try {
                        OutputStream out = 
                            (OutputStream)
                            _request("executeCommand__org_eclipse_persistence_sessions_coordination_Command", true);
                        out.write_value(arg0,Command.class);
                        in = (InputStream)_invoke(out);
                        return Util.readAny(in);
                    } catch (ApplicationException ex) {
                        in = (InputStream) ex.getInputStream();
                        String id = in.read_string();
                        throw new UnexpectedException(id);
                    } catch (RemarshalException ex) {
                        continue;
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                } finally {
                    _releaseReply(in);
                }
            } else {
                ServantObject so = _servant_preinvoke("executeCommand__org_eclipse_persistence_sessions_coordination_Command",org.eclipse.persistence.internal.sessions.coordination.rmi.RMIRemoteCommandConnection.class);
                if (so == null) {
                    continue;
                }
                try {
                    Command arg0Copy = (Command) Util.copyObject(arg0,_orb());
                    Object result = ((org.eclipse.persistence.internal.sessions.coordination.rmi.RMIRemoteCommandConnection)so.servant).executeCommand(arg0Copy);
                    return Util.copyObject(result,_orb());
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
    }
    
    @Override
    public Object executeCommand(byte[] arg0) throws RemoteException {
        while(true) {
            if (!Util.isLocal(this)) {
                InputStream in = null;
                try {
                    try {
                        OutputStream out = 
                            (OutputStream)
                            _request("executeCommand__org_omg_boxedRMI_seq1_octet", true);
                        out.write_value(cast_array(arg0),byte[].class);
                        in = (InputStream)_invoke(out);
                        return Util.readAny(in);
                    } catch (ApplicationException ex) {
                        in = (InputStream) ex.getInputStream();
                        String id = in.read_string();
                        throw new UnexpectedException(id);
                    } catch (RemarshalException ex) {
                        continue;
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                } finally {
                    _releaseReply(in);
                }
            } else {
                ServantObject so = _servant_preinvoke("executeCommand__org_omg_boxedRMI_seq1_octet",org.eclipse.persistence.internal.sessions.coordination.rmi.RMIRemoteCommandConnection.class);
                if (so == null) {
                    continue;
                }
                try {
                    byte[] arg0Copy = (byte[]) Util.copyObject(arg0,_orb());
                    Object result = ((org.eclipse.persistence.internal.sessions.coordination.rmi.RMIRemoteCommandConnection)so.servant).executeCommand(arg0Copy);
                    return Util.copyObject(result,_orb());
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
    }
    
    // This method is required as a work-around for
    // a bug in the JDK 1.1.6 verifier.
    
    private Serializable cast_array(Object obj) {
        return (Serializable)obj;
    }
}