package net.sf.aidl2;

import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

@AIDL
public interface ConcreteListTest<X extends LinkedList<Object>> extends IInterface {
    <T extends CharSequence> Stack<T> methodWithVectorParamAndStackReturn(Vector<Parcelable> objectList) throws RemoteException;
}
