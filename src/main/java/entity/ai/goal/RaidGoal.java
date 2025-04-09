package yarnwrap.entity.ai.goal;
public class RaidGoal { public net.minecraft.entity.ai.goal.RaidGoal wrapperContained; public RaidGoal(net.minecraft.entity.ai.goal.RaidGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public int MAX_COOLDOWN() { return wrapperContained.MAX_COOLDOWN; }
public int getCooldown() { return wrapperContained.getCooldown(); }
public void decreaseCooldown() { wrapperContained.decreaseCooldown(); }

}