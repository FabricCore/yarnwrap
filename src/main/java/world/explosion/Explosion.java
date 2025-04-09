package yarnwrap.world.explosion;
public class Explosion { public net.minecraft.world.explosion.Explosion wrapperContained; public Explosion(net.minecraft.world.explosion.Explosion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior behavior() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.behavior); }
// public yarnwrap.world.explosion.ExplosionBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.DEFAULT_BEHAVIOR); }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
// public yarnwrap.particle.ParticleEffect emitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.emitterParticle); }
// public yarnwrap.registry.entry.RegistryEntry soundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.soundEvent); }
// public Object destructionType() { return wrapperContained.destructionType; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public boolean createFire() { return wrapperContained.createFire; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList affectedBlocks() { return wrapperContained.affectedBlocks; }
// public double z() { return wrapperContained.z; }
// public float power() { return wrapperContained.power; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public double y() { return wrapperContained.y; }
// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public java.util.Map affectedPlayers() { return wrapperContained.affectedPlayers; }
// public double x() { return wrapperContained.x; }
public float getExposure(yarnwrap.util.math.Vec3d source,yarnwrap.entity.Entity entity) { return wrapperContained.getExposure(source.wrapperContained,entity.wrapperContained); }
// public void tryMergeStack(java.util.List stacks,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryMergeStack(stacks,stack.wrapperContained,pos.wrapperContained); }
// public yarnwrap.world.explosion.ExplosionBehavior chooseBehavior(yarnwrap.entity.Entity entity) { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.chooseBehavior(entity.wrapperContained)); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }
public boolean shouldDestroy() { return wrapperContained.shouldDestroy(); }
public float getPower() { return wrapperContained.getPower(); }
public yarnwrap.entity.damage.DamageSource createDamageSource(yarnwrap.world.World world,yarnwrap.entity.Entity source) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.createDamageSource(world.wrapperContained,source.wrapperContained)); }
public yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPosition()); }
// public yarnwrap.entity.LivingEntity getCausingEntity(yarnwrap.entity.Entity from) { return new yarnwrap.entity.LivingEntity(wrapperContained.getCausingEntity(from.wrapperContained)); }
public Object getDestructionType() { return wrapperContained.getDestructionType(); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public yarnwrap.particle.ParticleEffect getEmitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getEmitterParticle()); }
public yarnwrap.registry.entry.RegistryEntry getSoundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSoundEvent()); }
public boolean canTriggerBlocks() { return wrapperContained.canTriggerBlocks(); }
public java.util.List getAffectedBlocks() { return wrapperContained.getAffectedBlocks(); }
public yarnwrap.entity.LivingEntity getCausingEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.getCausingEntity()); }
public void collectBlocksAndDamageEntities() { wrapperContained.collectBlocksAndDamageEntities(); }
public void affectWorld(boolean particles) { wrapperContained.affectWorld(particles); }
public java.util.Map getAffectedPlayers() { return wrapperContained.getAffectedPlayers(); }
public void clearAffectedBlocks() { wrapperContained.clearAffectedBlocks(); }

}