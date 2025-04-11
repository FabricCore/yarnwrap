package yarnwrap.entity.ai.goal;
public class SitGoal { public net.minecraft.entity.ai.goal.SitGoal wrapperContained; public SitGoal(net.minecraft.entity.ai.goal.SitGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableEntity value) { wrapperContained.tameable = value.wrapperContained; }
public SitGoal(yarnwrap.entity.passive.TameableEntity tameable) { this.wrapperContained = new net.minecraft.entity.ai.goal.SitGoal(tameable.wrapperContained); }

}