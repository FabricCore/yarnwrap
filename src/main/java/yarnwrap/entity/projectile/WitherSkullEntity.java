package yarnwrap.entity.projectile;
public class WitherSkullEntity { public net.minecraft.entity.projectile.WitherSkullEntity wrapperContained; public WitherSkullEntity(net.minecraft.entity.projectile.WitherSkullEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGED); }
// public void CHARGED(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHARGED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CHARGED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.WitherSkullEntity.CHARGED); }
// public static void CHARGED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.WitherSkullEntity.CHARGED = value.wrapperContained; }

// public boolean DEFAULT_DANGEROUS() { return wrapperContained.DEFAULT_DANGEROUS; }
// public void DEFAULT_DANGEROUS(boolean value) { wrapperContained.DEFAULT_DANGEROUS = value; }
// public static boolean DEFAULT_DANGEROUS() { return net.minecraft.entity.projectile.WitherSkullEntity.DEFAULT_DANGEROUS; }
// public static void DEFAULT_DANGEROUS(boolean value, ) { net.minecraft.entity.projectile.WitherSkullEntity.DEFAULT_DANGEROUS = value; }

public WitherSkullEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.entity.projectile.WitherSkullEntity(world.wrapperContained,owner.wrapperContained,velocity.wrapperContained); }
public void setCharged(boolean charged) { wrapperContained.setCharged(charged); }
// public static void setCharged(boolean charged, ) { net.minecraft.entity.projectile.WitherSkullEntity.setCharged(charged); }
public boolean isCharged() { return wrapperContained.isCharged(); }
// public static boolean isCharged() { return net.minecraft.entity.projectile.WitherSkullEntity.isCharged(); }

}