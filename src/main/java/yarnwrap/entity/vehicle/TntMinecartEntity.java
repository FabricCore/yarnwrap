package yarnwrap.entity.vehicle;
public class TntMinecartEntity { public net.minecraft.entity.vehicle.TntMinecartEntity wrapperContained; public TntMinecartEntity(net.minecraft.entity.vehicle.TntMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte PRIME_TNT_STATUS() { return wrapperContained.PRIME_TNT_STATUS; }
// public void PRIME_TNT_STATUS(byte value) { wrapperContained.PRIME_TNT_STATUS = value; }
// public static byte PRIME_TNT_STATUS() { return net.minecraft.entity.vehicle.TntMinecartEntity.PRIME_TNT_STATUS; }
// public static void PRIME_TNT_STATUS(byte value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.PRIME_TNT_STATUS = value; }

// public int fuseTicks() { return wrapperContained.fuseTicks; }
// public void fuseTicks(int value) { wrapperContained.fuseTicks = value; }
// public static int fuseTicks() { return net.minecraft.entity.vehicle.TntMinecartEntity.fuseTicks; }
// public static void fuseTicks(int value, ) { net.minecraft.entity.vehicle.TntMinecartEntity.fuseTicks = value; }

public TntMinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.TntMinecartEntity(world.wrapperContained,x,y,z); }
// public void explode(double power) { wrapperContained.explode(power); }
// public static void explode(double power, ) { net.minecraft.entity.vehicle.TntMinecartEntity.explode(power); }
// public boolean shouldDetonate(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldDetonate(source.wrapperContained); }
// public static boolean shouldDetonate(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.vehicle.TntMinecartEntity.shouldDetonate(source.wrapperContained); }
public void prime() { wrapperContained.prime(); }
// public static void prime() { net.minecraft.entity.vehicle.TntMinecartEntity.prime(); }
// public void explode(yarnwrap.entity.damage.DamageSource damageSource,double power) { wrapperContained.explode(damageSource.wrapperContained,power); }
// public static void explode(yarnwrap.entity.damage.DamageSource damageSource,double power, ) { net.minecraft.entity.vehicle.TntMinecartEntity.explode(damageSource.wrapperContained,power); }
public int getFuseTicks() { return wrapperContained.getFuseTicks(); }
// public static int getFuseTicks() { return net.minecraft.entity.vehicle.TntMinecartEntity.getFuseTicks(); }
public boolean isPrimed() { return wrapperContained.isPrimed(); }
// public static boolean isPrimed() { return net.minecraft.entity.vehicle.TntMinecartEntity.isPrimed(); }

}