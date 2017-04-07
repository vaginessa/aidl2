package net.sf.aidl2;

import android.os.IInterface;
import android.os.RemoteException;

@AIDL("net.sf.aidl2.FloatTest")
public interface FloatTest extends IInterface {
    void methodWithFloatParam(float parameter) throws RemoteException;
}
