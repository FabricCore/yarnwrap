package yarnwrap.entity.ai.goal;
public class DisableableFollowTargetGoal { public net.minecraft.entity.ai.goal.DisableableFollowTargetGoal wrapperContained; public DisableableFollowTargetGoal(net.minecraft.entity.ai.goal.DisableableFollowTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
public DisableableFollowTargetGoal(yarnwrap.entity.raid.RaiderEntity actor,java.lang.Class targetEntityClass,int reciprocalChance,boolean checkVisibility,boolean checkCanNavigate,java.util.function.Predicate targetPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.DisableableFollowTargetGoal(actor.wrapperContained,targetEntityClass,reciprocalChance,checkVisibility,checkCanNavigate,targetPredicate); }
public void setEnabled(boolean enabled) { wrapperContained.setEnabled(enabled); }

}