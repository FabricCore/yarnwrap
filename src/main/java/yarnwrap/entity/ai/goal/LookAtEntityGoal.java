package yarnwrap.entity.ai.goal;
public class LookAtEntityGoal { public net.minecraft.entity.ai.goal.LookAtEntityGoal wrapperContained; public LookAtEntityGoal(net.minecraft.entity.ai.goal.LookAtEntityGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
public float DEFAULT_CHANCE() { return wrapperContained.DEFAULT_CHANCE; }
// public void DEFAULT_CHANCE(float value) { wrapperContained.DEFAULT_CHANCE = value; }
// public boolean lookForward() { return wrapperContained.lookForward; }
// public void lookForward(boolean value) { wrapperContained.lookForward = value; }
// public float chance() { return wrapperContained.chance; }
// public void chance(float value) { wrapperContained.chance = value; }
// public float range() { return wrapperContained.range; }
// public void range(float value) { wrapperContained.range = value; }
// public int lookTime() { return wrapperContained.lookTime; }
// public void lookTime(int value) { wrapperContained.lookTime = value; }
// public yarnwrap.entity.Entity target() { return new yarnwrap.entity.Entity(wrapperContained.target); }
// public void target(yarnwrap.entity.Entity value) { wrapperContained.target = value.wrapperContained; }
// public java.lang.Class targetType() { return wrapperContained.targetType; }
// public void targetType(java.lang.Class value) { wrapperContained.targetType = value; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
public LookAtEntityGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetType,float range) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtEntityGoal(mob.wrapperContained,targetType,range); }
public LookAtEntityGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetType,float range,float chance) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtEntityGoal(mob.wrapperContained,targetType,range,chance); }
public LookAtEntityGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetType,float range,float chance,boolean lookForward) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtEntityGoal(mob.wrapperContained,targetType,range,chance,lookForward); }
// public boolean method_18414(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.method_18414(entity.wrapperContained); }

}