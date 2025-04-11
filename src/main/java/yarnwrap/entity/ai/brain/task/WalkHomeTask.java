package yarnwrap.entity.ai.brain.task;
public class WalkHomeTask { public net.minecraft.entity.ai.brain.task.WalkHomeTask wrapperContained; public WalkHomeTask(net.minecraft.entity.ai.brain.task.WalkHomeTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int POI_EXPIRY() { return wrapperContained.POI_EXPIRY; }
// public void POI_EXPIRY(int value) { wrapperContained.POI_EXPIRY = value; }
// public int MAX_TRIES() { return wrapperContained.MAX_TRIES; }
// public void MAX_TRIES(int value) { wrapperContained.MAX_TRIES = value; }
// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }
// public boolean method_47049(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_47049(poiType.wrapperContained); }
// public boolean method_47050(it.unimi.dsi.fastutil.longs.Long2LongMap pos) { return wrapperContained.method_47050(pos); }
// public boolean method_47051(org.apache.commons.lang3.mutable.MutableLong entry) { return wrapperContained.method_47051(entry); }
// public com.mojang.datafixers.kinds.App method_47052(org.apache.commons.lang3.mutable.MutableLong context) { return wrapperContained.method_47052(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47053(org.apache.commons.lang3.mutable.MutableLong walkTarget,it.unimi.dsi.fastutil.longs.Long2LongMap home) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47053(walkTarget,home)); }
// public boolean method_47054(org.apache.commons.lang3.mutable.MutableLong world,it.unimi.dsi.fastutil.longs.Long2LongMap entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47054(world,entity,time.wrapperContained); }
// public boolean method_47055(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_47055(poiType.wrapperContained); }

}