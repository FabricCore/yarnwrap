package yarnwrap.entity.ai.brain.task;
public class WalkHomeTask { public net.minecraft.entity.ai.brain.task.WalkHomeTask wrapperContained; public WalkHomeTask(net.minecraft.entity.ai.brain.task.WalkHomeTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int POI_EXPIRY() { return wrapperContained.POI_EXPIRY; }
// public int MAX_TRIES() { return wrapperContained.MAX_TRIES; }
// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }

}