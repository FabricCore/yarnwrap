package yarnwrap.world.timer;
public class TimerCallbackSerializer { public net.minecraft.world.timer.TimerCallbackSerializer wrapperContained; public TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map serializersByClass() { return wrapperContained.serializersByClass; }
public yarnwrap.world.timer.TimerCallbackSerializer INSTANCE() { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.INSTANCE); }
// public java.util.Map serializersByType() { return wrapperContained.serializersByType; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object getSerializer(java.lang.Class clazz) { return wrapperContained.getSerializer(clazz); }
// public yarnwrap.world.timer.TimerCallbackSerializer registerSerializer(Object serializer) { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.registerSerializer(serializer)); }
public yarnwrap.world.timer.TimerCallback deserialize(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.timer.TimerCallback(wrapperContained.deserialize(nbt.wrapperContained)); }
public yarnwrap.nbt.NbtCompound serialize(yarnwrap.world.timer.TimerCallback callback) { return new yarnwrap.nbt.NbtCompound(wrapperContained.serialize(callback.wrapperContained)); }

}