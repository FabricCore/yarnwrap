package yarnwrap.entity.vehicle;
public class TntMinecartEntity { public net.minecraft.entity.vehicle.TntMinecartEntity wrapperContained; public TntMinecartEntity(net.minecraft.entity.vehicle.TntMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte PRIME_TNT_STATUS() { return wrapperContained.PRIME_TNT_STATUS; }
// public void PRIME_TNT_STATUS(byte value) { wrapperContained.PRIME_TNT_STATUS = value; }
// public int fuseTicks() { return wrapperContained.fuseTicks; }
// public void fuseTicks(int value) { wrapperContained.fuseTicks = value; }
public TntMinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.TntMinecartEntity(world.wrapperContained,x,y,z); }
// public void explode(double power) { wrapperContained.explode(power); }
// public boolean shouldDetonate(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldDetonate(source.wrapperContained); }
public void prime() { wrapperContained.prime(); }
// public void explode(yarnwrap.entity.damage.DamageSource damageSource,double power) { wrapperContained.explode(damageSource.wrapperContained,power); }
public int getFuseTicks() { return wrapperContained.getFuseTicks(); }
public boolean isPrimed() { return wrapperContained.isPrimed(); }

}