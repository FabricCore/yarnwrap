package yarnwrap.entity.ai.brain;
public class Brain { public net.minecraft.entity.ai.brain.Brain wrapperContained; public Brain(net.minecraft.entity.ai.brain.Brain wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map memories() { return wrapperContained.memories; }
// public java.util.Map sensors() { return wrapperContained.sensors; }
// public java.util.Map tasks() { return wrapperContained.tasks; }
// public yarnwrap.entity.ai.brain.Schedule schedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.schedule); }
// public java.util.Map requiredActivityMemories() { return wrapperContained.requiredActivityMemories; }
// public java.util.Set coreActivities() { return wrapperContained.coreActivities; }
// public java.util.Set possibleActivities() { return wrapperContained.possibleActivities; }
// public yarnwrap.entity.ai.brain.Activity defaultActivity() { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.defaultActivity); }
// public long activityStartTime() { return wrapperContained.activityStartTime; }
// public java.util.Map forgettingActivityMemories() { return wrapperContained.forgettingActivityMemories; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.function.Supplier codecSupplier() { return wrapperContained.codecSupplier; }
// public int ACTIVITY_REFRESH_COOLDOWN() { return wrapperContained.ACTIVITY_REFRESH_COOLDOWN; }
public void refreshActivities(long timeOfDay,long time) { wrapperContained.refreshActivities(timeOfDay,time); }
// public boolean canDoActivity(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.canDoActivity(activity.wrapperContained); }
public void forget(yarnwrap.entity.ai.brain.MemoryModuleType type) { wrapperContained.forget(type.wrapperContained); }
public boolean isMemoryInState(yarnwrap.entity.ai.brain.MemoryModuleType type,yarnwrap.entity.ai.brain.MemoryModuleState state) { return wrapperContained.isMemoryInState(type.wrapperContained,state.wrapperContained); }
public void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value) { wrapperContained.remember(type.wrapperContained,value); }
public void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.util.Optional value) { wrapperContained.remember(type.wrapperContained,value); }
// public void resetPossibleActivities(yarnwrap.entity.ai.brain.Activity except) { wrapperContained.resetPossibleActivities(except.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks) { wrapperContained.setTaskList(activity.wrapperContained,indexedTasks); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList list) { wrapperContained.setTaskList(activity.wrapperContained,begin,list); }
public void setSchedule(yarnwrap.entity.ai.brain.Schedule schedule) { wrapperContained.setSchedule(schedule.wrapperContained); }
public void setCoreActivities(java.util.Set coreActivities) { wrapperContained.setCoreActivities(coreActivities); }
// public void startTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.startTasks(world.wrapperContained,entity.wrapperContained); }
public yarnwrap.entity.ai.brain.Schedule getSchedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.getSchedule()); }
public boolean hasMemoryModule(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.hasMemoryModule(type.wrapperContained); }
public void setDefaultActivity(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.setDefaultActivity(activity.wrapperContained); }
public void stopAllTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.stopAllTasks(world.wrapperContained,entity.wrapperContained); }
public java.util.Optional getOptionalRegisteredMemory(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getOptionalRegisteredMemory(type.wrapperContained); }
public boolean hasActivity(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.hasActivity(activity.wrapperContained); }
public yarnwrap.entity.ai.brain.Brain copy() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.copy()); }
public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.tick(world.wrapperContained,entity.wrapperContained); }
// public void updateTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.updateTasks(world.wrapperContained,entity.wrapperContained); }
// public boolean isEmptyCollection(java.lang.Object value) { return wrapperContained.isEmptyCollection(value); }
// public com.google.common.collect.ImmutableList indexTaskList(int begin,com.google.common.collect.ImmutableList tasks) { return wrapperContained.indexTaskList(begin,tasks); }
public void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value,long expiry) { wrapperContained.remember(type.wrapperContained,value,expiry); }
public void doExclusively(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.doExclusively(activity.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList tasks,yarnwrap.entity.ai.brain.MemoryModuleType memoryType) { wrapperContained.setTaskList(activity.wrapperContained,begin,tasks,memoryType.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks,java.util.Set requiredMemories) { wrapperContained.setTaskList(activity.wrapperContained,indexedTasks,requiredMemories); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks,java.util.Set requiredMemories,java.util.Set forgettingMemories) { wrapperContained.setTaskList(activity.wrapperContained,indexedTasks,requiredMemories,forgettingMemories); }
public void resetPossibleActivities(java.util.List activities) { wrapperContained.resetPossibleActivities(activities); }
// public void setMemory(yarnwrap.entity.ai.brain.MemoryModuleType type,java.util.Optional memory) { wrapperContained.setMemory(type.wrapperContained,memory); }
public void resetPossibleActivities() { wrapperContained.resetPossibleActivities(); }
// public void forgetIrrelevantMemories(yarnwrap.entity.ai.brain.Activity except) { wrapperContained.forgetIrrelevantMemories(except.wrapperContained); }
public java.util.Optional getFirstPossibleNonCoreActivity() { return wrapperContained.getFirstPossibleNonCoreActivity(); }
// public void tickSensors(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.tickSensors(world.wrapperContained,entity.wrapperContained); }
public java.util.List getRunningTasks() { return wrapperContained.getRunningTasks(); }
// public void tickMemories() { wrapperContained.tickMemories(); }
public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps ops) { return wrapperContained.encode(ops); }
public Object createProfile(java.util.Collection memoryModules,java.util.Collection sensors) { return wrapperContained.createProfile(memoryModules,sensors); }
public com.mojang.serialization.Codec createBrainCodec(java.util.Collection memoryModules,java.util.Collection sensors) { return wrapperContained.createBrainCodec(memoryModules,sensors); }
// public java.util.stream.Stream streamMemories() { return wrapperContained.streamMemories(); }
public boolean hasMemoryModuleWithValue(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value) { return wrapperContained.hasMemoryModuleWithValue(type.wrapperContained,value); }
public java.util.Map getMemories() { return wrapperContained.getMemories(); }
public java.util.Set getPossibleActivities() { return wrapperContained.getPossibleActivities(); }
public void clear() { wrapperContained.clear(); }
public long getMemoryExpiry(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getMemoryExpiry(type.wrapperContained); }
public java.util.Optional getOptionalMemory(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getOptionalMemory(type.wrapperContained); }
public void forgetAll() { wrapperContained.forgetAll(); }

}