package yarnwrap.entity.ai.goal;
public class LookAtEntityGoal { public net.minecraft.entity.ai.goal.LookAtEntityGoal wrapperContained; public LookAtEntityGoal(net.minecraft.entity.ai.goal.LookAtEntityGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
public float DEFAULT_CHANCE() { return wrapperContained.DEFAULT_CHANCE; }
// public boolean lookForward() { return wrapperContained.lookForward; }
// public float chance() { return wrapperContained.chance; }
// public float range() { return wrapperContained.range; }
// public int lookTime() { return wrapperContained.lookTime; }
// public yarnwrap.entity.Entity target() { return new yarnwrap.entity.Entity(wrapperContained.target); }
// public java.lang.Class targetType() { return wrapperContained.targetType; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }

}