package yarnwrap.entity.ai.brain.task;
public class ForgetAttackTargetTask { public net.minecraft.entity.ai.brain.task.ForgetAttackTargetTask wrapperContained; public ForgetAttackTargetTask(net.minecraft.entity.ai.brain.task.ForgetAttackTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int REMEMBER_TIME() { return wrapperContained.REMEMBER_TIME; }
// public void REMEMBER_TIME(int value) { wrapperContained.REMEMBER_TIME = value; }
// public boolean cannotReachTarget() { return wrapperContained.cannotReachTarget(); }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public boolean method_47133(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_47133(entity.wrapperContained); }
// public void method_47134(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.LivingEntity target) { wrapperContained.method_47134(entity.wrapperContained,target.wrapperContained); }
// public boolean method_47135(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,boolean time) { return wrapperContained.method_47135(world,entity.wrapperContained,time); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47136(Object attackTarget,boolean cantReachWalkTargetSince) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47136(attackTarget,cantReachWalkTargetSince)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.BiConsumer forgetCallback) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(forgetCallback)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate alternativeCondition) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(alternativeCondition)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate alternativeCondition,java.util.function.BiConsumer forgetCallback,boolean shouldForgetIfTargetUnreachable) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(alternativeCondition,forgetCallback,shouldForgetIfTargetUnreachable)); }
// public com.mojang.datafixers.kinds.App method_47140(boolean context) { return wrapperContained.method_47140(context); }
// public boolean method_47141(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_47141(entity.wrapperContained); }
// public void method_47142(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.LivingEntity target) { wrapperContained.method_47142(entity.wrapperContained,target.wrapperContained); }

}