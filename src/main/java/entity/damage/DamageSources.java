package yarnwrap.entity.damage;
public class DamageSources { public net.minecraft.entity.damage.DamageSources wrapperContained; public DamageSources(net.minecraft.entity.damage.DamageSources wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.Registry registry() { return new yarnwrap.registry.Registry(wrapperContained.registry); }
// public yarnwrap.entity.damage.DamageSource inFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inFire); }
// public yarnwrap.entity.damage.DamageSource lightningBolt() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lightningBolt); }
// public yarnwrap.entity.damage.DamageSource onFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.onFire); }
// public yarnwrap.entity.damage.DamageSource lava() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lava); }
// public yarnwrap.entity.damage.DamageSource hotFloor() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.hotFloor); }
// public yarnwrap.entity.damage.DamageSource inWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inWall); }
// public yarnwrap.entity.damage.DamageSource cramming() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cramming); }
// public yarnwrap.entity.damage.DamageSource drown() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.drown); }
// public yarnwrap.entity.damage.DamageSource starve() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.starve); }
// public yarnwrap.entity.damage.DamageSource cactus() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cactus); }
// public yarnwrap.entity.damage.DamageSource fall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fall); }
// public yarnwrap.entity.damage.DamageSource flyIntoWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.flyIntoWall); }
// public yarnwrap.entity.damage.DamageSource outOfWorld() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outOfWorld); }
// public yarnwrap.entity.damage.DamageSource generic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.generic); }
// public yarnwrap.entity.damage.DamageSource magic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.magic); }
// public yarnwrap.entity.damage.DamageSource wither() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.wither); }
// public yarnwrap.entity.damage.DamageSource dragonBreath() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dragonBreath); }
// public yarnwrap.entity.damage.DamageSource dryOut() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dryOut); }
// public yarnwrap.entity.damage.DamageSource sweetBerryBush() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sweetBerryBush); }
// public yarnwrap.entity.damage.DamageSource freeze() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.freeze); }
// public yarnwrap.entity.damage.DamageSource stalagmite() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.stalagmite); }
// public yarnwrap.entity.damage.DamageSource outsideBorder() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outsideBorder); }
// public yarnwrap.entity.damage.DamageSource genericKill() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.genericKill); }
// public yarnwrap.entity.damage.DamageSource campfire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.campfire); }
// public yarnwrap.entity.damage.DamageSource inFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inFire()); }
// public yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.create(key.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.create(key.wrapperContained,attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key,yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.create(key.wrapperContained,source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource fallingBlock(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fallingBlock(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource trident(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.trident(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource mobProjectile(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.mobProjectile(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource sting(yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sting(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource playerAttack(yarnwrap.entity.player.PlayerEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.playerAttack(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource arrow(yarnwrap.entity.projectile.PersistentProjectileEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.arrow(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource fireball(yarnwrap.entity.projectile.AbstractFireballEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fireball(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource fireworks(yarnwrap.entity.projectile.FireworkRocketEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fireworks(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource witherSkull(yarnwrap.entity.projectile.WitherSkullEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.witherSkull(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource explosion(yarnwrap.world.explosion.Explosion explosion) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.explosion(explosion.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource badRespawnPoint(yarnwrap.util.math.Vec3d position) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.badRespawnPoint(position.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource lightningBolt() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lightningBolt()); }
public yarnwrap.entity.damage.DamageSource fallingAnvil(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fallingAnvil(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource thrown(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.thrown(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource mobAttack(yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.mobAttack(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource onFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.onFire()); }
public yarnwrap.entity.damage.DamageSource fallingStalactite(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fallingStalactite(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource indirectMagic(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.indirectMagic(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource mobAttackNoAggro(yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.mobAttackNoAggro(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource lava() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lava()); }
public yarnwrap.entity.damage.DamageSource thorns(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.thorns(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource explosion(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.explosion(source.wrapperContained,attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource hotFloor() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.hotFloor()); }
public yarnwrap.entity.damage.DamageSource sonicBoom(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sonicBoom(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource inWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inWall()); }
// public yarnwrap.entity.damage.DamageSource cramming() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cramming()); }
// public yarnwrap.entity.damage.DamageSource drown() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.drown()); }
// public yarnwrap.entity.damage.DamageSource starve() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.starve()); }
// public yarnwrap.entity.damage.DamageSource cactus() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cactus()); }
// public yarnwrap.entity.damage.DamageSource fall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fall()); }
// public yarnwrap.entity.damage.DamageSource flyIntoWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.flyIntoWall()); }
// public yarnwrap.entity.damage.DamageSource outOfWorld() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outOfWorld()); }
// public yarnwrap.entity.damage.DamageSource generic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.generic()); }
// public yarnwrap.entity.damage.DamageSource magic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.magic()); }
// public yarnwrap.entity.damage.DamageSource wither() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.wither()); }
// public yarnwrap.entity.damage.DamageSource dragonBreath() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dragonBreath()); }
// public yarnwrap.entity.damage.DamageSource dryOut() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dryOut()); }
// public yarnwrap.entity.damage.DamageSource sweetBerryBush() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sweetBerryBush()); }
// public yarnwrap.entity.damage.DamageSource freeze() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.freeze()); }
// public yarnwrap.entity.damage.DamageSource stalagmite() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.stalagmite()); }
// public yarnwrap.entity.damage.DamageSource outsideBorder() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outsideBorder()); }
// public yarnwrap.entity.damage.DamageSource genericKill() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.genericKill()); }
public yarnwrap.entity.damage.DamageSource spit(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.spit(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource windCharge(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.windCharge(source.wrapperContained,attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource campfire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.campfire()); }

}