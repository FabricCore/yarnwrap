package yarnwrap.entity.ai.brain;
public class Brain { public net.minecraft.entity.ai.brain.Brain wrapperContained; public Brain(net.minecraft.entity.ai.brain.Brain wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map memories() { return wrapperContained.memories; }
// public void memories(java.util.Map value) { wrapperContained.memories = value; }
// public static java.util.Map memories() { return net.minecraft.entity.ai.brain.Brain.memories; }
// public static void memories(java.util.Map value, ) { net.minecraft.entity.ai.brain.Brain.memories = value; }

// public java.util.Map sensors() { return wrapperContained.sensors; }
// public void sensors(java.util.Map value) { wrapperContained.sensors = value; }
// public static java.util.Map sensors() { return net.minecraft.entity.ai.brain.Brain.sensors; }
// public static void sensors(java.util.Map value, ) { net.minecraft.entity.ai.brain.Brain.sensors = value; }

// public java.util.Map tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.Map value) { wrapperContained.tasks = value; }
// public static java.util.Map tasks() { return net.minecraft.entity.ai.brain.Brain.tasks; }
// public static void tasks(java.util.Map value, ) { net.minecraft.entity.ai.brain.Brain.tasks = value; }

// public yarnwrap.entity.ai.brain.Schedule schedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.schedule); }
// public void schedule(yarnwrap.entity.ai.brain.Schedule value) { wrapperContained.schedule = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.Schedule schedule() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.Brain.schedule); }
// public static void schedule(yarnwrap.entity.ai.brain.Schedule value, ) { net.minecraft.entity.ai.brain.Brain.schedule = value.wrapperContained; }

// public java.util.Map requiredActivityMemories() { return wrapperContained.requiredActivityMemories; }
// public void requiredActivityMemories(java.util.Map value) { wrapperContained.requiredActivityMemories = value; }
// public static java.util.Map requiredActivityMemories() { return net.minecraft.entity.ai.brain.Brain.requiredActivityMemories; }
// public static void requiredActivityMemories(java.util.Map value, ) { net.minecraft.entity.ai.brain.Brain.requiredActivityMemories = value; }

// public java.util.Set coreActivities() { return wrapperContained.coreActivities; }
// public void coreActivities(java.util.Set value) { wrapperContained.coreActivities = value; }
// public static java.util.Set coreActivities() { return net.minecraft.entity.ai.brain.Brain.coreActivities; }
// public static void coreActivities(java.util.Set value, ) { net.minecraft.entity.ai.brain.Brain.coreActivities = value; }

// public java.util.Set possibleActivities() { return wrapperContained.possibleActivities; }
// public void possibleActivities(java.util.Set value) { wrapperContained.possibleActivities = value; }
// public static java.util.Set possibleActivities() { return net.minecraft.entity.ai.brain.Brain.possibleActivities; }
// public static void possibleActivities(java.util.Set value, ) { net.minecraft.entity.ai.brain.Brain.possibleActivities = value; }

// public yarnwrap.entity.ai.brain.Activity defaultActivity() { return new yarnwrap.entity.ai.brain.Activity(wrapperContained.defaultActivity); }
// public void defaultActivity(yarnwrap.entity.ai.brain.Activity value) { wrapperContained.defaultActivity = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.Activity defaultActivity() { return new yarnwrap.entity.ai.brain.Activity(net.minecraft.entity.ai.brain.Brain.defaultActivity); }
// public static void defaultActivity(yarnwrap.entity.ai.brain.Activity value, ) { net.minecraft.entity.ai.brain.Brain.defaultActivity = value.wrapperContained; }

// public long activityStartTime() { return wrapperContained.activityStartTime; }
// public void activityStartTime(long value) { wrapperContained.activityStartTime = value; }
// public static long activityStartTime() { return net.minecraft.entity.ai.brain.Brain.activityStartTime; }
// public static void activityStartTime(long value, ) { net.minecraft.entity.ai.brain.Brain.activityStartTime = value; }

// public java.util.Map forgettingActivityMemories() { return wrapperContained.forgettingActivityMemories; }
// public void forgettingActivityMemories(java.util.Map value) { wrapperContained.forgettingActivityMemories = value; }
// public static java.util.Map forgettingActivityMemories() { return net.minecraft.entity.ai.brain.Brain.forgettingActivityMemories; }
// public static void forgettingActivityMemories(java.util.Map value, ) { net.minecraft.entity.ai.brain.Brain.forgettingActivityMemories = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.ai.brain.Brain.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.ai.brain.Brain.LOGGER = value; }

// public java.util.function.Supplier codecSupplier() { return wrapperContained.codecSupplier; }
// public void codecSupplier(java.util.function.Supplier value) { wrapperContained.codecSupplier = value; }
// public static java.util.function.Supplier codecSupplier() { return net.minecraft.entity.ai.brain.Brain.codecSupplier; }
// public static void codecSupplier(java.util.function.Supplier value, ) { net.minecraft.entity.ai.brain.Brain.codecSupplier = value; }

// public int ACTIVITY_REFRESH_COOLDOWN() { return wrapperContained.ACTIVITY_REFRESH_COOLDOWN; }
// public void ACTIVITY_REFRESH_COOLDOWN(int value) { wrapperContained.ACTIVITY_REFRESH_COOLDOWN = value; }
// public static int ACTIVITY_REFRESH_COOLDOWN() { return net.minecraft.entity.ai.brain.Brain.ACTIVITY_REFRESH_COOLDOWN; }
// public static void ACTIVITY_REFRESH_COOLDOWN(int value, ) { net.minecraft.entity.ai.brain.Brain.ACTIVITY_REFRESH_COOLDOWN = value; }

public Brain(java.util.Collection memories,java.util.Collection sensors,com.google.common.collect.ImmutableList memoryEntries,java.util.function.Supplier codecSupplier) { this.wrapperContained = new net.minecraft.entity.ai.brain.Brain(memories,sensors,memoryEntries,codecSupplier); }
public void refreshActivities(long timeOfDay,long time) { wrapperContained.refreshActivities(timeOfDay,time); }
// public static void refreshActivities(long timeOfDay,long time, ) { net.minecraft.entity.ai.brain.Brain.refreshActivities(timeOfDay,time); }
// public boolean canDoActivity(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.canDoActivity(activity.wrapperContained); }
// public static boolean canDoActivity(yarnwrap.entity.ai.brain.Activity activity, ) { return net.minecraft.entity.ai.brain.Brain.canDoActivity(activity.wrapperContained); }
public void forget(yarnwrap.entity.ai.brain.MemoryModuleType type) { wrapperContained.forget(type.wrapperContained); }
// public static void forget(yarnwrap.entity.ai.brain.MemoryModuleType type, ) { net.minecraft.entity.ai.brain.Brain.forget(type.wrapperContained); }
public boolean isMemoryInState(yarnwrap.entity.ai.brain.MemoryModuleType type,yarnwrap.entity.ai.brain.MemoryModuleState state) { return wrapperContained.isMemoryInState(type.wrapperContained,state.wrapperContained); }
// public static boolean isMemoryInState(yarnwrap.entity.ai.brain.MemoryModuleType type,yarnwrap.entity.ai.brain.MemoryModuleState state, ) { return net.minecraft.entity.ai.brain.Brain.isMemoryInState(type.wrapperContained,state.wrapperContained); }
public void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value) { wrapperContained.remember(type.wrapperContained,value); }
// public static void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value, ) { net.minecraft.entity.ai.brain.Brain.remember(type.wrapperContained,value); }
public void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.util.Optional value) { wrapperContained.remember(type.wrapperContained,value); }
// public static void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.util.Optional value, ) { net.minecraft.entity.ai.brain.Brain.remember(type.wrapperContained,value); }
// public void resetPossibleActivities(yarnwrap.entity.ai.brain.Activity except) { wrapperContained.resetPossibleActivities(except.wrapperContained); }
// public static void resetPossibleActivities(yarnwrap.entity.ai.brain.Activity except, ) { net.minecraft.entity.ai.brain.Brain.resetPossibleActivities(except.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks) { wrapperContained.setTaskList(activity.wrapperContained,indexedTasks); }
// public static void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks, ) { net.minecraft.entity.ai.brain.Brain.setTaskList(activity.wrapperContained,indexedTasks); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList list) { wrapperContained.setTaskList(activity.wrapperContained,begin,list); }
// public static void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList list, ) { net.minecraft.entity.ai.brain.Brain.setTaskList(activity.wrapperContained,begin,list); }
public void setSchedule(yarnwrap.entity.ai.brain.Schedule schedule) { wrapperContained.setSchedule(schedule.wrapperContained); }
// public static void setSchedule(yarnwrap.entity.ai.brain.Schedule schedule, ) { net.minecraft.entity.ai.brain.Brain.setSchedule(schedule.wrapperContained); }
// public java.util.Map method_18887(java.lang.Integer index) { return wrapperContained.method_18887(index); }
// public static java.util.Map method_18887(java.lang.Integer index, ) { return net.minecraft.entity.ai.brain.Brain.method_18887(index); }
public void setCoreActivities(java.util.Set coreActivities) { wrapperContained.setCoreActivities(coreActivities); }
// public static void setCoreActivities(java.util.Set coreActivities, ) { net.minecraft.entity.ai.brain.Brain.setCoreActivities(coreActivities); }
// public void startTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.startTasks(world.wrapperContained,entity.wrapperContained); }
// public static void startTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.ai.brain.Brain.startTasks(world.wrapperContained,entity.wrapperContained); }
public yarnwrap.entity.ai.brain.Schedule getSchedule() { return new yarnwrap.entity.ai.brain.Schedule(wrapperContained.getSchedule()); }
// public static yarnwrap.entity.ai.brain.Schedule getSchedule() { return new yarnwrap.entity.ai.brain.Schedule(net.minecraft.entity.ai.brain.Brain.getSchedule()); }
public boolean hasMemoryModule(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.hasMemoryModule(type.wrapperContained); }
// public static boolean hasMemoryModule(yarnwrap.entity.ai.brain.MemoryModuleType type, ) { return net.minecraft.entity.ai.brain.Brain.hasMemoryModule(type.wrapperContained); }
public void setDefaultActivity(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.setDefaultActivity(activity.wrapperContained); }
// public static void setDefaultActivity(yarnwrap.entity.ai.brain.Activity activity, ) { net.minecraft.entity.ai.brain.Brain.setDefaultActivity(activity.wrapperContained); }
public void stopAllTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.stopAllTasks(world.wrapperContained,entity.wrapperContained); }
// public static void stopAllTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.ai.brain.Brain.stopAllTasks(world.wrapperContained,entity.wrapperContained); }
public java.util.Optional getOptionalRegisteredMemory(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getOptionalRegisteredMemory(type.wrapperContained); }
// public static java.util.Optional getOptionalRegisteredMemory(yarnwrap.entity.ai.brain.MemoryModuleType type, ) { return net.minecraft.entity.ai.brain.Brain.getOptionalRegisteredMemory(type.wrapperContained); }
public boolean hasActivity(yarnwrap.entity.ai.brain.Activity activity) { return wrapperContained.hasActivity(activity.wrapperContained); }
// public static boolean hasActivity(yarnwrap.entity.ai.brain.Activity activity, ) { return net.minecraft.entity.ai.brain.Brain.hasActivity(activity.wrapperContained); }
// public java.util.Set method_18910(yarnwrap.entity.ai.brain.Activity activity2) { return wrapperContained.method_18910(activity2.wrapperContained); }
// public static java.util.Set method_18910(yarnwrap.entity.ai.brain.Activity activity2, ) { return net.minecraft.entity.ai.brain.Brain.method_18910(activity2.wrapperContained); }
public yarnwrap.entity.ai.brain.Brain copy() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.copy()); }
// public static yarnwrap.entity.ai.brain.Brain copy() { return new yarnwrap.entity.ai.brain.Brain(net.minecraft.entity.ai.brain.Brain.copy()); }
public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.tick(world.wrapperContained,entity.wrapperContained); }
// public static void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.ai.brain.Brain.tick(world.wrapperContained,entity.wrapperContained); }
// public void updateTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.updateTasks(world.wrapperContained,entity.wrapperContained); }
// public static void updateTasks(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.ai.brain.Brain.updateTasks(world.wrapperContained,entity.wrapperContained); }
// public boolean isEmptyCollection(java.lang.Object value) { return wrapperContained.isEmptyCollection(value); }
// public static boolean isEmptyCollection(java.lang.Object value, ) { return net.minecraft.entity.ai.brain.Brain.isEmptyCollection(value); }
// public com.google.common.collect.ImmutableList indexTaskList(int begin,com.google.common.collect.ImmutableList tasks) { return wrapperContained.indexTaskList(begin,tasks); }
// public static com.google.common.collect.ImmutableList indexTaskList(int begin,com.google.common.collect.ImmutableList tasks, ) { return net.minecraft.entity.ai.brain.Brain.indexTaskList(begin,tasks); }
public void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value,long expiry) { wrapperContained.remember(type.wrapperContained,value,expiry); }
// public static void remember(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value,long expiry, ) { net.minecraft.entity.ai.brain.Brain.remember(type.wrapperContained,value,expiry); }
public void doExclusively(yarnwrap.entity.ai.brain.Activity activity) { wrapperContained.doExclusively(activity.wrapperContained); }
// public static void doExclusively(yarnwrap.entity.ai.brain.Activity activity, ) { net.minecraft.entity.ai.brain.Brain.doExclusively(activity.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList tasks,yarnwrap.entity.ai.brain.MemoryModuleType memoryType) { wrapperContained.setTaskList(activity.wrapperContained,begin,tasks,memoryType.wrapperContained); }
// public static void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList tasks,yarnwrap.entity.ai.brain.MemoryModuleType memoryType, ) { net.minecraft.entity.ai.brain.Brain.setTaskList(activity.wrapperContained,begin,tasks,memoryType.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks,java.util.Set requiredMemories) { wrapperContained.setTaskList(activity.wrapperContained,indexedTasks,requiredMemories); }
// public static void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks,java.util.Set requiredMemories, ) { net.minecraft.entity.ai.brain.Brain.setTaskList(activity.wrapperContained,indexedTasks,requiredMemories); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks,java.util.Set requiredMemories,java.util.Set forgettingMemories) { wrapperContained.setTaskList(activity.wrapperContained,indexedTasks,requiredMemories,forgettingMemories); }
// public static void setTaskList(yarnwrap.entity.ai.brain.Activity activity,com.google.common.collect.ImmutableList indexedTasks,java.util.Set requiredMemories,java.util.Set forgettingMemories, ) { net.minecraft.entity.ai.brain.Brain.setTaskList(activity.wrapperContained,indexedTasks,requiredMemories,forgettingMemories); }
public void resetPossibleActivities(java.util.List activities) { wrapperContained.resetPossibleActivities(activities); }
// public static void resetPossibleActivities(java.util.List activities, ) { net.minecraft.entity.ai.brain.Brain.resetPossibleActivities(activities); }
// public void setMemory(yarnwrap.entity.ai.brain.MemoryModuleType type,java.util.Optional memory) { wrapperContained.setMemory(type.wrapperContained,memory); }
// public static void setMemory(yarnwrap.entity.ai.brain.MemoryModuleType type,java.util.Optional memory, ) { net.minecraft.entity.ai.brain.Brain.setMemory(type.wrapperContained,memory); }
public void resetPossibleActivities() { wrapperContained.resetPossibleActivities(); }
// public static void resetPossibleActivities() { net.minecraft.entity.ai.brain.Brain.resetPossibleActivities(); }
// public void forgetIrrelevantMemories(yarnwrap.entity.ai.brain.Activity except) { wrapperContained.forgetIrrelevantMemories(except.wrapperContained); }
// public static void forgetIrrelevantMemories(yarnwrap.entity.ai.brain.Activity except, ) { net.minecraft.entity.ai.brain.Brain.forgetIrrelevantMemories(except.wrapperContained); }
public java.util.Optional getFirstPossibleNonCoreActivity() { return wrapperContained.getFirstPossibleNonCoreActivity(); }
// public static java.util.Optional getFirstPossibleNonCoreActivity() { return net.minecraft.entity.ai.brain.Brain.getFirstPossibleNonCoreActivity(); }
// public void tickSensors(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.tickSensors(world.wrapperContained,entity.wrapperContained); }
// public static void tickSensors(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.ai.brain.Brain.tickSensors(world.wrapperContained,entity.wrapperContained); }
public java.util.List getRunningTasks() { return wrapperContained.getRunningTasks(); }
// public static java.util.List getRunningTasks() { return net.minecraft.entity.ai.brain.Brain.getRunningTasks(); }
// public void tickMemories() { wrapperContained.tickMemories(); }
// public static void tickMemories() { net.minecraft.entity.ai.brain.Brain.tickMemories(); }
public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps ops) { return wrapperContained.encode(ops); }
// public static com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.entity.ai.brain.Brain.encode(ops); }
// public Object createProfile(java.util.Collection memoryModules,java.util.Collection sensors) { return wrapperContained.createProfile(memoryModules,sensors); }
// public static Object createProfile(java.util.Collection memoryModules,java.util.Collection sensors, ) { return net.minecraft.entity.ai.brain.Brain.createProfile(memoryModules,sensors); }
// public Object method_28312(Object entry) { return wrapperContained.method_28312(entry); }
// public static Object method_28312(Object entry, ) { return net.minecraft.entity.ai.brain.Brain.method_28312(entry); }
// public com.mojang.serialization.Codec createBrainCodec(java.util.Collection memoryModules,java.util.Collection sensors) { return wrapperContained.createBrainCodec(memoryModules,sensors); }
// public static com.mojang.serialization.Codec createBrainCodec(java.util.Collection memoryModules,java.util.Collection sensors, ) { return net.minecraft.entity.ai.brain.Brain.createBrainCodec(memoryModules,sensors); }
// public java.util.stream.Stream streamMemories() { return wrapperContained.streamMemories(); }
// public static java.util.stream.Stream streamMemories() { return net.minecraft.entity.ai.brain.Brain.streamMemories(); }
// public boolean method_29518(java.lang.Object memoryValue) { return wrapperContained.method_29518(memoryValue); }
// public static boolean method_29518(java.lang.Object memoryValue, ) { return net.minecraft.entity.ai.brain.Brain.method_29518(memoryValue); }
public boolean hasMemoryModuleWithValue(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value) { return wrapperContained.hasMemoryModuleWithValue(type.wrapperContained,value); }
// public static boolean hasMemoryModuleWithValue(yarnwrap.entity.ai.brain.MemoryModuleType type,java.lang.Object value, ) { return net.minecraft.entity.ai.brain.Brain.hasMemoryModuleWithValue(type.wrapperContained,value); }
public java.util.Map getMemories() { return wrapperContained.getMemories(); }
// public static java.util.Map getMemories() { return net.minecraft.entity.ai.brain.Brain.getMemories(); }
public java.util.Set getPossibleActivities() { return wrapperContained.getPossibleActivities(); }
// public static java.util.Set getPossibleActivities() { return net.minecraft.entity.ai.brain.Brain.getPossibleActivities(); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.entity.ai.brain.Brain.clear(); }
public long getMemoryExpiry(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getMemoryExpiry(type.wrapperContained); }
// public static long getMemoryExpiry(yarnwrap.entity.ai.brain.MemoryModuleType type, ) { return net.minecraft.entity.ai.brain.Brain.getMemoryExpiry(type.wrapperContained); }
public java.util.Optional getOptionalMemory(yarnwrap.entity.ai.brain.MemoryModuleType type) { return wrapperContained.getOptionalMemory(type.wrapperContained); }
// public static java.util.Optional getOptionalMemory(yarnwrap.entity.ai.brain.MemoryModuleType type, ) { return net.minecraft.entity.ai.brain.Brain.getOptionalMemory(type.wrapperContained); }
public void forgetAll() { wrapperContained.forgetAll(); }
// public static void forgetAll() { net.minecraft.entity.ai.brain.Brain.forgetAll(); }
// public void method_49710(yarnwrap.entity.ai.brain.MemoryModuleType type) { wrapperContained.method_49710(type.wrapperContained); }
// public static void method_49710(yarnwrap.entity.ai.brain.MemoryModuleType type, ) { net.minecraft.entity.ai.brain.Brain.method_49710(type.wrapperContained); }
public void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList tasks,java.util.Set requiredMemories) { wrapperContained.setTaskList(activity.wrapperContained,begin,tasks,requiredMemories); }
// public static void setTaskList(yarnwrap.entity.ai.brain.Activity activity,int begin,com.google.common.collect.ImmutableList tasks,java.util.Set requiredMemories, ) { net.minecraft.entity.ai.brain.Brain.setTaskList(activity.wrapperContained,begin,tasks,requiredMemories); }

}