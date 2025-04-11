package yarnwrap.entity.ai.brain.task;
public class PanicTask { public net.minecraft.entity.ai.brain.task.PanicTask wrapperContained; public PanicTask(net.minecraft.entity.ai.brain.task.PanicTask wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isHostileNearby(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isHostileNearby(entity.wrapperContained); }
public boolean wasHurt(yarnwrap.entity.LivingEntity entity) { return wrapperContained.wasHurt(entity.wrapperContained); }

}