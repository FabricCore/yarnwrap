package yarnwrap.entity.ai.goal;
public class FollowParentGoal { public net.minecraft.entity.ai.goal.FollowParentGoal wrapperContained; public FollowParentGoal(net.minecraft.entity.ai.goal.FollowParentGoal wrapperContained) { this.wrapperContained = wrapperContained; }

public int HORIZONTAL_CHECK_RANGE() { return wrapperContained.HORIZONTAL_CHECK_RANGE; }
// public void HORIZONTAL_CHECK_RANGE(int value) { wrapperContained.HORIZONTAL_CHECK_RANGE = value; }
public int VERTICAL_CHECK_RANGE() { return wrapperContained.VERTICAL_CHECK_RANGE; }
// public void VERTICAL_CHECK_RANGE(int value) { wrapperContained.VERTICAL_CHECK_RANGE = value; }
public int MIN_DISTANCE() { return wrapperContained.MIN_DISTANCE; }
// public void MIN_DISTANCE(int value) { wrapperContained.MIN_DISTANCE = value; }
// public yarnwrap.entity.passive.AnimalEntity parent() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.parent); }
// public void parent(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.parent = value.wrapperContained; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public int delay() { return wrapperContained.delay; }
// public void delay(int value) { wrapperContained.delay = value; }
// public yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.animal); }
// public void animal(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.animal = value.wrapperContained; }
public FollowParentGoal(yarnwrap.entity.passive.AnimalEntity animal,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowParentGoal(animal.wrapperContained,speed); }

}