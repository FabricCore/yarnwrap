package yarnwrap.entity.ai.brain.task;
public class TaskTriggerer { public net.minecraft.entity.ai.brain.task.TaskTriggerer wrapperContained; public TaskTriggerer(net.minecraft.entity.ai.brain.task.TaskTriggerer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object function() { return wrapperContained.function; }
public Object newContext() { return wrapperContained.newContext(); }
// public yarnwrap.entity.ai.brain.task.TaskTriggerer of(Object function) { return new yarnwrap.entity.ai.brain.task.TaskTriggerer(wrapperContained.of(function)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask runIf(yarnwrap.entity.ai.brain.task.TaskRunnable predicate,yarnwrap.entity.ai.brain.task.TaskRunnable task) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.runIf(predicate.wrapperContained,task.wrapperContained)); }
public yarnwrap.entity.ai.brain.task.TaskTriggerer cast(com.mojang.datafixers.kinds.App app) { return new yarnwrap.entity.ai.brain.task.TaskTriggerer(wrapperContained.cast(app)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask predicate(java.util.function.BiPredicate predicate) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.predicate(predicate)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask task(java.util.function.Function creator) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.task(creator)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask predicate(java.util.function.Predicate predicate) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.predicate(predicate)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask runIf(java.util.function.Predicate predicate,yarnwrap.entity.ai.brain.task.SingleTickTask task) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.runIf(predicate,task.wrapperContained)); }
// public Object getFunction(com.mojang.datafixers.kinds.App app) { return wrapperContained.getFunction(app); }

}