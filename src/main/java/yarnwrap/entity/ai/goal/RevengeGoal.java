package yarnwrap.entity.ai.goal;
public class RevengeGoal { public net.minecraft.entity.ai.goal.RevengeGoal wrapperContained; public RevengeGoal(net.minecraft.entity.ai.goal.RevengeGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate VALID_AVOIDABLES_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.VALID_AVOIDABLES_PREDICATE); }
// public void VALID_AVOIDABLES_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.VALID_AVOIDABLES_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate VALID_AVOIDABLES_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.RevengeGoal.VALID_AVOIDABLES_PREDICATE); }
// public static void VALID_AVOIDABLES_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.goal.RevengeGoal.VALID_AVOIDABLES_PREDICATE = value.wrapperContained; }

// public int BOX_VERTICAL_EXPANSION() { return wrapperContained.BOX_VERTICAL_EXPANSION; }
// public void BOX_VERTICAL_EXPANSION(int value) { wrapperContained.BOX_VERTICAL_EXPANSION = value; }
// public static int BOX_VERTICAL_EXPANSION() { return net.minecraft.entity.ai.goal.RevengeGoal.BOX_VERTICAL_EXPANSION; }
// public static void BOX_VERTICAL_EXPANSION(int value, ) { net.minecraft.entity.ai.goal.RevengeGoal.BOX_VERTICAL_EXPANSION = value; }

// public java.lang.Class[] noRevengeTypes() { return wrapperContained.noRevengeTypes; }
// public void noRevengeTypes(java.lang.Class[] value) { wrapperContained.noRevengeTypes = value; }
// public static java.lang.Class[] noRevengeTypes() { return net.minecraft.entity.ai.goal.RevengeGoal.noRevengeTypes; }
// public static void noRevengeTypes(java.lang.Class[] value, ) { net.minecraft.entity.ai.goal.RevengeGoal.noRevengeTypes = value; }

// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public void lastAttackedTime(int value) { wrapperContained.lastAttackedTime = value; }
// public static int lastAttackedTime() { return net.minecraft.entity.ai.goal.RevengeGoal.lastAttackedTime; }
// public static void lastAttackedTime(int value, ) { net.minecraft.entity.ai.goal.RevengeGoal.lastAttackedTime = value; }

// public boolean groupRevenge() { return wrapperContained.groupRevenge; }
// public void groupRevenge(boolean value) { wrapperContained.groupRevenge = value; }
// public static boolean groupRevenge() { return net.minecraft.entity.ai.goal.RevengeGoal.groupRevenge; }
// public static void groupRevenge(boolean value, ) { net.minecraft.entity.ai.goal.RevengeGoal.groupRevenge = value; }

// public java.lang.Class[] noHelpTypes() { return wrapperContained.noHelpTypes; }
// public void noHelpTypes(java.lang.Class[] value) { wrapperContained.noHelpTypes = value; }
// public static java.lang.Class[] noHelpTypes() { return net.minecraft.entity.ai.goal.RevengeGoal.noHelpTypes; }
// public static void noHelpTypes(java.lang.Class[] value, ) { net.minecraft.entity.ai.goal.RevengeGoal.noHelpTypes = value; }

public RevengeGoal(yarnwrap.entity.mob.PathAwareEntity mob,java.lang.Class[] noRevengeTypes) { this.wrapperContained = new net.minecraft.entity.ai.goal.RevengeGoal(mob.wrapperContained,noRevengeTypes); }
// public void callSameTypeForRevenge() { wrapperContained.callSameTypeForRevenge(); }
// public static void callSameTypeForRevenge() { net.minecraft.entity.ai.goal.RevengeGoal.callSameTypeForRevenge(); }
public yarnwrap.entity.ai.goal.RevengeGoal setGroupRevenge(java.lang.Class[] noHelpTypes) { return new yarnwrap.entity.ai.goal.RevengeGoal(wrapperContained.setGroupRevenge(noHelpTypes)); }
// public static yarnwrap.entity.ai.goal.RevengeGoal setGroupRevenge(java.lang.Class[] noHelpTypes, ) { return new yarnwrap.entity.ai.goal.RevengeGoal(net.minecraft.entity.ai.goal.RevengeGoal.setGroupRevenge(noHelpTypes)); }
// public void setMobEntityTarget(yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.LivingEntity target) { wrapperContained.setMobEntityTarget(mob.wrapperContained,target.wrapperContained); }
// public static void setMobEntityTarget(yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.ai.goal.RevengeGoal.setMobEntityTarget(mob.wrapperContained,target.wrapperContained); }

}