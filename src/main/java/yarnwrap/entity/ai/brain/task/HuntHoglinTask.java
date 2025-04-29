package yarnwrap.entity.ai.brain.task;
public class HuntHoglinTask { public net.minecraft.entity.ai.brain.task.HuntHoglinTask wrapperContained; public HuntHoglinTask(net.minecraft.entity.ai.brain.task.HuntHoglinTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.SingleTickTask create() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.SingleTickTask create() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(net.minecraft.entity.ai.brain.task.HuntHoglinTask.create()); }
// public com.mojang.datafixers.kinds.App method_47284(Object context) { return wrapperContained.method_47284(context); }
// public static com.mojang.datafixers.kinds.App method_47284(Object context, ) { return net.minecraft.entity.ai.brain.task.HuntHoglinTask.method_47284(context); }
// public boolean method_47285(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47285(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47285(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.HuntHoglinTask.method_47285(world,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47286(Object nearestVisibleHuntableHoglin,yarnwrap.entity.ai.brain.MemoryQueryResult angryAt,yarnwrap.entity.ai.brain.MemoryQueryResult huntedRecently,yarnwrap.entity.ai.brain.MemoryQueryResult nearestVisibleAdultPiglins) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47286(nearestVisibleHuntableHoglin,angryAt.wrapperContained,huntedRecently.wrapperContained,nearestVisibleAdultPiglins.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47286(Object nearestVisibleHuntableHoglin,yarnwrap.entity.ai.brain.MemoryQueryResult angryAt,yarnwrap.entity.ai.brain.MemoryQueryResult huntedRecently,yarnwrap.entity.ai.brain.MemoryQueryResult nearestVisibleAdultPiglins, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.HuntHoglinTask.method_47286(nearestVisibleHuntableHoglin,angryAt.wrapperContained,huntedRecently.wrapperContained,nearestVisibleAdultPiglins.wrapperContained)); }
// public boolean hasHuntedRecently(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { return wrapperContained.hasHuntedRecently(piglin.wrapperContained); }
// public static boolean hasHuntedRecently(yarnwrap.entity.mob.AbstractPiglinEntity piglin, ) { return net.minecraft.entity.ai.brain.task.HuntHoglinTask.hasHuntedRecently(piglin.wrapperContained); }
// public void method_47288(java.util.List piglin) { wrapperContained.method_47288(piglin); }
// public static void method_47288(java.util.List piglin, ) { net.minecraft.entity.ai.brain.task.HuntHoglinTask.method_47288(piglin); }
// public java.lang.Boolean method_47289(java.util.List piglin) { return wrapperContained.method_47289(piglin); }
// public static java.lang.Boolean method_47289(java.util.List piglin, ) { return net.minecraft.entity.ai.brain.task.HuntHoglinTask.method_47289(piglin); }

}