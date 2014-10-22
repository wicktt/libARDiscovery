package com.parrot.arsdk.ardiscovery;

import java.util.List;

import android.content.Context;

/**
 * Interface for the wifi parts of the ARDiscoveryService
 */
public interface ARDiscoveryWifiDiscovery
{
    public void open(ARDiscoveryService broadcaster, Context c);
    public void close();
    public void update();
    public void start();
    public void stop();

    public List<ARDiscoveryDeviceService> getDeviceServicesArray();

    public boolean publishService(ARDISCOVERY_PRODUCT_ENUM product, String name, int port);
    public boolean publishService(final int product_id, final String name, final int port);
    public void unpublishService();
}