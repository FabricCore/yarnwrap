package yarnwrap.entity.ai.goal;
public class WanderAroundFarGoal { public net.minecraft.entity.ai.goal.WanderAroundFarGoal wrapperContained; public WanderAroundFarGoal(net.minecraft.entity.ai.goal.WanderAroundFarGoal wrapperContained) { this.wrapperContained = wrapperContained; }

public float CHANCE() { return wrapperContained.CHANCE; }
// public void CHANCE(float value) { wrapperContained.CHANCE = value; }
// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }

}