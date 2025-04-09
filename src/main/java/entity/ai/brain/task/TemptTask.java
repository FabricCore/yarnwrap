package yarnwrap.entity.ai.brain.task;
public class TemptTask { public net.minecraft.entity.ai.brain.task.TemptTask wrapperContained; public TemptTask(net.minecraft.entity.ai.brain.task.TemptTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function speed() { return wrapperContained.speed; }
public int TEMPTATION_COOLDOWN_TICKS() { return wrapperContained.TEMPTATION_COOLDOWN_TICKS; }
// public java.util.function.Function stopDistanceGetter() { return wrapperContained.stopDistanceGetter; }
public double DEFAULT_STOP_DISTANCE() { return wrapperContained.DEFAULT_STOP_DISTANCE; }
public double LARGE_ENTITY_STOP_DISTANCE() { return wrapperContained.LARGE_ENTITY_STOP_DISTANCE; }
// public float getSpeed(yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.getSpeed(entity.wrapperContained); }
// public java.util.Optional getTemptingPlayer(yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.getTemptingPlayer(entity.wrapperContained); }

}