package yarnwrap.entity.ai.brain.task;
public class MeetVillagerTask { public net.minecraft.entity.ai.brain.task.MeetVillagerTask wrapperContained; public MeetVillagerTask(net.minecraft.entity.ai.brain.task.MeetVillagerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public float WALK_SPEED() { return wrapperContained.WALK_SPEED; }
// public void WALK_SPEED(float value) { wrapperContained.WALK_SPEED = value; }
// public static float WALK_SPEED() { return net.minecraft.entity.ai.brain.task.MeetVillagerTask.WALK_SPEED; }
// public static void WALK_SPEED(float value, ) { net.minecraft.entity.ai.brain.task.MeetVillagerTask.WALK_SPEED = value; }

// public yarnwrap.entity.ai.brain.task.SingleTickTask create() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.SingleTickTask create() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(net.minecraft.entity.ai.brain.task.MeetVillagerTask.create()); }
// public boolean method_47112(yarnwrap.entity.LivingEntity target) { return wrapperContained.method_47112(target.wrapperContained); }
// public static boolean method_47112(yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.task.MeetVillagerTask.method_47112(target.wrapperContained); }
// public boolean method_47113(yarnwrap.entity.LivingEntity target) { return wrapperContained.method_47113(target.wrapperContained); }
// public static boolean method_47113(yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.task.MeetVillagerTask.method_47113(target.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_47114(Object context) { return wrapperContained.method_47114(context); }
// public static com.mojang.datafixers.kinds.App method_47114(Object context, ) { return net.minecraft.entity.ai.brain.task.MeetVillagerTask.method_47114(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47115(Object walkTarget,yarnwrap.entity.ai.brain.MemoryQueryResult lookTarget,yarnwrap.entity.ai.brain.MemoryQueryResult meetingPoint,yarnwrap.entity.ai.brain.MemoryQueryResult visibleMobs,yarnwrap.entity.ai.brain.MemoryQueryResult interactionTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47115(walkTarget,lookTarget.wrapperContained,meetingPoint.wrapperContained,visibleMobs.wrapperContained,interactionTarget.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47115(Object walkTarget,yarnwrap.entity.ai.brain.MemoryQueryResult lookTarget,yarnwrap.entity.ai.brain.MemoryQueryResult meetingPoint,yarnwrap.entity.ai.brain.MemoryQueryResult visibleMobs,yarnwrap.entity.ai.brain.MemoryQueryResult interactionTarget, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.MeetVillagerTask.method_47115(walkTarget,lookTarget.wrapperContained,meetingPoint.wrapperContained,visibleMobs.wrapperContained,interactionTarget.wrapperContained)); }
// public boolean method_47116(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47116(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47116(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.MeetVillagerTask.method_47116(world,entity.wrapperContained,time.wrapperContained); }
// public void method_47117(yarnwrap.entity.ai.brain.MemoryQueryResult target) { wrapperContained.method_47117(target.wrapperContained); }
// public static void method_47117(yarnwrap.entity.ai.brain.MemoryQueryResult target, ) { net.minecraft.entity.ai.brain.task.MeetVillagerTask.method_47117(target.wrapperContained); }

}