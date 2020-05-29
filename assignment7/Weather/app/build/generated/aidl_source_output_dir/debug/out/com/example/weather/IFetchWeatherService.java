/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.weather;
public interface IFetchWeatherService extends android.os.IInterface
{
  /** Default implementation for IFetchWeatherService. */
  public static class Default implements com.example.weather.IFetchWeatherService
  {
    /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         */
    @Override public void retrieveWeatherDataRetrieve() throws android.os.RemoteException
    {
    }
    @Override public void registerFetchDataListener(com.example.weather.IFetchDataListener listener) throws android.os.RemoteException
    {
    }
    @Override public void unregisterFetchDataListener(com.example.weather.IFetchDataListener listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.weather.IFetchWeatherService
  {
    private static final java.lang.String DESCRIPTOR = "com.example.weather.IFetchWeatherService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.weather.IFetchWeatherService interface,
     * generating a proxy if needed.
     */
    public static com.example.weather.IFetchWeatherService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.weather.IFetchWeatherService))) {
        return ((com.example.weather.IFetchWeatherService)iin);
      }
      return new com.example.weather.IFetchWeatherService.Stub.Proxy(obj);
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
        case TRANSACTION_retrieveWeatherDataRetrieve:
        {
          data.enforceInterface(descriptor);
          this.retrieveWeatherDataRetrieve();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_registerFetchDataListener:
        {
          data.enforceInterface(descriptor);
          com.example.weather.IFetchDataListener _arg0;
          _arg0 = com.example.weather.IFetchDataListener.Stub.asInterface(data.readStrongBinder());
          this.registerFetchDataListener(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterFetchDataListener:
        {
          data.enforceInterface(descriptor);
          com.example.weather.IFetchDataListener _arg0;
          _arg0 = com.example.weather.IFetchDataListener.Stub.asInterface(data.readStrongBinder());
          this.unregisterFetchDataListener(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.example.weather.IFetchWeatherService
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
      @Override public void retrieveWeatherDataRetrieve() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_retrieveWeatherDataRetrieve, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().retrieveWeatherDataRetrieve();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void registerFetchDataListener(com.example.weather.IFetchDataListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerFetchDataListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerFetchDataListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unregisterFetchDataListener(com.example.weather.IFetchDataListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterFetchDataListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterFetchDataListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.example.weather.IFetchWeatherService sDefaultImpl;
    }
    static final int TRANSACTION_retrieveWeatherDataRetrieve = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_registerFetchDataListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_unregisterFetchDataListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(com.example.weather.IFetchWeatherService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.example.weather.IFetchWeatherService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       */
  public void retrieveWeatherDataRetrieve() throws android.os.RemoteException;
  public void registerFetchDataListener(com.example.weather.IFetchDataListener listener) throws android.os.RemoteException;
  public void unregisterFetchDataListener(com.example.weather.IFetchDataListener listener) throws android.os.RemoteException;
}
