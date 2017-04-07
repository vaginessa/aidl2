package net.sf.aidl2;

import android.os.IInterface;
import android.os.RemoteException;

@AIDL("net.sf.aidl2.FloatTest2")
public interface FloatTest2 extends IInterface {
    float methodWithFloatReturn() throws RemoteException;
}
