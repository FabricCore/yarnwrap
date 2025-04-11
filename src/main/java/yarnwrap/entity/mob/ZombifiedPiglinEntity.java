package yarnwrap.entity.mob;
public class ZombifiedPiglinEntity { public net.minecraft.entity.mob.ZombifiedPiglinEntity wrapperContained; public ZombifiedPiglinEntity(net.minecraft.entity.mob.ZombifiedPiglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGRY_SOUND_DELAY_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGRY_SOUND_DELAY_RANGE); }
// public void ANGRY_SOUND_DELAY_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGRY_SOUND_DELAY_RANGE = value.wrapperContained; }
// public int angerPassingCooldown() { return wrapperContained.angerPassingCooldown; }
// public void angerPassingCooldown(int value) { wrapperContained.angerPassingCooldown = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_PASSING_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_PASSING_COOLDOWN_RANGE); }
// public void ANGER_PASSING_COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_PASSING_COOLDOWN_RANGE = value.wrapperContained; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier ATTACKING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.ATTACKING_SPEED_BOOST); }
// public void ATTACKING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.ATTACKING_SPEED_BOOST = value.wrapperContained; }
// public int angrySoundDelay() { return wrapperContained.angrySoundDelay; }
// public void angrySoundDelay(int value) { wrapperContained.angrySoundDelay = value; }
// public yarnwrap.util.Identifier ATTACKING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ATTACKING_SPEED_MODIFIER_ID); }
// public void ATTACKING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.ATTACKING_SPEED_MODIFIER_ID = value.wrapperContained; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createZombifiedPiglinAttributes() { return wrapperContained.createZombifiedPiglinAttributes(); }
// public void playAngrySound() { wrapperContained.playAngrySound(); }
// public void tickAngerPassing() { wrapperContained.tickAngerPassing(); }
// public void angerNearbyZombifiedPiglins() { wrapperContained.angerNearbyZombifiedPiglins(); }
// public void tickAngrySound() { wrapperContained.tickAngrySound(); }

}