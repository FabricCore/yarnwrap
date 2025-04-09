package yarnwrap.entity.vehicle;
public class VehicleEntity { public net.minecraft.entity.vehicle.VehicleEntity wrapperContained; public VehicleEntity(net.minecraft.entity.vehicle.VehicleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DAMAGE_WOBBLE_TICKS); }
// public yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_SIDE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DAMAGE_WOBBLE_SIDE); }
// public yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_STRENGTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DAMAGE_WOBBLE_STRENGTH); }
public float getDamageWobbleStrength() { return wrapperContained.getDamageWobbleStrength(); }
public int getDamageWobbleTicks() { return wrapperContained.getDamageWobbleTicks(); }
public int getDamageWobbleSide() { return wrapperContained.getDamageWobbleSide(); }
public void setDamageWobbleStrength(float damageWobbleStrength) { wrapperContained.setDamageWobbleStrength(damageWobbleStrength); }
public void killAndDropItem(yarnwrap.item.Item selfAsItem) { wrapperContained.killAndDropItem(selfAsItem.wrapperContained); }
public void setDamageWobbleTicks(int damageWobbleTicks) { wrapperContained.setDamageWobbleTicks(damageWobbleTicks); }
public void setDamageWobbleSide(int damageWobbleSide) { wrapperContained.setDamageWobbleSide(damageWobbleSide); }
// public boolean shouldAlwaysKill(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldAlwaysKill(source.wrapperContained); }
// public void killAndDropSelf(yarnwrap.entity.damage.DamageSource source) { wrapperContained.killAndDropSelf(source.wrapperContained); }
// public yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(wrapperContained.asItem()); }

}