package yarnwrap.entity.ai.goal;
public class UntamedActiveTargetGoal { public net.minecraft.entity.ai.goal.UntamedActiveTargetGoal wrapperContained; public UntamedActiveTargetGoal(net.minecraft.entity.ai.goal.UntamedActiveTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public static yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(net.minecraft.entity.ai.goal.UntamedActiveTargetGoal.tameable); }
// public static void tameable(yarnwrap.entity.passive.TameableEntity value, ) { net.minecraft.entity.ai.goal.UntamedActiveTargetGoal.tameable = value.wrapperContained; }

public UntamedActiveTargetGoal(yarnwrap.entity.passive.TameableEntity tameable,java.lang.Class targetClass,boolean checkVisibility,java.util.function.Predicate targetPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.UntamedActiveTargetGoal(tameable.wrapperContained,targetClass,checkVisibility,targetPredicate); }

}