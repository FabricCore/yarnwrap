package yarnwrap.entity.ai.brain.task;
public class WalkTowardClosestAdultTask { public net.minecraft.entity.ai.brain.task.WalkTowardClosestAdultTask wrapperContained; public WalkTowardClosestAdultTask(net.minecraft.entity.ai.brain.task.WalkTowardClosestAdultTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.util.math.intprovider.UniformIntProvider executionRange,float speed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(executionRange.wrapperContained,speed)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.util.math.intprovider.UniformIntProvider executionRange,java.util.function.Function speed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(executionRange.wrapperContained,speed)); }

}