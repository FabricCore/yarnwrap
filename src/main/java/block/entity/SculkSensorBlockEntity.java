package yarnwrap.block.entity;
public class SculkSensorBlockEntity { public net.minecraft.block.entity.SculkSensorBlockEntity wrapperContained; public SculkSensorBlockEntity(net.minecraft.block.entity.SculkSensorBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object listener() { return wrapperContained.listener; }
// public int lastVibrationFrequency() { return wrapperContained.lastVibrationFrequency; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object callback() { return wrapperContained.callback; }
// public Object listenerData() { return wrapperContained.listenerData; }
public int getLastVibrationFrequency() { return wrapperContained.getLastVibrationFrequency(); }
public void setLastVibrationFrequency(int lastVibrationFrequency) { wrapperContained.setLastVibrationFrequency(lastVibrationFrequency); }
public Object createCallback() { return wrapperContained.createCallback(); }

}