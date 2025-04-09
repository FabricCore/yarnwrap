package yarnwrap.entity.ai.brain.task;
public class VillagerTaskListProvider { public net.minecraft.entity.ai.brain.task.VillagerTaskListProvider wrapperContained; public VillagerTaskListProvider(net.minecraft.entity.ai.brain.task.VillagerTaskListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public float JOB_WALKING_SPEED() { return wrapperContained.JOB_WALKING_SPEED; }
public com.google.common.collect.ImmutableList createCoreTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createCoreTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createWorkTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createWorkTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createRestTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createRestTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createMeetTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createMeetTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createIdleTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createIdleTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createPanicTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createPanicTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createPlayTasks(float speed) { return wrapperContained.createPlayTasks(speed); }
public com.google.common.collect.ImmutableList createPreRaidTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createPreRaidTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createRaidTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createRaidTasks(profession.wrapperContained,speed); }
public com.google.common.collect.ImmutableList createHideTasks(yarnwrap.village.VillagerProfession profession,float speed) { return wrapperContained.createHideTasks(profession.wrapperContained,speed); }
// public com.mojang.datafixers.util.Pair createFreeFollowTask() { return wrapperContained.createFreeFollowTask(); }
// public com.mojang.datafixers.util.Pair createBusyFollowTask() { return wrapperContained.createBusyFollowTask(); }
// public boolean hasActiveRaid(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasActiveRaid(world.wrapperContained,entity.wrapperContained); }
// public boolean wonRaid(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { return wrapperContained.wonRaid(world.wrapperContained,entity.wrapperContained); }

}