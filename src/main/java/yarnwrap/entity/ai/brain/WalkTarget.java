package yarnwrap.entity.ai.brain;
public class WalkTarget { public net.minecraft.entity.ai.brain.WalkTarget wrapperContained; public WalkTarget(net.minecraft.entity.ai.brain.WalkTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.LookTarget lookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(wrapperContained.lookTarget); }
// public void lookTarget(yarnwrap.entity.ai.brain.LookTarget value) { wrapperContained.lookTarget = value.wrapperContained; }
// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public int completionRange() { return wrapperContained.completionRange; }
// public void completionRange(int value) { wrapperContained.completionRange = value; }
public yarnwrap.entity.ai.brain.LookTarget getLookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(wrapperContained.getLookTarget()); }
public float getSpeed() { return wrapperContained.getSpeed(); }
public int getCompletionRange() { return wrapperContained.getCompletionRange(); }

}