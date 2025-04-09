package yarnwrap.entity.ai.brain;
public class WalkTarget { public net.minecraft.entity.ai.brain.WalkTarget wrapperContained; public WalkTarget(net.minecraft.entity.ai.brain.WalkTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.LookTarget lookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(wrapperContained.lookTarget); }
// public float speed() { return wrapperContained.speed; }
// public int completionRange() { return wrapperContained.completionRange; }
public yarnwrap.entity.ai.brain.LookTarget getLookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(wrapperContained.getLookTarget()); }
public float getSpeed() { return wrapperContained.getSpeed(); }
public int getCompletionRange() { return wrapperContained.getCompletionRange(); }

}