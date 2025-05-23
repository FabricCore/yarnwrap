package yarnwrap.entity.ai.goal;
public class LookAtEntityGoal { public net.minecraft.entity.ai.goal.LookAtEntityGoal wrapperContained; public LookAtEntityGoal(net.minecraft.entity.ai.goal.LookAtEntityGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public float chance() { return wrapperContained.chance; }
// public void chance(float value) { wrapperContained.chance = value; }
// public static float chance() { return net.minecraft.entity.ai.goal.LookAtEntityGoal.chance; }
// public static void chance(float value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.chance = value; }

// public float range() { return wrapperContained.range; }
// public void range(float value) { wrapperContained.range = value; }
// public static float range() { return net.minecraft.entity.ai.goal.LookAtEntityGoal.range; }
// public static void range(float value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.range = value; }

// public int lookTime() { return wrapperContained.lookTime; }
// public void lookTime(int value) { wrapperContained.lookTime = value; }
// public static int lookTime() { return net.minecraft.entity.ai.goal.LookAtEntityGoal.lookTime; }
// public static void lookTime(int value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.lookTime = value; }

// public yarnwrap.entity.Entity target() { return new yarnwrap.entity.Entity(wrapperContained.target); }
// public void target(yarnwrap.entity.Entity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.Entity target() { return new yarnwrap.entity.Entity(net.minecraft.entity.ai.goal.LookAtEntityGoal.target); }
// public static void target(yarnwrap.entity.Entity value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.target = value.wrapperContained; }

// public java.lang.Class targetType() { return wrapperContained.targetType; }
// public void targetType(java.lang.Class value) { wrapperContained.targetType = value; }
// public static java.lang.Class targetType() { return net.minecraft.entity.ai.goal.LookAtEntityGoal.targetType; }
// public static void targetType(java.lang.Class value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.targetType = value; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.LookAtEntityGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.mob = value.wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.LookAtEntityGoal.targetPredicate); }
// public static void targetPredicate(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.targetPredicate = value.wrapperContained; }

// public float DEFAULT_CHANCE() { return wrapperContained.DEFAULT_CHANCE; }
// public void DEFAULT_CHANCE(float value) { wrapperContained.DEFAULT_CHANCE = value; }
public static float DEFAULT_CHANCE() { return net.minecraft.entity.ai.goal.LookAtEntityGoal.DEFAULT_CHANCE; }
// public static void DEFAULT_CHANCE(float value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.DEFAULT_CHANCE = value; }

// public boolean lookForward() { return wrapperContained.lookForward; }
// public void lookForward(boolean value) { wrapperContained.lookForward = value; }
// public static boolean lookForward() { return net.minecraft.entity.ai.goal.LookAtEntityGoal.lookForward; }
// public static void lookForward(boolean value, ) { net.minecraft.entity.ai.goal.LookAtEntityGoal.lookForward = value; }

public LookAtEntityGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetType,float range) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtEntityGoal(mob.wrapperContained,targetType,range); }
public LookAtEntityGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetType,float range,float chance) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtEntityGoal(mob.wrapperContained,targetType,range,chance); }
public LookAtEntityGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetType,float range,float chance,boolean lookForward) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtEntityGoal(mob.wrapperContained,targetType,range,chance,lookForward); }
// public boolean method_18414(java.util.function.Predicate entity,yarnwrap.entity.LivingEntity world) { return wrapperContained.method_18414(entity,world.wrapperContained); }
// public static boolean method_18414(java.util.function.Predicate entity,yarnwrap.entity.LivingEntity world, ) { return net.minecraft.entity.ai.goal.LookAtEntityGoal.method_18414(entity,world.wrapperContained); }

}