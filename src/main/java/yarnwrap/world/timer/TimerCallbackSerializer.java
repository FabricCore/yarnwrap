package yarnwrap.world.timer;
public class TimerCallbackSerializer { public net.minecraft.world.timer.TimerCallbackSerializer wrapperContained; public TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map serializersByClass() { return wrapperContained.serializersByClass; }
// public void serializersByClass(java.util.Map value) { wrapperContained.serializersByClass = value; }
// public static java.util.Map serializersByClass() { return net.minecraft.world.timer.TimerCallbackSerializer.serializersByClass; }
// public static void serializersByClass(java.util.Map value, ) { net.minecraft.world.timer.TimerCallbackSerializer.serializersByClass = value; }

// public yarnwrap.world.timer.TimerCallbackSerializer INSTANCE() { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.timer.TimerCallbackSerializer value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.world.timer.TimerCallbackSerializer INSTANCE() { return new yarnwrap.world.timer.TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.timer.TimerCallbackSerializer value, ) { net.minecraft.world.timer.TimerCallbackSerializer.INSTANCE = value.wrapperContained; }

// public java.util.Map serializersByType() { return wrapperContained.serializersByType; }
// public void serializersByType(java.util.Map value) { wrapperContained.serializersByType = value; }
// public static java.util.Map serializersByType() { return net.minecraft.world.timer.TimerCallbackSerializer.serializersByType; }
// public static void serializersByType(java.util.Map value, ) { net.minecraft.world.timer.TimerCallbackSerializer.serializersByType = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.timer.TimerCallbackSerializer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.timer.TimerCallbackSerializer.LOGGER = value; }

// public Object getSerializer(java.lang.Class clazz) { return wrapperContained.getSerializer(clazz); }
// public static Object getSerializer(java.lang.Class clazz, ) { return net.minecraft.world.timer.TimerCallbackSerializer.getSerializer(clazz); }
// public yarnwrap.world.timer.TimerCallbackSerializer registerSerializer(Object serializer) { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.registerSerializer(serializer)); }
// public static yarnwrap.world.timer.TimerCallbackSerializer registerSerializer(Object serializer, ) { return new yarnwrap.world.timer.TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer.registerSerializer(serializer)); }
public yarnwrap.world.timer.TimerCallback deserialize(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.timer.TimerCallback(wrapperContained.deserialize(nbt.wrapperContained)); }
// public static yarnwrap.world.timer.TimerCallback deserialize(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.world.timer.TimerCallback(net.minecraft.world.timer.TimerCallbackSerializer.deserialize(nbt.wrapperContained)); }
public yarnwrap.nbt.NbtCompound serialize(yarnwrap.world.timer.TimerCallback callback) { return new yarnwrap.nbt.NbtCompound(wrapperContained.serialize(callback.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound serialize(yarnwrap.world.timer.TimerCallback callback, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.timer.TimerCallbackSerializer.serialize(callback.wrapperContained)); }

}