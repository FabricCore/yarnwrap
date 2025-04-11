package yarnwrap.world.explosion;
public class Explosion { public net.minecraft.world.explosion.Explosion wrapperContained; public Explosion(net.minecraft.world.explosion.Explosion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior behavior() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.behavior); }
// public void behavior(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.behavior = value.wrapperContained; }
// public yarnwrap.world.explosion.ExplosionBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.DEFAULT_BEHAVIOR); }
// public void DEFAULT_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.DEFAULT_BEHAVIOR = value.wrapperContained; }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
// public void particle(yarnwrap.particle.ParticleEffect value) { wrapperContained.particle = value.wrapperContained; }
// public yarnwrap.particle.ParticleEffect emitterParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.emitterParticle); }
// public void emitterParticle(yarnwrap.particle.ParticleEffect value) { wrapperContained.emitterParticle = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry soundEvent() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.soundEvent); }
// public void soundEvent(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.soundEvent = value.wrapperContained; }
// public Object destructionType() { return wrapperContained.destructionType; }
// // public void destructionType(Object value) { wrapperContained.destructionType = value; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public boolean createFire() { return wrapperContained.createFire; }
// public void createFire(boolean value) { wrapperContained.createFire = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList affectedBlocks() { return wrapperContained.affectedBlocks; }
// public void affectedBlocks(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.affectedBlocks = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public float power() { return wrapperContained.power; }
// public void power(float value) { wrapperContained.power = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public void damageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.damageSource = value.wrapperContained; }
// public java.util.Map affectedPlayers() { return wrapperContained.affectedPlayers; }
// public void affectedPlayers(java.util.Map value) { wrapperContained.affectedPlayers = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public Explosion(yarnwrap.world.World world,yarnwrap.entity.Entity entity,double x,double y,double z,float power,java.util.List affectedBlocks,Object destructionType,yarnwrap.particle.ParticleEffect particle,yarnwrap.particle.ParticleEffect emitterParticle,yarnwrap.registry.entry.RegistryEntry soundEvent) { this.wrapperContained = new net.minecraft.world.explosion.Explosion(world.wrapperContained,entity.wrapperContained,x,y,z,power,affectedBlocks,destructionType,particle.wrapperContained,emitterParticle.wrapperContained,soundEvent.wrapperContained); }
// public Explosion(yarnwrap.world.World world,yarnwrap.entity.Entity entity,double x,double y,double z,float power,boolean createFire,Object destructionType) { this.wrapperContained = new net.minecraft.world.explosion.Explosion(world.wrapperContained,entity.wrapperContained,x,y,z,power,createFire,destructionType); }
// public Explosion(yarnwrap.world.World world,yarnwrap.entity.Entity entity,double x,double y,double z,float power,boolean createFire,Object destructionType,java.util.List affectedBlocks) { this.wrapperContained = new net.minecraft.world.explosion.Explosion(world.wrapperContained,entity.wrapperContained,x,y,z,power,createFire,destructionType,affectedBlocks); }
// public Explosion(yarnwrap.world.World world,yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,double x,double y,double z,float power,boolean createFire,Object destructionType,yarnwrap.particle.ParticleEffect particle,yarnwrap.particle.ParticleEffect emitterParticle,yarnwrap.registry.entry.RegistryEntry soundEvent) { this.wrapperContained = new net.minecraft.world.explosion.Explosion(world.wrapperContained,entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,x,y,z,power,createFire,destructionType,particle.wrapperContained,emitterParticle.wrapperContained,soundEvent.wrapperContained); }
public float getExposure(yarnwrap.util.math.Vec3d source,yarnwrap.entity.Entity entity) { return wrapperContained.getExposure(source.wrapperContained,entity.wrapperContained); }
// public void tryMergeStack(java.util.List stacks,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryMergeStack(stacks,stack.wrapperContained,pos.wrapperContained); }
// public void method_24024(java.util.List stack,yarnwrap.item.ItemStack pos) { wrapperContained.method_24024(stack,pos.wrapperContained); }
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