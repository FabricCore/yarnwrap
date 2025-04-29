package yarnwrap.entity.ai.goal;
public class FollowParentGoal { public net.minecraft.entity.ai.goal.FollowParentGoal wrapperContained; public FollowParentGoal(net.minecraft.entity.ai.goal.FollowParentGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HORIZONTAL_CHECK_RANGE() { return wrapperContained.HORIZONTAL_CHECK_RANGE; }
// public void HORIZONTAL_CHECK_RANGE(int value) { wrapperContained.HORIZONTAL_CHECK_RANGE = value; }
public static int HORIZONTAL_CHECK_RANGE() { return net.minecraft.entity.ai.goal.FollowParentGoal.HORIZONTAL_CHECK_RANGE; }
// public static void HORIZONTAL_CHECK_RANGE(int value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.HORIZONTAL_CHECK_RANGE = value; }

// public int VERTICAL_CHECK_RANGE() { return wrapperContained.VERTICAL_CHECK_RANGE; }
// public void VERTICAL_CHECK_RANGE(int value) { wrapperContained.VERTICAL_CHECK_RANGE = value; }
public static int VERTICAL_CHECK_RANGE() { return net.minecraft.entity.ai.goal.FollowParentGoal.VERTICAL_CHECK_RANGE; }
// public static void VERTICAL_CHECK_RANGE(int value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.VERTICAL_CHECK_RANGE = value; }

// public int MIN_DISTANCE() { return wrapperContained.MIN_DISTANCE; }
// public void MIN_DISTANCE(int value) { wrapperContained.MIN_DISTANCE = value; }
public static int MIN_DISTANCE() { return net.minecraft.entity.ai.goal.FollowParentGoal.MIN_DISTANCE; }
// public static void MIN_DISTANCE(int value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.MIN_DISTANCE = value; }

// public yarnwrap.entity.passive.AnimalEntity parent() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.parent); }
// public void parent(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.entity.passive.AnimalEntity parent() { return new yarnwrap.entity.passive.AnimalEntity(net.minecraft.entity.ai.goal.FollowParentGoal.parent); }
// public static void parent(yarnwrap.entity.passive.AnimalEntity value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.parent = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.FollowParentGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.speed = value; }

// public int delay() { return wrapperContained.delay; }
// public void delay(int value) { wrapperContained.delay = value; }
// public static int delay() { return net.minecraft.entity.ai.goal.FollowParentGoal.delay; }
// public static void delay(int value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.delay = value; }

// public yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.animal); }
// public void animal(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.animal = value.wrapperContained; }
// public static yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(net.minecraft.entity.ai.goal.FollowParentGoal.animal); }
// public static void animal(yarnwrap.entity.passive.AnimalEntity value, ) { net.minecraft.entity.ai.goal.FollowParentGoal.animal = value.wrapperContained; }

public FollowParentGoal(yarnwrap.entity.passive.AnimalEntity animal,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowParentGoal(animal.wrapperContained,speed); }

}