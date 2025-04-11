package yarnwrap.block.entity;
public class SculkSensorBlockEntity { public net.minecraft.block.entity.SculkSensorBlockEntity wrapperContained; public SculkSensorBlockEntity(net.minecraft.block.entity.SculkSensorBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object listener() { return wrapperContained.listener; }
// // public void listener(Object value) { wrapperContained.listener = value; }
// public int lastVibrationFrequency() { return wrapperContained.lastVibrationFrequency; }
// public void lastVibrationFrequency(int value) { wrapperContained.lastVibrationFrequency = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object callback() { return wrapperContained.callback; }
// // public void callback(Object value) { wrapperContained.callback = value; }
// public Object listenerData() { return wrapperContained.listenerData; }
// // public void listenerData(Object value) { wrapperContained.listenerData = value; }
public SculkSensorBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SculkSensorBlockEntity(pos.wrapperContained,state.wrapperContained); }
public int getLastVibrationFrequency() { return wrapperContained.getLastVibrationFrequency(); }
// public void method_42320(Object listener) { wrapperContained.method_42320(listener); }
// public void method_42321(yarnwrap.nbt.NbtCompound listenerNbt) { wrapperContained.method_42321(listenerNbt.wrapperContained); }
public void setLastVibrationFrequency(int lastVibrationFrequency) { wrapperContained.setLastVibrationFrequency(lastVibrationFrequency); }
public Object createCallback() { return wrapperContained.createCallback(); }

}