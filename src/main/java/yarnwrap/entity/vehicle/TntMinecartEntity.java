package yarnwrap.entity.vehicle;
public class TntMinecartEntity { public net.minecraft.entity.vehicle.TntMinecartEntity wrapperContained; public TntMinecartEntity(net.minecraft.entity.vehicle.TntMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fuseTicks() { return wrapperContained.fuseTicks; }
// public void fuseTicks(int value) { wrapperContained.fuseTicks = value; }
// public static int fuseTicks() { return net.minecraft.entity.vehicle.TntMinecartEntity.fuseTicks; }
// public static void fuseTicks(int value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.fuseTicks = value; }

// public byte PRIME_TNT_STATUS() { return wrapperContained.PRIME_TNT_STATUS; }
// public void PRIME_TNT_STATUS(byte value) { wrapperContained.PRIME_TNT_STATUS = value; }
// public static byte PRIME_TNT_STATUS() { return net.minecraft.entity.vehicle.TntMinecartEntity.PRIME_TNT_STATUS; }
// public static void PRIME_TNT_STATUS(byte value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.PRIME_TNT_STATUS = value; }

// public java.lang.String EXPLOSION_POWER_NBT_KEY() { return wrapperContained.EXPLOSION_POWER_NBT_KEY; }
// public void EXPLOSION_POWER_NBT_KEY(java.lang.String value) { wrapperContained.EXPLOSION_POWER_NBT_KEY = value; }
// public static java.lang.String EXPLOSION_POWER_NBT_KEY() { return net.minecraft.entity.vehicle.TntMinecartEntity.EXPLOSION_POWER_NBT_KEY; }
// public static void EXPLOSION_POWER_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.EXPLOSION_POWER_NBT_KEY = value; }

// public float DEFAULT_EXPLOSION_POWER() { return wrapperContained.DEFAULT_EXPLOSION_POWER; }
// public void DEFAULT_EXPLOSION_POWER(float value) { wrapperContained.DEFAULT_EXPLOSION_POWER = value; }
// public static float DEFAULT_EXPLOSION_POWER() { return net.minecraft.entity.vehicle.TntMinecartEntity.DEFAULT_EXPLOSION_POWER; }
// public static void DEFAULT_EXPLOSION_POWER(float value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.DEFAULT_EXPLOSION_POWER = value; }

// public float explosionPower() { return wrapperContained.explosionPower; }
// public void explosionPower(float value) { wrapperContained.explosionPower = value; }
// public static float explosionPower() { return net.minecraft.entity.vehicle.TntMinecartEntity.explosionPower; }
// public static void explosionPower(float value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.explosionPower = value; }

// public java.lang.String EXPLOSION_SPEED_FACTOR_NBT_KEY() { return wrapperContained.EXPLOSION_SPEED_FACTOR_NBT_KEY; }
// public void EXPLOSION_SPEED_FACTOR_NBT_KEY(java.lang.String value) { wrapperContained.EXPLOSION_SPEED_FACTOR_NBT_KEY = value; }
// public static java.lang.String EXPLOSION_SPEED_FACTOR_NBT_KEY() { return net.minecraft.entity.vehicle.TntMinecartEntity.EXPLOSION_SPEED_FACTOR_NBT_KEY; }
// public static void EXPLOSION_SPEED_FACTOR_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.EXPLOSION_SPEED_FACTOR_NBT_KEY = value; }

// public java.lang.String FUSE_NBT_KEY() { return wrapperContained.FUSE_NBT_KEY; }
// public void FUSE_NBT_KEY(java.lang.String value) { wrapperContained.FUSE_NBT_KEY = value; }
// public static java.lang.String FUSE_NBT_KEY() { return net.minecraft.entity.vehicle.TntMinecartEntity.FUSE_NBT_KEY; }
// public static void FUSE_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.FUSE_NBT_KEY = value; }

// public float DEFAULT_EXPLOSION_SPEED_FACTOR() { return wrapperContained.DEFAULT_EXPLOSION_SPEED_FACTOR; }
// public void DEFAULT_EXPLOSION_SPEED_FACTOR(float value) { wrapperContained.DEFAULT_EXPLOSION_SPEED_FACTOR = value; }
// public static float DEFAULT_EXPLOSION_SPEED_FACTOR() { return net.minecraft.entity.vehicle.TntMinecartEntity.DEFAULT_EXPLOSION_SPEED_FACTOR; }
// public static void DEFAULT_EXPLOSION_SPEED_FACTOR(float value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.DEFAULT_EXPLOSION_SPEED_FACTOR = value; }

// public float explosionSpeedFactor() { return wrapperContained.explosionSpeedFactor; }
// public void explosionSpeedFactor(float value) { wrapperContained.explosionSpeedFactor = value; }
// public static float explosionSpeedFactor() { return net.minecraft.entity.vehicle.TntMinecartEntity.explosionSpeedFactor; }
// public static void explosionSpeedFactor(float value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.explosionSpeedFactor = value; }

// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public void damageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.damageSource = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.vehicle.TntMinecartEntity.damageSource); }
// public static void damageSource(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.damageSource = value.wrapperContained; }

// public int DEFAULT_FUSE_TICKS() { return wrapperContained.DEFAULT_FUSE_TICKS; }
// public void DEFAULT_FUSE_TICKS(int value) { wrapperContained.DEFAULT_FUSE_TICKS = value; }
// public static int DEFAULT_FUSE_TICKS() { return net.minecraft.entity.vehicle.TntMinecartEntity.DEFAULT_FUSE_TICKS; }
// public static void DEFAULT_FUSE_TICKS(int value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.DEFAULT_FUSE_TICKS = value; }

public void prime(yarnwrap.entity.damage.DamageSource source) { wrapperContained.prime(source.wrapperContained); }
// public static void prime(yarnwrap.entity.damage.DamageSource source, ) { net.minecraft.entity.vehicle.TntMinecartEntity.prime(source.wrapperContained); }
// public void explode(yarnwrap.entity.damage.DamageSource damageSource,double power) { wrapperContained.explode(damageSource.wrapperContained,power); }
// public static void explode(yarnwrap.entity.damage.DamageSource damageSource,double power, ) { net.minecraft.entity.vehicle.TntMinecartEntity.explode(damageSource.wrapperContained,power); }
public int getFuseTicks() { return wrapperContained.getFuseTicks(); }
// public static int getFuseTicks() { return net.minecraft.entity.vehicle.TntMinecartEntity.getFuseTicks(); }
public boolean isPrimed() { return wrapperContained.isPrimed(); }
// public static boolean isPrimed() { return net.minecraft.entity.vehicle.TntMinecartEntity.isPrimed(); }
// public void explode(double power) { wrapperContained.explode(power); }
// public static void explode(double power, ) { net.minecraft.entity.vehicle.TntMinecartEntity.explode(power); }
// public boolean shouldDetonate(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldDetonate(source.wrapperContained); }
// public static boolean shouldDetonate(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.vehicle.TntMinecartEntity.shouldDetonate(source.wrapperContained); }

}