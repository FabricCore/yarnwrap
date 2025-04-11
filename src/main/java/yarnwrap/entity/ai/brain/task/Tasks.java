package yarnwrap.entity.ai.brain.task;
public class Tasks { public net.minecraft.entity.ai.brain.task.Tasks wrapperContained; public Tasks(net.minecraft.entity.ai.brain.task.Tasks wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_47163(Object world,yarnwrap.util.collection.WeightedList entity,Object time) { return wrapperContained.method_47163(world,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47164(Object context) { return wrapperContained.method_47164(context); }
// public void method_47165(yarnwrap.util.collection.WeightedList task) { wrapperContained.method_47165(task.wrapperContained); }
public yarnwrap.entity.ai.brain.task.SingleTickTask pickRandomly(java.util.List weightedTasks) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.pickRandomly(weightedTasks)); }
// public yarnwrap.entity.ai.brain.task.SingleTickTask weighted(java.util.List weightedTasks,Object order,Object runMode) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.weighted(weightedTasks,order,runMode)); }

}