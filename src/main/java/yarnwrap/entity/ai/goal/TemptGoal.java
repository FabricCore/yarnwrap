package yarnwrap.entity.ai.goal;
public class TemptGoal { public net.minecraft.entity.ai.goal.TemptGoal wrapperContained; public TemptGoal(net.minecraft.entity.ai.goal.TemptGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate TEMPTING_ENTITY_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TEMPTING_ENTITY_PREDICATE); }
// public void TEMPTING_ENTITY_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.TEMPTING_ENTITY_PREDICATE = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate predicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.predicate); }
// public void predicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.predicate = value.wrapperContained; }
// public double lastPlayerY() { return wrapperContained.lastPlayerY; }
// public void lastPlayerY(double value) { wrapperContained.lastPlayerY = value; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public double lastPlayerX() { return wrapperContained.lastPlayerX; }
// public void lastPlayerX(double value) { wrapperContained.lastPlayerX = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerEntity closestPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.closestPlayer); }
// public void closestPlayer(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.closestPlayer = value.wrapperContained; }
// public double lastPlayerYaw() { return wrapperContained.lastPlayerYaw; }
// public void lastPlayerYaw(double value) { wrapperContained.lastPlayerYaw = value; }
// public double lastPlayerPitch() { return wrapperContained.lastPlayerPitch; }
// public void lastPlayerPitch(double value) { wrapperContained.lastPlayerPitch = value; }
// public boolean canBeScared() { return wrapperContained.canBeScared; }
// public void canBeScared(boolean value) { wrapperContained.canBeScared = value; }
// public double lastPlayerZ() { return wrapperContained.lastPlayerZ; }
// public void lastPlayerZ(double value) { wrapperContained.lastPlayerZ = value; }
// public java.util.function.Predicate foodPredicate() { return wrapperContained.foodPredicate; }
// public void foodPredicate(java.util.function.Predicate value) { wrapperContained.foodPredicate = value; }
// // public boolean canBeScared() { return wrapperContained.canBeScared(); }
// public boolean isTemptedBy(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isTemptedBy(entity.wrapperContained); }
public boolean isActive() { return wrapperContained.isActive(); }

}