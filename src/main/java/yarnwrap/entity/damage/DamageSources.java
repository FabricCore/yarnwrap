package yarnwrap.entity.damage;
public class DamageSources { public net.minecraft.entity.damage.DamageSources wrapperContained; public DamageSources(net.minecraft.entity.damage.DamageSources wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.Registry registry() { return new yarnwrap.registry.Registry(wrapperContained.registry); }
// public void registry(yarnwrap.registry.Registry value) { wrapperContained.registry = value.wrapperContained; }
// public static yarnwrap.registry.Registry registry() { return new yarnwrap.registry.Registry(net.minecraft.entity.damage.DamageSources.registry); }
// public static void registry(yarnwrap.registry.Registry value, ) { net.minecraft.entity.damage.DamageSources.registry = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource inFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inFire); }
// public void inFire(yarnwrap.entity.damage.DamageSource value) { wrapperContained.inFire = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource inFire() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.inFire); }
// public static void inFire(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.inFire = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource lightningBolt() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lightningBolt); }
// public void lightningBolt(yarnwrap.entity.damage.DamageSource value) { wrapperContained.lightningBolt = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource lightningBolt() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.lightningBolt); }
// public static void lightningBolt(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.lightningBolt = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource onFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.onFire); }
// public void onFire(yarnwrap.entity.damage.DamageSource value) { wrapperContained.onFire = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource onFire() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.onFire); }
// public static void onFire(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.onFire = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource lava() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lava); }
// public void lava(yarnwrap.entity.damage.DamageSource value) { wrapperContained.lava = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource lava() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.lava); }
// public static void lava(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.lava = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource hotFloor() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.hotFloor); }
// public void hotFloor(yarnwrap.entity.damage.DamageSource value) { wrapperContained.hotFloor = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource hotFloor() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.hotFloor); }
// public static void hotFloor(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.hotFloor = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource inWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inWall); }
// public void inWall(yarnwrap.entity.damage.DamageSource value) { wrapperContained.inWall = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource inWall() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.inWall); }
// public static void inWall(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.inWall = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource cramming() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cramming); }
// public void cramming(yarnwrap.entity.damage.DamageSource value) { wrapperContained.cramming = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource cramming() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.cramming); }
// public static void cramming(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.cramming = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource drown() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.drown); }
// public void drown(yarnwrap.entity.damage.DamageSource value) { wrapperContained.drown = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource drown() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.drown); }
// public static void drown(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.drown = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource starve() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.starve); }
// public void starve(yarnwrap.entity.damage.DamageSource value) { wrapperContained.starve = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource starve() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.starve); }
// public static void starve(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.starve = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource cactus() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cactus); }
// public void cactus(yarnwrap.entity.damage.DamageSource value) { wrapperContained.cactus = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource cactus() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.cactus); }
// public static void cactus(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.cactus = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource fall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fall); }
// public void fall(yarnwrap.entity.damage.DamageSource value) { wrapperContained.fall = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource fall() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fall); }
// public static void fall(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.fall = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource flyIntoWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.flyIntoWall); }
// public void flyIntoWall(yarnwrap.entity.damage.DamageSource value) { wrapperContained.flyIntoWall = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource flyIntoWall() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.flyIntoWall); }
// public static void flyIntoWall(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.flyIntoWall = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource outOfWorld() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outOfWorld); }
// public void outOfWorld(yarnwrap.entity.damage.DamageSource value) { wrapperContained.outOfWorld = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource outOfWorld() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.outOfWorld); }
// public static void outOfWorld(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.outOfWorld = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource generic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.generic); }
// public void generic(yarnwrap.entity.damage.DamageSource value) { wrapperContained.generic = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource generic() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.generic); }
// public static void generic(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.generic = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource magic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.magic); }
// public void magic(yarnwrap.entity.damage.DamageSource value) { wrapperContained.magic = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource magic() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.magic); }
// public static void magic(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.magic = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource wither() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.wither); }
// public void wither(yarnwrap.entity.damage.DamageSource value) { wrapperContained.wither = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource wither() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.wither); }
// public static void wither(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.wither = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource dragonBreath() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dragonBreath); }
// public void dragonBreath(yarnwrap.entity.damage.DamageSource value) { wrapperContained.dragonBreath = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource dragonBreath() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.dragonBreath); }
// public static void dragonBreath(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.dragonBreath = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource dryOut() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dryOut); }
// public void dryOut(yarnwrap.entity.damage.DamageSource value) { wrapperContained.dryOut = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource dryOut() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.dryOut); }
// public static void dryOut(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.dryOut = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource sweetBerryBush() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sweetBerryBush); }
// public void sweetBerryBush(yarnwrap.entity.damage.DamageSource value) { wrapperContained.sweetBerryBush = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource sweetBerryBush() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.sweetBerryBush); }
// public static void sweetBerryBush(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.sweetBerryBush = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource freeze() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.freeze); }
// public void freeze(yarnwrap.entity.damage.DamageSource value) { wrapperContained.freeze = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource freeze() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.freeze); }
// public static void freeze(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.freeze = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource stalagmite() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.stalagmite); }
// public void stalagmite(yarnwrap.entity.damage.DamageSource value) { wrapperContained.stalagmite = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource stalagmite() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.stalagmite); }
// public static void stalagmite(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.stalagmite = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource outsideBorder() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outsideBorder); }
// public void outsideBorder(yarnwrap.entity.damage.DamageSource value) { wrapperContained.outsideBorder = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource outsideBorder() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.outsideBorder); }
// public static void outsideBorder(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.outsideBorder = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource genericKill() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.genericKill); }
// public void genericKill(yarnwrap.entity.damage.DamageSource value) { wrapperContained.genericKill = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource genericKill() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.genericKill); }
// public static void genericKill(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.genericKill = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource campfire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.campfire); }
// public void campfire(yarnwrap.entity.damage.DamageSource value) { wrapperContained.campfire = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource campfire() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.campfire); }
// public static void campfire(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.campfire = value.wrapperContained; }

// public yarnwrap.entity.damage.DamageSource enderPearl() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.enderPearl); }
// public void enderPearl(yarnwrap.entity.damage.DamageSource value) { wrapperContained.enderPearl = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource enderPearl() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.enderPearl); }
// public static void enderPearl(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.damage.DamageSources.enderPearl = value.wrapperContained; }

public DamageSources(yarnwrap.registry.DynamicRegistryManager registryManager) { this.wrapperContained = new net.minecraft.entity.damage.DamageSources(registryManager.wrapperContained); }
// public yarnwrap.entity.damage.DamageSource inFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inFire()); }
// // public static yarnwrap.entity.damage.DamageSource inFire() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.inFire()); }
public yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.create(key.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.create(key.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.create(key.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.create(key.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key,yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.create(key.wrapperContained,source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource create(yarnwrap.registry.RegistryKey key,yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.create(key.wrapperContained,source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource fallingBlock(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fallingBlock(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource fallingBlock(yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fallingBlock(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource trident(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.trident(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource trident(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.trident(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource mobProjectile(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.mobProjectile(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource mobProjectile(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.mobProjectile(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource sting(yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sting(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource sting(yarnwrap.entity.LivingEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.sting(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource playerAttack(yarnwrap.entity.player.PlayerEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.playerAttack(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource playerAttack(yarnwrap.entity.player.PlayerEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.playerAttack(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource arrow(yarnwrap.entity.projectile.PersistentProjectileEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.arrow(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource arrow(yarnwrap.entity.projectile.PersistentProjectileEntity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.arrow(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource fireball(yarnwrap.entity.projectile.AbstractFireballEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fireball(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource fireball(yarnwrap.entity.projectile.AbstractFireballEntity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fireball(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource fireworks(yarnwrap.entity.projectile.FireworkRocketEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fireworks(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource fireworks(yarnwrap.entity.projectile.FireworkRocketEntity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fireworks(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource witherSkull(yarnwrap.entity.projectile.WitherSkullEntity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.witherSkull(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource witherSkull(yarnwrap.entity.projectile.WitherSkullEntity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.witherSkull(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource explosion(yarnwrap.world.explosion.Explosion explosion) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.explosion(explosion.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource explosion(yarnwrap.world.explosion.Explosion explosion, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.explosion(explosion.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource badRespawnPoint(yarnwrap.util.math.Vec3d position) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.badRespawnPoint(position.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource badRespawnPoint(yarnwrap.util.math.Vec3d position, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.badRespawnPoint(position.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource lightningBolt() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lightningBolt()); }
// // public static yarnwrap.entity.damage.DamageSource lightningBolt() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.lightningBolt()); }
public yarnwrap.entity.damage.DamageSource fallingAnvil(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fallingAnvil(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource fallingAnvil(yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fallingAnvil(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource thrown(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.thrown(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource thrown(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.thrown(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource mobAttack(yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.mobAttack(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource mobAttack(yarnwrap.entity.LivingEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.mobAttack(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource onFire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.onFire()); }
// // public static yarnwrap.entity.damage.DamageSource onFire() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.onFire()); }
public yarnwrap.entity.damage.DamageSource fallingStalactite(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fallingStalactite(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource fallingStalactite(yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fallingStalactite(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource indirectMagic(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.indirectMagic(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource indirectMagic(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.indirectMagic(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource mobAttackNoAggro(yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.mobAttackNoAggro(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource mobAttackNoAggro(yarnwrap.entity.LivingEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.mobAttackNoAggro(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource lava() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lava()); }
// // public static yarnwrap.entity.damage.DamageSource lava() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.lava()); }
public yarnwrap.entity.damage.DamageSource thorns(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.thorns(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource thorns(yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.thorns(attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource explosion(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.explosion(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource explosion(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.explosion(source.wrapperContained,attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource hotFloor() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.hotFloor()); }
// // public static yarnwrap.entity.damage.DamageSource hotFloor() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.hotFloor()); }
public yarnwrap.entity.damage.DamageSource sonicBoom(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sonicBoom(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource sonicBoom(yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.sonicBoom(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource inWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.inWall()); }
// // public static yarnwrap.entity.damage.DamageSource inWall() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.inWall()); }
// public yarnwrap.entity.damage.DamageSource cramming() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cramming()); }
// // public static yarnwrap.entity.damage.DamageSource cramming() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.cramming()); }
// public yarnwrap.entity.damage.DamageSource drown() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.drown()); }
// // public static yarnwrap.entity.damage.DamageSource drown() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.drown()); }
// public yarnwrap.entity.damage.DamageSource starve() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.starve()); }
// // public static yarnwrap.entity.damage.DamageSource starve() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.starve()); }
// public yarnwrap.entity.damage.DamageSource cactus() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.cactus()); }
// // public static yarnwrap.entity.damage.DamageSource cactus() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.cactus()); }
// public yarnwrap.entity.damage.DamageSource fall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.fall()); }
// // public static yarnwrap.entity.damage.DamageSource fall() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.fall()); }
// public yarnwrap.entity.damage.DamageSource flyIntoWall() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.flyIntoWall()); }
// // public static yarnwrap.entity.damage.DamageSource flyIntoWall() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.flyIntoWall()); }
// public yarnwrap.entity.damage.DamageSource outOfWorld() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outOfWorld()); }
// // public static yarnwrap.entity.damage.DamageSource outOfWorld() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.outOfWorld()); }
// public yarnwrap.entity.damage.DamageSource generic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.generic()); }
// // public static yarnwrap.entity.damage.DamageSource generic() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.generic()); }
// public yarnwrap.entity.damage.DamageSource magic() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.magic()); }
// // public static yarnwrap.entity.damage.DamageSource magic() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.magic()); }
// public yarnwrap.entity.damage.DamageSource wither() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.wither()); }
// // public static yarnwrap.entity.damage.DamageSource wither() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.wither()); }
// public yarnwrap.entity.damage.DamageSource dragonBreath() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dragonBreath()); }
// // public static yarnwrap.entity.damage.DamageSource dragonBreath() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.dragonBreath()); }
// public yarnwrap.entity.damage.DamageSource dryOut() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.dryOut()); }
// // public static yarnwrap.entity.damage.DamageSource dryOut() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.dryOut()); }
// public yarnwrap.entity.damage.DamageSource sweetBerryBush() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.sweetBerryBush()); }
// // public static yarnwrap.entity.damage.DamageSource sweetBerryBush() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.sweetBerryBush()); }
// public yarnwrap.entity.damage.DamageSource freeze() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.freeze()); }
// // public static yarnwrap.entity.damage.DamageSource freeze() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.freeze()); }
// public yarnwrap.entity.damage.DamageSource stalagmite() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.stalagmite()); }
// // public static yarnwrap.entity.damage.DamageSource stalagmite() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.stalagmite()); }
// public yarnwrap.entity.damage.DamageSource outsideBorder() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.outsideBorder()); }
// // public static yarnwrap.entity.damage.DamageSource outsideBorder() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.outsideBorder()); }
// public yarnwrap.entity.damage.DamageSource genericKill() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.genericKill()); }
// // public static yarnwrap.entity.damage.DamageSource genericKill() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.genericKill()); }
public yarnwrap.entity.damage.DamageSource spit(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.spit(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource spit(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.spit(source.wrapperContained,attacker.wrapperContained)); }
public yarnwrap.entity.damage.DamageSource windCharge(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.windCharge(source.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource windCharge(yarnwrap.entity.Entity source,yarnwrap.entity.LivingEntity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.windCharge(source.wrapperContained,attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource campfire() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.campfire()); }
// // public static yarnwrap.entity.damage.DamageSource campfire() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.campfire()); }
public yarnwrap.entity.damage.DamageSource maceSmash(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.maceSmash(attacker.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource maceSmash(yarnwrap.entity.Entity attacker, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.maceSmash(attacker.wrapperContained)); }
// public yarnwrap.entity.damage.DamageSource enderPearl() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.enderPearl()); }
// // public static yarnwrap.entity.damage.DamageSource enderPearl() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.damage.DamageSources.enderPearl()); }

}