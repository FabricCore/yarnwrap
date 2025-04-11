package yarnwrap.entity.ai.brain.task;
public class Tasks { public net.minecraft.entity.ai.brain.task.Tasks wrapperContained; public Tasks(net.minecraft.entity.ai.brain.task.Tasks wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask pickRandomly(java.util.List weightedTasks) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.pickRandomly(weightedTasks)); }
// public yarnwrap.entity.ai.brain.task.SingleTickTask weighted(java.util.List weightedTasks,Object order,Object runMode) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.weighted(weightedTasks,order,runMode)); }

}