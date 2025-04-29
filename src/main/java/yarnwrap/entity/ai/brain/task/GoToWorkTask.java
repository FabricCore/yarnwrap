package yarnwrap.entity.ai.brain.task;
public class GoToWorkTask { public net.minecraft.entity.ai.brain.task.GoToWorkTask wrapperContained; public GoToWorkTask(net.minecraft.entity.ai.brain.task.GoToWorkTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.GoToWorkTask.create()); }
// public com.mojang.datafixers.kinds.App method_46888(Object context) { return wrapperContained.method_46888(context); }
// public static com.mojang.datafixers.kinds.App method_46888(Object context, ) { return net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46888(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46889(Object potentialJobSite,yarnwrap.entity.ai.brain.MemoryQueryResult jobSite) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46889(potentialJobSite,jobSite.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_46889(Object potentialJobSite,yarnwrap.entity.ai.brain.MemoryQueryResult jobSite, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46889(potentialJobSite,jobSite.wrapperContained)); }
// public boolean method_46890(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_46890(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_46890(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46890(world,entity.wrapperContained,time.wrapperContained); }
// public void method_46891(yarnwrap.entity.passive.VillagerEntity profession) { wrapperContained.method_46891(profession.wrapperContained); }
// public static void method_46891(yarnwrap.entity.passive.VillagerEntity profession, ) { net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46891(profession.wrapperContained); }
// public java.util.Optional method_46892(yarnwrap.util.math.GlobalPos jobSiteWorld) { return wrapperContained.method_46892(jobSiteWorld.wrapperContained); }
// public static java.util.Optional method_46892(yarnwrap.util.math.GlobalPos jobSiteWorld, ) { return net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46892(jobSiteWorld.wrapperContained); }
// public java.util.Optional method_46893(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_46893(poiType.wrapperContained); }
// public static java.util.Optional method_46893(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46893(poiType.wrapperContained); }
// public boolean method_46894(yarnwrap.registry.entry.RegistryEntry profession) { return wrapperContained.method_46894(profession.wrapperContained); }
// public static boolean method_46894(yarnwrap.registry.entry.RegistryEntry profession, ) { return net.minecraft.entity.ai.brain.task.GoToWorkTask.method_46894(profession.wrapperContained); }

}