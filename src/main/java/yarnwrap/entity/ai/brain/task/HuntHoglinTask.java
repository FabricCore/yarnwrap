package yarnwrap.entity.ai.brain.task;
public class HuntHoglinTask { public net.minecraft.entity.ai.brain.task.HuntHoglinTask wrapperContained; public HuntHoglinTask(net.minecraft.entity.ai.brain.task.HuntHoglinTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create()); }
// public boolean hasHuntedRecently(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { return wrapperContained.hasHuntedRecently(piglin.wrapperContained); }

}