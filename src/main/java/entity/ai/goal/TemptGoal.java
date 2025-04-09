package yarnwrap.entity.ai.goal;
public class TemptGoal { public net.minecraft.entity.ai.goal.TemptGoal wrapperContained; public TemptGoal(net.minecraft.entity.ai.goal.TemptGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate TEMPTING_ENTITY_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TEMPTING_ENTITY_PREDICATE); }
// public yarnwrap.entity.ai.TargetPredicate predicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.predicate); }
// public double lastPlayerY() { return wrapperContained.lastPlayerY; }
// public int cooldown() { return wrapperContained.cooldown; }
// public boolean active() { return wrapperContained.active; }
// public double lastPlayerX() { return wrapperContained.lastPlayerX; }
// public double speed() { return wrapperContained.speed; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public yarnwrap.entity.player.PlayerEntity closestPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.closestPlayer); }
// public double lastPlayerYaw() { return wrapperContained.lastPlayerYaw; }
// public double lastPlayerPitch() { return wrapperContained.lastPlayerPitch; }
// public boolean canBeScared() { return wrapperContained.canBeScared; }
// public double lastPlayerZ() { return wrapperContained.lastPlayerZ; }
// public java.util.function.Predicate foodPredicate() { return wrapperContained.foodPredicate; }
// // public boolean canBeScared() { return wrapperContained.canBeScared(); }
// public boolean isTemptedBy(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isTemptedBy(entity.wrapperContained); }
public boolean isActive() { return wrapperContained.isActive(); }

}