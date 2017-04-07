// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;

/**
 * Perform IPC calls according to the interface contract.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class FloatTest2$$AidlClientImpl implements FloatTest2 {
  private final IBinder delegate;

  public FloatTest2$$AidlClientImpl(IBinder delegate) {
    this.delegate = delegate;
  }

  @Override
  public IBinder asBinder() {
    return delegate;
  }

  @Override
  public float methodWithFloatReturn() throws RemoteException {
    Parcel data = Parcel.obtain();
    Parcel reply = Parcel.obtain();
    try {
      data.writeInterfaceToken(FloatTest2$$AidlServerImpl.DESCRIPTOR);

      delegate.transact(FloatTest2$$AidlServerImpl.TRANSACT_methodWithFloatReturn, data, reply, 0);
      reply.readException();

      return reply.readFloat();
    } finally {
      data.recycle();
      reply.recycle();
    }
  }
}
