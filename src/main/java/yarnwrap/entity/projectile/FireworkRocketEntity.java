package yarnwrap.entity.projectile;
public class FireworkRocketEntity { public net.minecraft.entity.projectile.FireworkRocketEntity wrapperContained; public FireworkRocketEntity(net.minecraft.entity.projectile.FireworkRocketEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SHOOTER_ENTITY_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOOTER_ENTITY_ID); }
// public void SHOOTER_ENTITY_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOOTER_ENTITY_ID = value.wrapperContained; }
// public int lifeTime() { return wrapperContained.lifeTime; }
// public void lifeTime(int value) { wrapperContained.lifeTime = value; }
// public int life() { return wrapperContained.life; }
// public void life(int value) { wrapperContained.life = value; }
// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData SHOT_AT_ANGLE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOT_AT_ANGLE); }
// public void SHOT_AT_ANGLE(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOT_AT_ANGLE = value.wrapperContained; }
// public yarnwrap.entity.LivingEntity shooter() { return new yarnwrap.entity.LivingEntity(wrapperContained.shooter); }
// public void shooter(yarnwrap.entity.LivingEntity value) { wrapperContained.shooter = value.wrapperContained; }
// public void explodeAndRemove() { wrapperContained.explodeAndRemove(); }
// public boolean hasExplosionEffects() { return wrapperContained.hasExplosionEffects(); }
// public yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultStack()); }
// public java.util.List getExplosions() { return wrapperContained.getExplosions(); }
// public void explode() { wrapperContained.explode(); }
// public boolean wasShotByEntity() { return wrapperContained.wasShotByEntity(); }
public boolean wasShotAtAngle() { return wrapperContained.wasShotAtAngle(); }

}