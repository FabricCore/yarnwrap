package yarnwrap.entity.vehicle;
public class VehicleEntity { public net.minecraft.entity.vehicle.VehicleEntity wrapperContained; public VehicleEntity(net.minecraft.entity.vehicle.VehicleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DAMAGE_WOBBLE_TICKS); }
// public void DAMAGE_WOBBLE_TICKS(yarnwrap.entity.data.TrackedData value) { wrapperContained.DAMAGE_WOBBLE_TICKS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_TICKS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.vehicle.VehicleEntity.DAMAGE_WOBBLE_TICKS); }
// public static void DAMAGE_WOBBLE_TICKS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.vehicle.VehicleEntity.DAMAGE_WOBBLE_TICKS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_SIDE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DAMAGE_WOBBLE_SIDE); }
// public void DAMAGE_WOBBLE_SIDE(yarnwrap.entity.data.TrackedData value) { wrapperContained.DAMAGE_WOBBLE_SIDE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_SIDE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.vehicle.VehicleEntity.DAMAGE_WOBBLE_SIDE); }
// public static void DAMAGE_WOBBLE_SIDE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.vehicle.VehicleEntity.DAMAGE_WOBBLE_SIDE = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_STRENGTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DAMAGE_WOBBLE_STRENGTH); }
// public void DAMAGE_WOBBLE_STRENGTH(yarnwrap.entity.data.TrackedData value) { wrapperContained.DAMAGE_WOBBLE_STRENGTH = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData DAMAGE_WOBBLE_STRENGTH() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.vehicle.VehicleEntity.DAMAGE_WOBBLE_STRENGTH); }
// public static void DAMAGE_WOBBLE_STRENGTH(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.vehicle.VehicleEntity.DAMAGE_WOBBLE_STRENGTH = value.wrapperContained; }

// public void killAndDropSelf(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.killAndDropSelf(world.wrapperContained,damageSource.wrapperContained); }
// public static void killAndDropSelf(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.vehicle.VehicleEntity.killAndDropSelf(world.wrapperContained,damageSource.wrapperContained); }
// public yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(wrapperContained.asItem()); }
// public static yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(net.minecraft.entity.vehicle.VehicleEntity.asItem()); }
public float getDamageWobbleStrength() { return wrapperContained.getDamageWobbleStrength(); }
// public static float getDamageWobbleStrength() { return net.minecraft.entity.vehicle.VehicleEntity.getDamageWobbleStrength(); }
public int getDamageWobbleTicks() { return wrapperContained.getDamageWobbleTicks(); }
// public static int getDamageWobbleTicks() { return net.minecraft.entity.vehicle.VehicleEntity.getDamageWobbleTicks(); }
public int getDamageWobbleSide() { return wrapperContained.getDamageWobbleSide(); }
// public static int getDamageWobbleSide() { return net.minecraft.entity.vehicle.VehicleEntity.getDamageWobbleSide(); }
public void setDamageWobbleStrength(float damageWobbleStrength) { wrapperContained.setDamageWobbleStrength(damageWobbleStrength); }
// public static void setDamageWobbleStrength(float damageWobbleStrength, ) { net.minecraft.entity.vehicle.VehicleEntity.setDamageWobbleStrength(damageWobbleStrength); }
public void killAndDropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.item.Item item) { wrapperContained.killAndDropItem(world.wrapperContained,item.wrapperContained); }
// public static void killAndDropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.item.Item item, ) { net.minecraft.entity.vehicle.VehicleEntity.killAndDropItem(world.wrapperContained,item.wrapperContained); }
public void setDamageWobbleTicks(int damageWobbleTicks) { wrapperContained.setDamageWobbleTicks(damageWobbleTicks); }
// public static void setDamageWobbleTicks(int damageWobbleTicks, ) { net.minecraft.entity.vehicle.VehicleEntity.setDamageWobbleTicks(damageWobbleTicks); }
public void setDamageWobbleSide(int damageWobbleSide) { wrapperContained.setDamageWobbleSide(damageWobbleSide); }
// public static void setDamageWobbleSide(int damageWobbleSide, ) { net.minecraft.entity.vehicle.VehicleEntity.setDamageWobbleSide(damageWobbleSide); }
// public boolean shouldAlwaysKill(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldAlwaysKill(source.wrapperContained); }
// public static boolean shouldAlwaysKill(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.vehicle.VehicleEntity.shouldAlwaysKill(source.wrapperContained); }

}