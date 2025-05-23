package yarnwrap.entity.mob;
public class CreeperEntity { public net.minecraft.entity.mob.CreeperEntity wrapperContained; public CreeperEntity(net.minecraft.entity.mob.CreeperEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGED); }
// public void CHARGED(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHARGED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CHARGED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreeperEntity.CHARGED); }
// public static void CHARGED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreeperEntity.CHARGED = value.wrapperContained; }

// public int explosionRadius() { return wrapperContained.explosionRadius; }
// public void explosionRadius(int value) { wrapperContained.explosionRadius = value; }
// public static int explosionRadius() { return net.minecraft.entity.mob.CreeperEntity.explosionRadius; }
// public static void explosionRadius(int value, ) { net.minecraft.entity.mob.CreeperEntity.explosionRadius = value; }

// public int headsDropped() { return wrapperContained.headsDropped; }
// public void headsDropped(int value) { wrapperContained.headsDropped = value; }
// public static int headsDropped() { return net.minecraft.entity.mob.CreeperEntity.headsDropped; }
// public static void headsDropped(int value, ) { net.minecraft.entity.mob.CreeperEntity.headsDropped = value; }

// public int currentFuseTime() { return wrapperContained.currentFuseTime; }
// public void currentFuseTime(int value) { wrapperContained.currentFuseTime = value; }
// public static int currentFuseTime() { return net.minecraft.entity.mob.CreeperEntity.currentFuseTime; }
// public static void currentFuseTime(int value, ) { net.minecraft.entity.mob.CreeperEntity.currentFuseTime = value; }

// public int fuseTime() { return wrapperContained.fuseTime; }
// public void fuseTime(int value) { wrapperContained.fuseTime = value; }
// public static int fuseTime() { return net.minecraft.entity.mob.CreeperEntity.fuseTime; }
// public static void fuseTime(int value, ) { net.minecraft.entity.mob.CreeperEntity.fuseTime = value; }

// public int lastFuseTime() { return wrapperContained.lastFuseTime; }
// public void lastFuseTime(int value) { wrapperContained.lastFuseTime = value; }
// public static int lastFuseTime() { return net.minecraft.entity.mob.CreeperEntity.lastFuseTime; }
// public static void lastFuseTime(int value, ) { net.minecraft.entity.mob.CreeperEntity.lastFuseTime = value; }

// public yarnwrap.entity.data.TrackedData FUSE_SPEED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FUSE_SPEED); }
// public void FUSE_SPEED(yarnwrap.entity.data.TrackedData value) { wrapperContained.FUSE_SPEED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FUSE_SPEED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreeperEntity.FUSE_SPEED); }
// public static void FUSE_SPEED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreeperEntity.FUSE_SPEED = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData IGNITED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IGNITED); }
// public void IGNITED(yarnwrap.entity.data.TrackedData value) { wrapperContained.IGNITED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData IGNITED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreeperEntity.IGNITED); }
// public static void IGNITED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreeperEntity.IGNITED = value.wrapperContained; }

// public byte DEFAULT_EXPLOSION_RADIUS() { return wrapperContained.DEFAULT_EXPLOSION_RADIUS; }
// public void DEFAULT_EXPLOSION_RADIUS(byte value) { wrapperContained.DEFAULT_EXPLOSION_RADIUS = value; }
// public static byte DEFAULT_EXPLOSION_RADIUS() { return net.minecraft.entity.mob.CreeperEntity.DEFAULT_EXPLOSION_RADIUS; }
// public static void DEFAULT_EXPLOSION_RADIUS(byte value, ) { net.minecraft.entity.mob.CreeperEntity.DEFAULT_EXPLOSION_RADIUS = value; }

// public boolean DEFAULT_CHARGED() { return wrapperContained.DEFAULT_CHARGED; }
// public void DEFAULT_CHARGED(boolean value) { wrapperContained.DEFAULT_CHARGED = value; }
// public static boolean DEFAULT_CHARGED() { return net.minecraft.entity.mob.CreeperEntity.DEFAULT_CHARGED; }
// public static void DEFAULT_CHARGED(boolean value, ) { net.minecraft.entity.mob.CreeperEntity.DEFAULT_CHARGED = value; }

// public boolean DEFAULT_IGNITED() { return wrapperContained.DEFAULT_IGNITED; }
// public void DEFAULT_IGNITED(boolean value) { wrapperContained.DEFAULT_IGNITED = value; }
// public static boolean DEFAULT_IGNITED() { return net.minecraft.entity.mob.CreeperEntity.DEFAULT_IGNITED; }
// public static void DEFAULT_IGNITED(boolean value, ) { net.minecraft.entity.mob.CreeperEntity.DEFAULT_IGNITED = value; }

// public short DEFAULT_FUSE() { return wrapperContained.DEFAULT_FUSE; }
// public void DEFAULT_FUSE(short value) { wrapperContained.DEFAULT_FUSE = value; }
// public static short DEFAULT_FUSE() { return net.minecraft.entity.mob.CreeperEntity.DEFAULT_FUSE; }
// public static void DEFAULT_FUSE(short value, ) { net.minecraft.entity.mob.CreeperEntity.DEFAULT_FUSE = value; }

public boolean isIgnited() { return wrapperContained.isIgnited(); }
// public static boolean isIgnited() { return net.minecraft.entity.mob.CreeperEntity.isIgnited(); }
// public void spawnEffectsCloud() { wrapperContained.spawnEffectsCloud(); }
// public static void spawnEffectsCloud() { net.minecraft.entity.mob.CreeperEntity.spawnEffectsCloud(); }
public void onHeadDropped() { wrapperContained.onHeadDropped(); }
// public static void onHeadDropped() { net.minecraft.entity.mob.CreeperEntity.onHeadDropped(); }
public float getLerpedFuseTime(float tickProgress) { return wrapperContained.getLerpedFuseTime(tickProgress); }
// public static float getLerpedFuseTime(float tickProgress, ) { return net.minecraft.entity.mob.CreeperEntity.getLerpedFuseTime(tickProgress); }
public void ignite() { wrapperContained.ignite(); }
// public static void ignite() { net.minecraft.entity.mob.CreeperEntity.ignite(); }
public void setFuseSpeed(int fuseSpeed) { wrapperContained.setFuseSpeed(fuseSpeed); }
// public static void setFuseSpeed(int fuseSpeed, ) { net.minecraft.entity.mob.CreeperEntity.setFuseSpeed(fuseSpeed); }
// public void explode() { wrapperContained.explode(); }
// public static void explode() { net.minecraft.entity.mob.CreeperEntity.explode(); }
public int getFuseSpeed() { return wrapperContained.getFuseSpeed(); }
// public static int getFuseSpeed() { return net.minecraft.entity.mob.CreeperEntity.getFuseSpeed(); }
public boolean shouldDropHead() { return wrapperContained.shouldDropHead(); }
// public static boolean shouldDropHead() { return net.minecraft.entity.mob.CreeperEntity.shouldDropHead(); }
// public Object createCreeperAttributes() { return wrapperContained.createCreeperAttributes(); }
public static Object createCreeperAttributes() { return net.minecraft.entity.mob.CreeperEntity.createCreeperAttributes(); }
public boolean isCharged() { return wrapperContained.isCharged(); }
// public static boolean isCharged() { return net.minecraft.entity.mob.CreeperEntity.isCharged(); }

}