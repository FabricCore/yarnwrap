package yarnwrap.entity.ai.goal;
public class WanderAroundFarGoal { public net.minecraft.entity.ai.goal.WanderAroundFarGoal wrapperContained; public WanderAroundFarGoal(net.minecraft.entity.ai.goal.WanderAroundFarGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public static float probability() { return net.minecraft.entity.ai.goal.WanderAroundFarGoal.probability; }
// public static void probability(float value, ) { net.minecraft.entity.ai.goal.WanderAroundFarGoal.probability = value; }

// public float CHANCE() { return wrapperContained.CHANCE; }
// public void CHANCE(float value) { wrapperContained.CHANCE = value; }
public static float CHANCE() { return net.minecraft.entity.ai.goal.WanderAroundFarGoal.CHANCE; }
// public static void CHANCE(float value, ) { net.minecraft.entity.ai.goal.WanderAroundFarGoal.CHANCE = value; }

public WanderAroundFarGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,float probability) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderAroundFarGoal(mob.wrapperContained,speed,probability); }

}