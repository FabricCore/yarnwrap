package yarnwrap.entity.mob;
public class SlimeEntity { public net.minecraft.entity.mob.SlimeEntity wrapperContained; public SlimeEntity(net.minecraft.entity.mob.SlimeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int MIN_SIZE() { return wrapperContained.MIN_SIZE; }
public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
public float lastStretch() { return wrapperContained.lastStretch; }
public float stretch() { return wrapperContained.stretch; }
public float targetStretch() { return wrapperContained.targetStretch; }
// public yarnwrap.entity.data.TrackedData SLIME_SIZE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SLIME_SIZE); }
// public boolean onGroundLastTick() { return wrapperContained.onGroundLastTick; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public float getJumpSoundPitch() { return wrapperContained.getJumpSoundPitch(); }
public int getSize() { return wrapperContained.getSize(); }
// public yarnwrap.sound.SoundEvent getJumpSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getJumpSound()); }
// public int getTicksUntilNextJump() { return wrapperContained.getTicksUntilNextJump(); }
// public void damage(yarnwrap.entity.LivingEntity target) { wrapperContained.damage(target.wrapperContained); }
// public void updateStretch() { wrapperContained.updateStretch(); }
public boolean isSmall() { return wrapperContained.isSmall(); }
// public float getDamageAmount() { return wrapperContained.getDamageAmount(); }
// public boolean makesJumpSound() { return wrapperContained.makesJumpSound(); }
// public yarnwrap.sound.SoundEvent getSquishSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSquishSound()); }
public void setSize(int size,boolean heal) { wrapperContained.setSize(size,heal); }
// public yarnwrap.particle.ParticleEffect getParticles() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticles()); }
// public boolean canAttack() { return wrapperContained.canAttack(); }

}