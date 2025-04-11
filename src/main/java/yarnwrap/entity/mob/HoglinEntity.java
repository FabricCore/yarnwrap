package yarnwrap.entity.mob;
public class HoglinEntity { public net.minecraft.entity.mob.HoglinEntity wrapperContained; public HoglinEntity(net.minecraft.entity.mob.HoglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSOR_TYPES() { return wrapperContained.SENSOR_TYPES; }
// public void SENSOR_TYPES(com.google.common.collect.ImmutableList value) { wrapperContained.SENSOR_TYPES = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULE_TYPES() { return wrapperContained.MEMORY_MODULE_TYPES; }
// public void MEMORY_MODULE_TYPES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULE_TYPES = value; }
// public int movementCooldownTicks() { return wrapperContained.movementCooldownTicks; }
// public void movementCooldownTicks(int value) { wrapperContained.movementCooldownTicks = value; }
// public int timeInOverworld() { return wrapperContained.timeInOverworld; }
// public void timeInOverworld(int value) { wrapperContained.timeInOverworld = value; }
// public boolean cannotBeHunted() { return wrapperContained.cannotBeHunted; }
// public void cannotBeHunted(boolean value) { wrapperContained.cannotBeHunted = value; }
// public yarnwrap.entity.data.TrackedData BABY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BABY); }
// public void BABY(yarnwrap.entity.data.TrackedData value) { wrapperContained.BABY = value.wrapperContained; }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public void MAX_HEALTH(int value) { wrapperContained.MAX_HEALTH = value; }
// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public void MOVEMENT_SPEED(float value) { wrapperContained.MOVEMENT_SPEED = value; }
// public int ATTACK_KNOCKBACK() { return wrapperContained.ATTACK_KNOCKBACK; }
// public void ATTACK_KNOCKBACK(int value) { wrapperContained.ATTACK_KNOCKBACK = value; }
// public float KNOCKBACK_RESISTANCE() { return wrapperContained.KNOCKBACK_RESISTANCE; }
// public void KNOCKBACK_RESISTANCE(float value) { wrapperContained.KNOCKBACK_RESISTANCE = value; }
// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(int value) { wrapperContained.ATTACK_DAMAGE = value; }
// public float BABY_ATTACK_DAMAGE() { return wrapperContained.BABY_ATTACK_DAMAGE; }
// public void BABY_ATTACK_DAMAGE(float value) { wrapperContained.BABY_ATTACK_DAMAGE = value; }
// public int CONVERSION_TIME() { return wrapperContained.CONVERSION_TIME; }
// public void CONVERSION_TIME(int value) { wrapperContained.CONVERSION_TIME = value; }
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