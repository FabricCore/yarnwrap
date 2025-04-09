package yarnwrap.entity.ai.goal;
public class FollowParentGoal { public net.minecraft.entity.ai.goal.FollowParentGoal wrapperContained; public FollowParentGoal(net.minecraft.entity.ai.goal.FollowParentGoal wrapperContained) { this.wrapperContained = wrapperContained; }

public int HORIZONTAL_CHECK_RANGE() { return wrapperContained.HORIZONTAL_CHECK_RANGE; }
public int VERTICAL_CHECK_RANGE() { return wrapperContained.VERTICAL_CHECK_RANGE; }
public int MIN_DISTANCE() { return wrapperContained.MIN_DISTANCE; }
// public yarnwrap.entity.passive.AnimalEntity parent() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.parent); }
// public double speed() { return wrapperContained.speed; }
// public int delay() { return wrapperContained.delay; }
// public yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.animal); }

}