package yarnwrap.entity.ai.brain.task;
public class ForgetAngryAtTargetTask { public net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask wrapperContained; public ForgetAngryAtTargetTask(net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.create()); }
// public boolean method_47144(yarnwrap.server.world.ServerWorld target) { return wrapperContained.method_47144(target.wrapperContained); }
// public static boolean method_47144(yarnwrap.server.world.ServerWorld target, ) { return net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.method_47144(target.wrapperContained); }
// public yarnwrap.entity.LivingEntity method_47145(yarnwrap.entity.Entity target) { return new yarnwrap.entity.LivingEntity(wrapperContained.method_47145(target.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity method_47145(yarnwrap.entity.Entity target, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.method_47145(target.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_47146(Object context) { return wrapperContained.method_47146(context); }
// public static com.mojang.datafixers.kinds.App method_47146(Object context, ) { return net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.method_47146(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47147(Object angryAt) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47147(angryAt)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47147(Object angryAt, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.method_47147(angryAt)); }
// public boolean method_47148(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_47148(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47148(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time, ) { return net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.method_47148(world,entity.wrapperContained,time.wrapperContained); }
// public void method_47149(yarnwrap.entity.ai.brain.MemoryQueryResult target) { wrapperContained.method_47149(target.wrapperContained); }
// public static void method_47149(yarnwrap.entity.ai.brain.MemoryQueryResult target, ) { net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask.method_47149(target.wrapperContained); }

}