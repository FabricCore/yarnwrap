package yarnwrap.entity.mob;
public class GhastEntity { public net.minecraft.entity.mob.GhastEntity wrapperContained; public GhastEntity(net.minecraft.entity.mob.GhastEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fireballStrength() { return wrapperContained.fireballStrength; }
// public void fireballStrength(int value) { wrapperContained.fireballStrength = value; }
// public static int fireballStrength() { return net.minecraft.entity.mob.GhastEntity.fireballStrength; }
// public static void fireballStrength(int value, ) { net.minecraft.entity.mob.GhastEntity.fireballStrength = value; }

// public yarnwrap.entity.data.TrackedData SHOOTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOOTING); }
// public void SHOOTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOOTING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SHOOTING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.GhastEntity.SHOOTING); }
// public static void SHOOTING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.GhastEntity.SHOOTING = value.wrapperContained; }

// public byte DEFAULT_FIREBALL_STRENGTH() { return wrapperContained.DEFAULT_FIREBALL_STRENGTH; }
// public void DEFAULT_FIREBALL_STRENGTH(byte value) { wrapperContained.DEFAULT_FIREBALL_STRENGTH = value; }
// public static byte DEFAULT_FIREBALL_STRENGTH() { return net.minecraft.entity.mob.GhastEntity.DEFAULT_FIREBALL_STRENGTH; }
// public static void DEFAULT_FIREBALL_STRENGTH(byte value, ) { net.minecraft.entity.mob.GhastEntity.DEFAULT_FIREBALL_STRENGTH = value; }

public void setShooting(boolean shooting) { wrapperContained.setShooting(shooting); }
// public static void setShooting(boolean shooting, ) { net.minecraft.entity.mob.GhastEntity.setShooting(shooting); }
public int getFireballStrength() { return wrapperContained.getFireballStrength(); }
// public static int getFireballStrength() { return net.minecraft.entity.mob.GhastEntity.getFireballStrength(); }
public boolean isShooting() { return wrapperContained.isShooting(); }
// public static boolean isShooting() { return net.minecraft.entity.mob.GhastEntity.isShooting(); }
// public boolean method_18450(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_18450(entity.wrapperContained,world.wrapperContained); }
// public static boolean method_18450(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.mob.GhastEntity.method_18450(entity.wrapperContained,world.wrapperContained); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.GhastEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createGhastAttributes() { return wrapperContained.createGhastAttributes(); }
public static Object createGhastAttributes() { return net.minecraft.entity.mob.GhastEntity.createGhastAttributes(); }
// public boolean isFireballFromPlayer(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.isFireballFromPlayer(damageSource.wrapperContained); }
// public static boolean isFireballFromPlayer(yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.entity.mob.GhastEntity.isFireballFromPlayer(damageSource.wrapperContained); }
// public void updateYaw(yarnwrap.entity.mob.MobEntity ghast) { wrapperContained.updateYaw(ghast.wrapperContained); }
// public static void updateYaw(yarnwrap.entity.mob.MobEntity ghast, ) { net.minecraft.entity.mob.GhastEntity.updateYaw(ghast.wrapperContained); }

}