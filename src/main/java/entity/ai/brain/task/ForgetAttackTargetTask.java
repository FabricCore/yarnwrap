package yarnwrap.entity.ai.brain.task;
public class ForgetAttackTargetTask { public net.minecraft.entity.ai.brain.task.ForgetAttackTargetTask wrapperContained; public ForgetAttackTargetTask(net.minecraft.entity.ai.brain.task.ForgetAttackTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int REMEMBER_TIME() { return wrapperContained.REMEMBER_TIME; }
// public boolean cannotReachTarget() { return wrapperContained.cannotReachTarget(); }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.BiConsumer forgetCallback) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(forgetCallback)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate alternativeCondition) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(alternativeCondition)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate alternativeCondition,java.util.function.BiConsumer forgetCallback,boolean shouldForgetIfTargetUnreachable) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(alternativeCondition,forgetCallback,shouldForgetIfTargetUnreachable)); }

}