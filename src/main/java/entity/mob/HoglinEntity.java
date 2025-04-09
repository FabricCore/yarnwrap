package yarnwrap.entity.mob;
public class HoglinEntity { public net.minecraft.entity.mob.HoglinEntity wrapperContained; public HoglinEntity(net.minecraft.entity.mob.HoglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSOR_TYPES() { return wrapperContained.SENSOR_TYPES; }
// public com.google.common.collect.ImmutableList MEMORY_MODULE_TYPES() { return wrapperContained.MEMORY_MODULE_TYPES; }
// public int movementCooldownTicks() { return wrapperContained.movementCooldownTicks; }
// public int timeInOverworld() { return wrapperContained.timeInOverworld; }
// public boolean cannotBeHunted() { return wrapperContained.cannotBeHunted; }
// public yarnwrap.entity.data.TrackedData BABY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BABY); }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public int ATTACK_KNOCKBACK() { return wrapperContained.ATTACK_KNOCKBACK; }
// public float KNOCKBACK_RESISTANCE() { return wrapperContained.KNOCKBACK_RESISTANCE; }
// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public float BABY_ATTACK_DAMAGE() { return wrapperContained.BABY_ATTACK_DAMAGE; }
// public int CONVERSION_TIME() { return wrapperContained.CONVERSION_TIME; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean isAdult() { return wrapperContained.isAdult(); }
// public void zombify(yarnwrap.server.world.ServerWorld word) { wrapperContained.zombify(word.wrapperContained); }
public Object createHoglinAttributes() { return wrapperContained.createHoglinAttributes(); }
public boolean canConvert() { return wrapperContained.canConvert(); }
public boolean canBeHunted() { return wrapperContained.canBeHunted(); }
// public boolean isImmuneToZombification() { return wrapperContained.isImmuneToZombification(); }
public void setImmuneToZombification(boolean immuneToZombification) { wrapperContained.setImmuneToZombification(immuneToZombification); }
// public void setCannotBeHunted(boolean cannotBeHunted) { wrapperContained.setCannotBeHunted(cannotBeHunted); }

}