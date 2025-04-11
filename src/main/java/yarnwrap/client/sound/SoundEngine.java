package yarnwrap.client.sound;
public class SoundEngine { public net.minecraft.client.sound.SoundEngine wrapperContained; public SoundEngine(net.minecraft.client.sound.SoundEngine wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public long devicePointer() { return wrapperContained.devicePointer; }
// public void devicePointer(long value) { wrapperContained.devicePointer = value; }
// public long contextPointer() { return wrapperContained.contextPointer; }
// public void contextPointer(long value) { wrapperContained.contextPointer = value; }
// public yarnwrap.client.sound.SoundListener listener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.listener); }
// public void listener(yarnwrap.client.sound.SoundListener value) { wrapperContained.listener = value.wrapperContained; }
// public Object EMPTY_SOURCE_SET() { return wrapperContained.EMPTY_SOURCE_SET; }
// // public void EMPTY_SOURCE_SET(Object value) { wrapperContained.EMPTY_SOURCE_SET = value; }
// public Object streamingSources() { return wrapperContained.streamingSources; }
// // public void streamingSources(Object value) { wrapperContained.streamingSources = value; }
// public Object staticSources() { return wrapperContained.staticSources; }
// // public void staticSources(Object value) { wrapperContained.staticSources = value; }
// public boolean disconnectExtensionPresent() { return wrapperContained.disconnectExtensionPresent; }
// public void disconnectExtensionPresent(boolean value) { wrapperContained.disconnectExtensionPresent = value; }
// public java.lang.String deviceSpecifier() { return wrapperContained.deviceSpecifier; }
// public void deviceSpecifier(java.lang.String value) { wrapperContained.deviceSpecifier = value; }
public void init(java.lang.String deviceSpecifier,boolean directionalAudio) { wrapperContained.init(deviceSpecifier,directionalAudio); }
public void release(yarnwrap.client.sound.Source source) { wrapperContained.release(source.wrapperContained); }
// public yarnwrap.client.sound.Source createSource(Object mode) { return new yarnwrap.client.sound.Source(wrapperContained.createSource(mode)); }
public void close() { wrapperContained.close(); }
public yarnwrap.client.sound.SoundListener getListener() { return new yarnwrap.client.sound.SoundListener(wrapperContained.getListener()); }
// public java.util.OptionalLong openDevice(java.lang.String deviceSpecifier) { return wrapperContained.openDevice(deviceSpecifier); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public int getMonoSourceCount() { return wrapperContained.getMonoSourceCount(); }
public java.lang.String findAvailableDeviceSpecifier() { return wrapperContained.findAvailableDeviceSpecifier(); }
// public long openDeviceOrFallback(java.lang.String deviceSpecifier) { return wrapperContained.openDeviceOrFallback(deviceSpecifier); }
public java.util.List getSoundDevices() { return wrapperContained.getSoundDevices(); }
public java.lang.String getCurrentDeviceName() { return wrapperContained.getCurrentDeviceName(); }
public boolean updateDeviceSpecifier() { return wrapperContained.updateDeviceSpecifier(); }
public boolean isDeviceUnavailable() { return wrapperContained.isDeviceUnavailable(); }
// public void setDirectionalAudio(boolean enabled) { wrapperContained.setDirectionalAudio(enabled); }

}