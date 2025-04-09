package yarnwrap.entity.projectile;
public class FireworkRocketEntity { public net.minecraft.entity.projectile.FireworkRocketEntity wrapperContained; public FireworkRocketEntity(net.minecraft.entity.projectile.FireworkRocketEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SHOOTER_ENTITY_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOOTER_ENTITY_ID); }
// public int lifeTime() { return wrapperContained.lifeTime; }
// public int life() { return wrapperContained.life; }
// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public yarnwrap.entity.data.TrackedData SHOT_AT_ANGLE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOT_AT_ANGLE); }
// public yarnwrap.entity.LivingEntity shooter() { return new yarnwrap.entity.LivingEntity(wrapperContained.shooter); }
// public void explodeAndRemove() { wrapperContained.explodeAndRemove(); }
// public boolean hasExplosionEffects() { return wrapperContained.hasExplosionEffects(); }
// public yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultStack()); }
// public java.util.List getExplosions() { return wrapperContained.getExplosions(); }
// public void explode() { wrapperContained.explode(); }
// public boolean wasShotByEntity() { return wrapperContained.wasShotByEntity(); }
public boolean wasShotAtAngle() { return wrapperContained.wasShotAtAngle(); }

}