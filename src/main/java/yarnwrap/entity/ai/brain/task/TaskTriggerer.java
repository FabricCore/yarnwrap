package yarnwrap.entity.ai.brain.task;
public class TaskTriggerer { public net.minecraft.entity.ai.brain.task.TaskTriggerer wrapperContained; public TaskTriggerer(net.minecraft.entity.ai.brain.task.TaskTriggerer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object function() { return wrapperContained.function; }
// // public void function(Object value) { wrapperContained.function = value; }
// public TaskTriggerer(Object function) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.TaskTriggerer(function); }
public Object newContext() { return wrapperContained.newContext(); }
// public yarnwrap.entity.ai.brain.task.TaskTriggerer of(Object function) { return new yarnwrap.entity.ai.brain.task.TaskTriggerer(wrapperContained.of(function)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask runIf(yarnwrap.entity.ai.brain.task.TaskRunnable predicate,yarnwrap.entity.ai.brain.task.TaskRunnable task) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.runIf(predicate.wrapperContained,task.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_47218(yarnwrap.entity.ai.brain.task.TaskRunnable context) { return wrapperContained.method_47218(context.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47219(yarnwrap.entity.ai.brain.task.TaskRunnable unit) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47219(unit.wrapperContained)); }
public yarnwrap.entity.ai.brain.task.TaskTriggerer cast(com.mojang.datafixers.kinds.App app) { return new yarnwrap.entity.ai.brain.task.TaskTriggerer(wrapperContained.cast(app)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask predicate(java.util.function.BiPredicate predicate) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.predicate(predicate)); }
// public boolean method_47222(java.util.function.BiPredicate world,yarnwrap.server.world.ServerWorld entity,yarnwrap.entity.LivingEntity time) { return wrapperContained.method_47222(world,entity.wrapperContained,time.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_47223(java.util.function.BiPredicate context) { return wrapperContained.method_47223(context); }
public yarnwrap.entity.ai.brain.task.SingleTickTask task(java.util.function.Function creator) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.task(creator)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask predicate(java.util.function.Predicate predicate) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.predicate(predicate)); }
// public boolean method_47226(java.util.function.Predicate world,yarnwrap.server.world.ServerWorld entity,yarnwrap.entity.LivingEntity time) { return wrapperContained.method_47226(world,entity.wrapperContained,time.wrapperContained); }
public yarnwrap.entity.ai.brain.task.SingleTickTask runIf(java.util.function.Predicate predicate,yarnwrap.entity.ai.brain.task.SingleTickTask task) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.runIf(predicate,task.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_47228(java.util.function.Predicate context) { return wrapperContained.method_47228(context); }
// public Object getFunction(com.mojang.datafixers.kinds.App app) { return wrapperContained.getFunction(app); }

}