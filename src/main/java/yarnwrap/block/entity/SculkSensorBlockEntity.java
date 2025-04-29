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

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.SculkSensorBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.LOGGER = value; }

// public Object callback() { return wrapperContained.callback; }
// // public void callback(Object value) { wrapperContained.callback = value; }
// // public static Object callback() { return net.minecraft.block.entity.SculkSensorBlockEntity.callback; }
// // public static void callback(Object value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.callback = value; }

// public Object listenerData() { return wrapperContained.listenerData; }
// // public void listenerData(Object value) { wrapperContained.listenerData = value; }
// // public static Object listenerData() { return net.minecraft.block.entity.SculkSensorBlockEntity.listenerData; }
// // public static void listenerData(Object value, ) { net.minecraft.block.entity.SculkSensorBlockEntity.listenerData = value; }

public SculkSensorBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SculkSensorBlockEntity(pos.wrapperContained,state.wrapperContained); }
public int getLastVibrationFrequency() { return wrapperContained.getLastVibrationFrequency(); }
// public static int getLastVibrationFrequency() { return net.minecraft.block.entity.SculkSensorBlockEntity.getLastVibrationFrequency(); }
// public void method_42320(Object listener) { wrapperContained.method_42320(listener); }
// public static void method_42320(Object listener, ) { net.minecraft.block.entity.SculkSensorBlockEntity.method_42320(listener); }
// public void method_42321(yarnwrap.nbt.NbtCompound listenerNbt) { wrapperContained.method_42321(listenerNbt.wrapperContained); }
// public static void method_42321(yarnwrap.nbt.NbtCompound listenerNbt, ) { net.minecraft.block.entity.SculkSensorBlockEntity.method_42321(listenerNbt.wrapperContained); }
public void setLastVibrationFrequency(int lastVibrationFrequency) { wrapperContained.setLastVibrationFrequency(lastVibrationFrequency); }
// public static void setLastVibrationFrequency(int lastVibrationFrequency, ) { net.minecraft.block.entity.SculkSensorBlockEntity.setLastVibrationFrequency(lastVibrationFrequency); }
public Object createCallback() { return wrapperContained.createCallback(); }
// public static Object createCallback() { return net.minecraft.block.entity.SculkSensorBlockEntity.createCallback(); }

}