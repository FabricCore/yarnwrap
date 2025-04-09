package yarnwrap.entity.ai.goal;
public class RevengeGoal { public net.minecraft.entity.ai.goal.RevengeGoal wrapperContained; public RevengeGoal(net.minecraft.entity.ai.goal.RevengeGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate VALID_AVOIDABLES_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.VALID_AVOIDABLES_PREDICATE); }
// public int BOX_VERTICAL_EXPANSION() { return wrapperContained.BOX_VERTICAL_EXPANSION; }
// public java.lang.Class[] noRevengeTypes() { return wrapperContained.noRevengeTypes; }
// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public boolean groupRevenge() { return wrapperContained.groupRevenge; }
// public java.lang.Class[] noHelpTypes() { return wrapperContained.noHelpTypes; }
// public void callSameTypeForRevenge() { wrapperContained.callSameTypeForRevenge(); }
public yarnwrap.entity.ai.goal.RevengeGoal setGroupRevenge(java.lang.Class[] noHelpTypes) { return new yarnwrap.entity.ai.goal.RevengeGoal(wrapperContained.setGroupRevenge(noHelpTypes)); }
// public void setMobEntityTarget(yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.LivingEntity target) { wrapperContained.setMobEntityTarget(mob.wrapperContained,target.wrapperContained); }

}