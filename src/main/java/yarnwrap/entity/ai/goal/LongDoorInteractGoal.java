package yarnwrap.entity.ai.goal;
public class LongDoorInteractGoal { public net.minecraft.entity.ai.goal.LongDoorInteractGoal wrapperContained; public LongDoorInteractGoal(net.minecraft.entity.ai.goal.LongDoorInteractGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean delayedClose() { return wrapperContained.delayedClose; }
// public void delayedClose(boolean value) { wrapperContained.delayedClose = value; }
// public static boolean delayedClose() { return net.minecraft.entity.ai.goal.LongDoorInteractGoal.delayedClose; }
// public static void delayedClose(boolean value, ) { net.minecraft.entity.ai.goal.LongDoorInteractGoal.delayedClose = value; }

// public int ticksLeft() { return wrapperContained.ticksLeft; }
// public void ticksLeft(int value) { wrapperContained.ticksLeft = value; }
// public static int ticksLeft() { return net.minecraft.entity.ai.goal.LongDoorInteractGoal.ticksLeft; }
// public static void ticksLeft(int value, ) { net.minecraft.entity.ai.goal.LongDoorInteractGoal.ticksLeft = value; }

public LongDoorInteractGoal(yarnwrap.entity.mob.MobEntity mob,boolean delayedClose) { this.wrapperContained = new net.minecraft.entity.ai.goal.LongDoorInteractGoal(mob.wrapperContained,delayedClose); }

}