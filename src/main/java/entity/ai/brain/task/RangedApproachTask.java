package yarnwrap.entity.ai.brain.task;
public class RangedApproachTask { public net.minecraft.entity.ai.brain.task.RangedApproachTask wrapperContained; public RangedApproachTask(net.minecraft.entity.ai.brain.task.RangedApproachTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WEAPON_REACH_REDUCTION() { return wrapperContained.WEAPON_REACH_REDUCTION; }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Function speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }

}