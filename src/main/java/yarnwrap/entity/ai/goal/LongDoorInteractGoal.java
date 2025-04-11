package yarnwrap.entity.ai.goal;
public class LongDoorInteractGoal { public net.minecraft.entity.ai.goal.LongDoorInteractGoal wrapperContained; public LongDoorInteractGoal(net.minecraft.entity.ai.goal.LongDoorInteractGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean delayedClose() { return wrapperContained.delayedClose; }
// public void delayedClose(boolean value) { wrapperContained.delayedClose = value; }
// public int ticksLeft() { return wrapperContained.ticksLeft; }
// public void ticksLeft(int value) { wrapperContained.ticksLeft = value; }
public LongDoorInteractGoal(yarnwrap.entity.mob.MobEntity mob,boolean delayedClose) { this.wrapperContained = new net.minecraft.entity.ai.goal.LongDoorInteractGoal(mob.wrapperContained,delayedClose); }

}