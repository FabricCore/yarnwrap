package yarnwrap.entity.ai.brain;
public class Brain { public net.minecraft.entity.ai.brain.Brain wrapperContained; public Brain(net.minecraft.entity.ai.brain.Brain wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map memories() { return wrapperContained.memories; }
// public void memories(java.util.Map value) { wrapperContained.memories = value; }
// public java.util.Map sensors() { return wrapperContained.sensors; }
// public void sensors(java.util.Map value) { wrapperContained.sensors = value; }
// public java.util.Map tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.Map value) { wrapperContained.tasks = value; }
// public yarnwrap.entity.ai.brain.Schedule schedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.schedule); }
// public void schedule(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.schedule = value.wrapperContained; }
// public java.util.Map requiredActivityMemories() { return wrapperContained.requiredActivityMemories; }
// public void requiredActivityMemories(java.util.Map value) { wrapperContained.requiredActivityMemories = value; }
// public java.util.Set coreActivities() { return wrapperContained.coreActivities; }
// public void coreActivities(java.util.Set value) { wrapperContained.coreActivities = value; }
// public java.util.Set possibleActivities() { return wrapperContained.possibleActivities; }
// public void possibleActivities(java.util.Set value) { wrapperContained.possibleActivities = value; }
// public yarnwrap.entity.ai.brain.Activity defaultActivity() { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.defaultActivity); }
// public void defaultActivity(yarnwrap.entity.ai.brain.Activity value) { wrapperContained.defaultActivity = value.wrapperContained; }
// public long activityStartTime() { return wrapperContained.activityStartTime; }
// public void activityStartTime(long value) { wrapperContained.activityStartTime = value; }
// public java.util.Map forgettingActivityMemories() { return wrapperContained.forgettingActivityMemories; }
// public void forgettingActivityMemories(java.util.Map value) { wrapperContained.forgettingActivityMemories = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.function.Supplier codecSupplier() { return wrapperContained.codecSupplier; }
// public void codecSupplier(java.util.function.Supplier value) { wrapperContained.codecSupplier = value; }
// public int ACTIVITY_REFRESH_COOLDOWN() { return wrapperContained.ACTIVITY_REFRESH_COOLDOWN; }
// public void ACTIVITY_REFRESH_COOLDOWN(int value) { wrapperContained.ACTIVITY_REFRESH_COOLDOWN = value; }
public Brain(java.util.Collection memories,java.util.Collection sensors,com.google.common.collect.ImmutableList memoryEntries,java.util.function.Supplier codecSupplier) { this.wrapperContained = new net.minecraft.entity.ai.brain.Brain(memories,sensors,memoryEntries,codecSupplier); }
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
// public java.util.Map method_18887(java.lang.Integer index) { return wrapperContained.method_18887(index); }
public void setCoreActivities(java.util.Set coreActivities) { wrapperContained.setCoreActivities(coreActivities); }
// public void startTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.startTasks(world.wrapperContained,entity.wrapperContained); }
public yarnwrap.entity.ai.brain.Schedule getSchedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.getSchedule()); }
public boolean hasMemoryModule(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.hasMemoryModule(type.wrapperContained); }
public void setDefaultActivity(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.setDefaultActivity(activity.wrapperContained); }
public void stopAllTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.stopAllTasks(world.wrapperContained,entity.wrapperContained); }
public java.util.Optional getOptionalRegisteredMemory(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getOptionalRegisteredMemory(type.wrapperContained); }
public boolean hasActivity(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.hasActivity(activity.wrapperContained); }
// public java.util.Set method_18910(yarnwrap.entity.ai.brain.Activity activity2) { return wrapperContained.method_18910(activity2.wrapperContained); }
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
// public Object method_28312(Object entry) { return wrapperContained.method_28312(entry); }
public com.mojang.serialization.Codec createBrainCodec(java.util.Collection memoryModules,java.util.Collection sensors) { return wrapperContained.createBrainCodec(memoryModules,sensors); }
// public java.util.stream.Stream streamMemories() { return wrapperContained.streamMemories(); }
// public boolean method_29518(java.lang.Object memoryValue) { return wrapperContained.method_29518(memoryValue); }
public boolean hasMemoryModuleWithValue(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value) { return wrapperContained.hasMemoryModuleWithValue(type.wrapperContained,value); }
public java.util.Map getMemories() { return wrapperContained.getMemories(); }
public java.util.Set getPossibleActivities() { return wrapperContained.getPossibleActivities(); }
public void clear() { wrapperContained.clear(); }
public long getMemoryExpiry(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getMemoryExpiry(type.wrapperContained); }
public java.util.Optional getOptionalMemory(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getOptionalMemory(type.wrapperContained); }
public void forgetAll() { wrapperContained.forgetAll(); }
// public void method_49710(yarnwrap.entity.ai.brain.MemoryModuleType type) { wrapperContained.method_49710(type.wrapperContained); }

}