package yarnwrap.entity.projectile;
public class BreezeWindChargeEntity { public net.minecraft.entity.projectile.BreezeWindChargeEntity wrapperContained; public BreezeWindChargeEntity(net.minecraft.entity.projectile.BreezeWindChargeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float EXPLOSION_POWER() { return wrapperContained.EXPLOSION_POWER; }
// public void EXPLOSION_POWER(float value) { wrapperContained.EXPLOSION_POWER = value; }
// public static float EXPLOSION_POWER() { return net.minecraft.entity.projectile.BreezeWindChargeEntity.EXPLOSION_POWER; }
// public static void EXPLOSION_POWER(float value, ) { net.minecraft.entity.projectile.BreezeWindChargeEntity.EXPLOSION_POWER = value; }

public BreezeWindChargeEntity(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.BreezeWindChargeEntity(breeze.wrapperContained,world.wrapperContained); }

}