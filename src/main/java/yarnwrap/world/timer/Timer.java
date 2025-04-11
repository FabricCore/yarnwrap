package yarnwrap.world.timer;
public class Timer { public net.minecraft.world.timer.Timer wrapperContained; public Timer(net.minecraft.world.timer.Timer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.primitives.UnsignedLong eventCounter() { return wrapperContained.eventCounter; }
// public void eventCounter(com.google.common.primitives.UnsignedLong value) { wrapperContained.eventCounter = value; }
// public com.google.common.collect.Table eventsByName() { return wrapperContained.eventsByName; }
// public void eventsByName(com.google.common.collect.Table value) { wrapperContained.eventsByName = value; }
// public java.util.Queue events() { return wrapperContained.events; }
// public void events(java.util.Queue value) { wrapperContained.events = value; }
// public yarnwrap.world.timer.TimerCallbackSerializer callback() { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.callback); }
// public void callback(yarnwrap.world.timer.TimerCallbackSerializer value) { wrapperContained.callback = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String CALLBACK_KEY() { return wrapperContained.CALLBACK_KEY; }
// public void CALLBACK_KEY(java.lang.String value) { wrapperContained.CALLBACK_KEY = value; }
// public java.lang.String NAME_KEY() { return wrapperContained.NAME_KEY; }
// public void NAME_KEY(java.lang.String value) { wrapperContained.NAME_KEY = value; }
// public java.lang.String TRIGGER_TIME_KEY() { return wrapperContained.TRIGGER_TIME_KEY; }
// public void TRIGGER_TIME_KEY(java.lang.String value) { wrapperContained.TRIGGER_TIME_KEY = value; }
public Timer(yarnwrap.world.timer.TimerCallbackSerializer timerCallbackSerializer) { this.wrapperContained = new net.minecraft.world.timer.Timer(timerCallbackSerializer.wrapperContained); }
public Timer(yarnwrap.world.timer.TimerCallbackSerializer timerCallbackSerializer,java.util.stream.Stream nbts) { this.wrapperContained = new net.minecraft.world.timer.Timer(timerCallbackSerializer.wrapperContained,nbts); }
// public com.google.common.primitives.UnsignedLong method_21904(Object event) { return wrapperContained.method_21904(event); }
// public long method_21905(Object event) { return wrapperContained.method_21905(event); }
public java.util.Set getEventNames() { return wrapperContained.getEventNames(); }
public int remove(java.lang.String name) { return wrapperContained.remove(name); }
// public void method_29040(com.mojang.serialization.Dynamic nbt) { wrapperContained.method_29040(nbt); }
// public yarnwrap.nbt.NbtCompound serialize(Object event) { return new yarnwrap.nbt.NbtCompound(wrapperContained.serialize(event)); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
public void setEvent(java.lang.String name,long triggerTime,yarnwrap.world.timer.TimerCallback callback) { wrapperContained.setEvent(name,triggerTime,callback.wrapperContained); }
// public void addEvent(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.addEvent(nbt.wrapperContained); }
// public java.util.Comparator createEventComparator() { return wrapperContained.createEventComparator(); }
public void processEvents(java.lang.Object server,long time) { wrapperContained.processEvents(server,time); }

}