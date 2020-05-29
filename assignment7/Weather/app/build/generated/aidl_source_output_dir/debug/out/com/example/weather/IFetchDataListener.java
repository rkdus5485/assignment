/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.weather;
// Declare any non-default types here with import statements

public interface IFetchDataListener extends android.os.IInterface
{
  /** Default implementation for IFetchDataListener. */
  public static class Default implements com.example.weather.IFetchDataListener
  {
    /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         */
    @Override public void onWeatherDataRetrieved(java.lang.String[] data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.weather.IFetchDataListener
  {
    private static final java.lang.String DESCRIPTOR = "com.example.weather.IFetchDataListener";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.weather.IFetchDataListener interface,
     * generating a proxy if needed.
     */
    public static com.example.weather.IFetchDataListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.weather.IFetchDataListener))) {
        return ((com.example.weather.IFetchDataListener)iin);
      }
      return new com.example.weather.IFetchDataListener.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onWeatherDataRetrieved:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new java.lang.String[_arg0_length];
          }
          this.onWeatherDataRetrieved(_arg0);
          reply.writeNoException();
          reply.writeStringArray(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.example.weather.IFetchDataListener
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Demonstrates some basic types that you can use as parameters
           * and return values in AIDL.
           */
      @Override public void onWeatherDataRetrieved(java.lang.String[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((data==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(data.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onWeatherDataRetrieved, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onWeatherDataRetrieved(data);
            return;
          }
          _reply.readException();
          _reply.readStringArray(data);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.example.weather.IFetchDataListener sDefaultImpl;
    }
    static final int TRANSACTION_onWeatherDataRetrieved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.example.weather.IFetchDataListener impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.example.weather.IFetchDataListener getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       */
  public void onWeatherDataRetrieved(java.lang.String[] data) throws android.os.RemoteException;
}
