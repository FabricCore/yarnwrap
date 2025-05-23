package yarnwrap.block.entity;
public class SculkSensorBlockEntity { public net.minecraft.block.entity.SculkSensorBlockEntity wrapperContained; public SculkSensorBlockEntity(net.minecraft.block.entity.SculkSensorBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object listener() { return wrapperContained.listener; }
// // public void listener(Object value) { wrapperContained.listener = value; }
// // public static Object listener() { return net.minecraft.block.entity.SculkSensorBlockEntity.listener; }
// // public static void listener(Object value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.listener = value; }

// public int lastVibrationFrequency() { return wrapperContained.lastVibrationFrequency; }
// public void lastVibrationFrequency(int value) { wrapperContained.lastVibrationFrequency = value; }
// public static int lastVibrationFrequency() { return net.minecraft.block.entity.SculkSensorBlockEntity.lastVibrationFrequency; }
// public static void lastVibrationFrequency(int value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.lastVibrationFrequency = value; }

// public Object callback() { return wrapperContained.callback; }
// // public void callback(Object value) { wrapperContained.callback = value; }
// // public static Object callback() { return net.minecraft.block.entity.SculkSensorBlockEntity.callback; }
// // public static void callback(Object value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.callback = value; }

// public Object listenerData() { return wrapperContained.listenerData; }
// // public void listenerData(Object value) { wrapperContained.listenerData = value; }
// // public static Object listenerData() { return net.minecraft.block.entity.SculkSensorBlockEntity.listenerData; }
// // public static void listenerData(Object value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.listenerData = value; }

// public int DEFAULT_LAST_VIBRATION_FREQUENCY() { return wrapperContained.DEFAULT_LAST_VIBRATION_FREQUENCY; }
// public void DEFAULT_LAST_VIBRATION_FREQUENCY(int value) { wrapperContained.DEFAULT_LAST_VIBRATION_FREQUENCY = value; }
// public static int DEFAULT_LAST_VIBRATION_FREQUENCY() { return net.minecraft.block.entity.SculkSensorBlockEntity.DEFAULT_LAST_VIBRATION_FREQUENCY; }
// public static void DEFAULT_LAST_VIBRATION_FREQUENCY(int value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.DEFAULT_LAST_VIBRATION_FREQUENCY = value; }

public SculkSensorBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SculkSensorBlockEntity(pos.wrapperContained,state.wrapperContained); }
public int getLastVibrationFrequency() { return wrapperContained.getLastVibrationFrequency(); }
// public static int getLastVibrationFrequency() { return net.minecraft.block.entity.SculkSensorBlockEntity.getLastVibrationFrequency(); }
public void setLastVibrationFrequency(int lastVibrationFrequency) { wrapperContained.setLastVibrationFrequency(lastVibrationFrequency); }
// public static void setLastVibrationFrequency(int lastVibrationFrequency, ) { net.minecraft.block.entity.SculkSensorBlockEntity.setLastVibrationFrequency(lastVibrationFrequency); }
public Object createCallback() { return wrapperContained.createCallback(); }
// public static Object createCallback() { return net.minecraft.block.entity.SculkSensorBlockEntity.createCallback(); }

}