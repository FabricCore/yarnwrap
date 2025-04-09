package yarnwrap.entity.ai.goal;
public class WanderAroundFarGoal { public net.minecraft.entity.ai.goal.WanderAroundFarGoal wrapperContained; public WanderAroundFarGoal(net.minecraft.entity.ai.goal.WanderAroundFarGoal wrapperContained) { this.wrapperContained = wrapperContained; }

public float CHANCE() { return wrapperContained.CHANCE; }
// public float probability() { return wrapperContained.probability; }

}