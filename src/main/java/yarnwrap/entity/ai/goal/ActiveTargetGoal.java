package yarnwrap.entity.ai.goal;
public class ActiveTargetGoal { public net.minecraft.entity.ai.goal.ActiveTargetGoal wrapperContained; public ActiveTargetGoal(net.minecraft.entity.ai.goal.ActiveTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_RECIPROCAL_CHANCE() { return wrapperContained.DEFAULT_RECIPROCAL_CHANCE; }
// public void DEFAULT_RECIPROCAL_CHANCE(int value) { wrapperContained.DEFAULT_RECIPROCAL_CHANCE = value; }
// public int reciprocalChance() { return wrapperContained.reciprocalChance; }
// public void reciprocalChance(int value) { wrapperContained.reciprocalChance = value; }
// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public java.lang.Class targetClass() { return wrapperContained.targetClass; }
// public void targetClass(java.lang.Class value) { wrapperContained.targetClass = value; }
// public yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.targetEntity); }
// public void targetEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.targetEntity = value.wrapperContained; }
// public void findClosestTarget() { wrapperContained.findClosestTarget(); }
public void setTargetEntity(yarnwrap.entity.LivingEntity targetEntity) { wrapperContained.setTargetEntity(targetEntity.wrapperContained); }
// public yarnwrap.util.math.Box getSearchBox(double distance) { return new yarnwrap.util.math.Box(wrapperContained.getSearchBox(distance)); }

}