package yarnwrap.entity.ai.goal;
public class WanderAroundPointOfInterestGoal { public net.minecraft.entity.ai.goal.WanderAroundPointOfInterestGoal wrapperContained; public WanderAroundPointOfInterestGoal(net.minecraft.entity.ai.goal.WanderAroundPointOfInterestGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public void HORIZONTAL_RANGE(int value) { wrapperContained.HORIZONTAL_RANGE = value; }
// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public void VERTICAL_RANGE(int value) { wrapperContained.VERTICAL_RANGE = value; }
public WanderAroundPointOfInterestGoal(yarnwrap.entity.mob.PathAwareEntity entity,double speed,boolean canDespawn) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderAroundPointOfInterestGoal(entity.wrapperContained,speed,canDespawn); }

}