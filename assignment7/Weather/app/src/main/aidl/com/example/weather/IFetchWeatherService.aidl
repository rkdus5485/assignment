// IFetchWeatherService.aidl
package com.example.weather;

// Declare any non-default types here with import statements
import com.example.weather.IFetchDataListener;

interface IFetchWeatherService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void retrieveWeatherDataRetrieve();
         void registerFetchDataListener(IFetchDataListener listener);
         void unregisterFetchDataListener(IFetchDataListener listener);
}


