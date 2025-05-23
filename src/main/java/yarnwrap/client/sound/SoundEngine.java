package yarnwrap.client.sound;
public class SoundEngine { public net.minecraft.client.sound.SoundEngine wrapperContained; public SoundEngine(net.minecraft.client.sound.SoundEngine wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.sound.SoundEngine.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.sound.SoundEngine.LOGGER = value; }

// public long devicePointer() { return wrapperContained.devicePointer; }
// public void devicePointer(long value) { wrapperContained.devicePointer = value; }
// public static long devicePointer() { return net.minecraft.client.sound.SoundEngine.devicePointer; }
// public static void devicePointer(long value, ) { net.minecraft.client.sound.SoundEngine.devicePointer = value; }

// public long contextPointer() { return wrapperContained.contextPointer; }
// public void contextPointer(long value) { wrapperContained.contextPointer = value; }
// public static long contextPointer() { return net.minecraft.client.sound.SoundEngine.contextPointer; }
// public static void contextPointer(long value, ) { net.minecraft.client.sound.SoundEngine.contextPointer = value; }

// public yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.listener); }
// public void listener(yarnwrap.client.sound.SoundListener value) { wrapperContained.listener = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(net.minecraft.client.sound.SoundEngine.listener); }
// public static void listener(yarnwrap.client.sound.SoundListener value, ) { net.minecraft.client.sound.SoundEngine.listener = value.wrapperContained; }

// public Object EMPTY_SOURCE_SET() { return wrapperContained.EMPTY_SOURCE_SET; }
// // public void EMPTY_SOURCE_SET(Object value) { wrapperContained.EMPTY_SOURCE_SET = value; }
// // public static Object EMPTY_SOURCE_SET() { return net.minecraft.client.sound.SoundEngine.EMPTY_SOURCE_SET; }
// // public static void EMPTY_SOURCE_SET(Object value, ) { net.minecraft.client.sound.SoundEngine.EMPTY_SOURCE_SET = value; }

// public Object streamingSources() { return wrapperContained.streamingSources; }
// // public void streamingSources(Object value) { wrapperContained.streamingSources = value; }
// // public static Object streamingSources() { return net.minecraft.client.sound.SoundEngine.streamingSources; }
// // public static void streamingSources(Object value, ) { net.minecraft.client.sound.SoundEngine.streamingSources = value; }

// public Object staticSources() { return wrapperContained.staticSources; }
// // public void staticSources(Object value) { wrapperContained.staticSources = value; }
// // public static Object staticSources() { return net.minecraft.client.sound.SoundEngine.staticSources; }
// // public static void staticSources(Object value, ) { net.minecraft.client.sound.SoundEngine.staticSources = value; }

// public boolean disconnectExtensionPresent() { return wrapperContained.disconnectExtensionPresent; }
// public void disconnectExtensionPresent(boolean value) { wrapperContained.disconnectExtensionPresent = value; }
// public static boolean disconnectExtensionPresent() { return net.minecraft.client.sound.SoundEngine.disconnectExtensionPresent; }
// public static void disconnectExtensionPresent(boolean value, ) { net.minecraft.client.sound.SoundEngine.disconnectExtensionPresent = value; }

// public java.lang.String deviceSpecifier() { return wrapperContained.deviceSpecifier; }
// public void deviceSpecifier(java.lang.String value) { wrapperContained.deviceSpecifier = value; }
// public static java.lang.String deviceSpecifier() { return net.minecraft.client.sound.SoundEngine.deviceSpecifier; }
// public static void deviceSpecifier(java.lang.String value, ) { net.minecraft.client.sound.SoundEngine.deviceSpecifier = value; }

public void init(java.lang.String deviceSpecifier,boolean directionalAudio) { wrapperContained.init(deviceSpecifier,directionalAudio); }
// public static void init(java.lang.String deviceSpecifier,boolean directionalAudio, ) { net.minecraft.client.sound.SoundEngine.init(deviceSpecifier,directionalAudio); }
public void release(yarnwrap.client.sound.Source source) { wrapperContained.release(source.wrapperContained); }
// public static void release(yarnwrap.client.sound.Source source, ) { net.minecraft.client.sound.SoundEngine.release(source.wrapperContained); }
// public yarnwrap.client.sound.Source createSource(Object mode) { return new yarnwrap.client.sound.Source(wrapperContained.createSource(mode)); }
// public static yarnwrap.client.sound.Source createSource(Object mode, ) { return new yarnwrap.client.sound.Source(net.minecraft.client.sound.SoundEngine.createSource(mode)); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.sound.SoundEngine.close(); }
public yarnwrap.client.sound.SoundListener getListener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.getListener()); }
// public static yarnwrap.client.sound.SoundListener getListener() { return new yarnwrap.client.sound.SoundListener(net.minecraft.client.sound.SoundEngine.getListener()); }
// public java.util.OptionalLong openDevice(java.lang.String deviceSpecifier) { return wrapperContained.openDevice(deviceSpecifier); }
// public static java.util.OptionalLong openDevice(java.lang.String deviceSpecifier, ) { return net.minecraft.client.sound.SoundEngine.openDevice(deviceSpecifier); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.client.sound.SoundEngine.getDebugString(); }
// public int getMonoSourceCount() { return wrapperContained.getMonoSourceCount(); }
// public static int getMonoSourceCount() { return net.minecraft.client.sound.SoundEngine.getMonoSourceCount(); }
// public java.lang.String findAvailableDeviceSpecifier() { return wrapperContained.findAvailableDeviceSpecifier(); }
public static java.lang.String findAvailableDeviceSpecifier() { return net.minecraft.client.sound.SoundEngine.findAvailableDeviceSpecifier(); }
// public long openDeviceOrFallback(java.lang.String deviceSpecifier) { return wrapperContained.openDeviceOrFallback(deviceSpecifier); }
// public static long openDeviceOrFallback(java.lang.String deviceSpecifier, ) { return net.minecraft.client.sound.SoundEngine.openDeviceOrFallback(deviceSpecifier); }
public java.util.List getSoundDevices() { return wrapperContained.getSoundDevices(); }
// public static java.util.List getSoundDevices() { return net.minecraft.client.sound.SoundEngine.getSoundDevices(); }
public java.lang.String getCurrentDeviceName() { return wrapperContained.getCurrentDeviceName(); }
// public static java.lang.String getCurrentDeviceName() { return net.minecraft.client.sound.SoundEngine.getCurrentDeviceName(); }
public boolean updateDeviceSpecifier() { return wrapperContained.updateDeviceSpecifier(); }
// public static boolean updateDeviceSpecifier() { return net.minecraft.client.sound.SoundEngine.updateDeviceSpecifier(); }
public boolean isDeviceUnavailable() { return wrapperContained.isDeviceUnavailable(); }
// public static boolean isDeviceUnavailable() { return net.minecraft.client.sound.SoundEngine.isDeviceUnavailable(); }
// public java.nio.IntBuffer createAttributes(org.lwjgl.system.MemoryStack stack,boolean directionalAudio) { return wrapperContained.createAttributes(stack,directionalAudio); }
// public static java.nio.IntBuffer createAttributes(org.lwjgl.system.MemoryStack stack,boolean directionalAudio, ) { return net.minecraft.client.sound.SoundEngine.createAttributes(stack,directionalAudio); }

}