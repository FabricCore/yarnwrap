package yarnwrap.entity.ai.goal;
public class WanderAroundGoal { public net.minecraft.entity.ai.goal.WanderAroundGoal wrapperContained; public WanderAroundGoal(net.minecraft.entity.ai.goal.WanderAroundGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canDespawn() { return wrapperContained.canDespawn; }
public int DEFAULT_CHANCE() { return wrapperContained.DEFAULT_CHANCE; }
// public double targetZ() { return wrapperContained.targetZ; }
// public double targetY() { return wrapperContained.targetY; }
// public double targetX() { return wrapperContained.targetX; }
// public int chance() { return wrapperContained.chance; }
// public boolean ignoringChance() { return wrapperContained.ignoringChance; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public double speed() { return wrapperContained.speed; }
// public yarnwrap.util.math.Vec3d getWanderTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.getWanderTarget()); }
public void setChance(int chance) { wrapperContained.setChance(chance); }
public void ignoreChanceOnce() { wrapperContained.ignoreChanceOnce(); }

}