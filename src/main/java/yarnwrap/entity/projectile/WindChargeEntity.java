package yarnwrap.entity.projectile;
public class WindChargeEntity { public net.minecraft.entity.projectile.WindChargeEntity wrapperContained; public WindChargeEntity(net.minecraft.entity.projectile.WindChargeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.EXPLOSION_BEHAVIOR); }
// public void EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.EXPLOSION_BEHAVIOR = value.wrapperContained; }
// public static yarnwrap.world.explosion.ExplosionBehavior EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(net.minecraft.entity.projectile.WindChargeEntity.EXPLOSION_BEHAVIOR); }
// public static void EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value, ) { net.minecraft.entity.projectile.WindChargeEntity.EXPLOSION_BEHAVIOR = value.wrapperContained; }

// public float EXPLOSION_POWER() { return wrapperContained.EXPLOSION_POWER; }
// public void EXPLOSION_POWER(float value) { wrapperContained.EXPLOSION_POWER = value; }
// public static float EXPLOSION_POWER() { return net.minecraft.entity.projectile.WindChargeEntity.EXPLOSION_POWER; }
// public static void EXPLOSION_POWER(float value, ) { net.minecraft.entity.projectile.WindChargeEntity.EXPLOSION_POWER = value; }

// public int deflectCooldown() { return wrapperContained.deflectCooldown; }
// public void deflectCooldown(int value) { wrapperContained.deflectCooldown = value; }
// public static int deflectCooldown() { return net.minecraft.entity.projectile.WindChargeEntity.deflectCooldown; }
// public static void deflectCooldown(int value, ) { net.minecraft.entity.projectile.WindChargeEntity.deflectCooldown = value; }

// public float MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED() { return wrapperContained.MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED; }
// public void MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED(float value) { wrapperContained.MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED = value; }
// public static float MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED() { return net.minecraft.entity.projectile.WindChargeEntity.MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED; }
// public static void MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED(float value, ) { net.minecraft.entity.projectile.WindChargeEntity.MAX_RENDER_DISTANCE_WHEN_NEWLY_SPAWNED = value; }

public WindChargeEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.projectile.WindChargeEntity(player.wrapperContained,world.wrapperContained,x,y,z); }
public WindChargeEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.entity.projectile.WindChargeEntity(world.wrapperContained,x,y,z,velocity.wrapperContained); }

}