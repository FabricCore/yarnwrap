package yarnwrap.entity.ai.goal;
public class DisableableFollowTargetGoal { public net.minecraft.entity.ai.goal.DisableableFollowTargetGoal wrapperContained; public DisableableFollowTargetGoal(net.minecraft.entity.ai.goal.DisableableFollowTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean enabled() { return wrapperContained.enabled; }
public void setEnabled(boolean enabled) { wrapperContained.setEnabled(enabled); }

}