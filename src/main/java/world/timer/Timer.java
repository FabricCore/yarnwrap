package yarnwrap.world.timer;
public class Timer { public net.minecraft.world.timer.Timer wrapperContained; public Timer(net.minecraft.world.timer.Timer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.primitives.UnsignedLong eventCounter() { return wrapperContained.eventCounter; }
// public com.google.common.collect.Table eventsByName() { return wrapperContained.eventsByName; }
// public java.util.Queue events() { return wrapperContained.events; }
// public yarnwrap.world.timer.TimerCallbackSerializer callback() { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.callback); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String CALLBACK_KEY() { return wrapperContained.CALLBACK_KEY; }
// public java.lang.String NAME_KEY() { return wrapperContained.NAME_KEY; }
// public java.lang.String TRIGGER_TIME_KEY() { return wrapperContained.TRIGGER_TIME_KEY; }
public java.util.Set getEventNames() { return wrapperContained.getEventNames(); }
public int remove(java.lang.String name) { return wrapperContained.remove(name); }
// public yarnwrap.nbt.NbtCompound serialize(Object event) { return new yarnwrap.nbt.NbtCompound(wrapperContained.serialize(event)); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
public void setEvent(java.lang.String name,long triggerTime,yarnwrap.world.timer.TimerCallback callback) { wrapperContained.setEvent(name,triggerTime,callback.wrapperContained); }
// public void addEvent(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.addEvent(nbt.wrapperContained); }
// public java.util.Comparator createEventComparator() { return wrapperContained.createEventComparator(); }
public void processEvents(java.lang.Object server,long time) { wrapperContained.processEvents(server,time); }

}