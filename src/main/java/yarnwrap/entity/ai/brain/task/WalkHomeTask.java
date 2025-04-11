package yarnwrap.entity.ai.brain.task;
public class WalkHomeTask { public net.minecraft.entity.ai.brain.task.WalkHomeTask wrapperContained; public WalkHomeTask(net.minecraft.entity.ai.brain.task.WalkHomeTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int POI_EXPIRY() { return wrapperContained.POI_EXPIRY; }
// public void POI_EXPIRY(int value) { wrapperContained.POI_EXPIRY = value; }
// public int MAX_TRIES() { return wrapperContained.MAX_TRIES; }
// public void MAX_TRIES(int value) { wrapperContained.MAX_TRIES = value; }
// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }

}