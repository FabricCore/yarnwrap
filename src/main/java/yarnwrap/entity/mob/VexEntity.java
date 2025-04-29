package yarnwrap.entity.mob;
public class VexEntity { public net.minecraft.entity.mob.VexEntity wrapperContained; public VexEntity(net.minecraft.entity.mob.VexEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHARGING_FLAG() { return wrapperContained.CHARGING_FLAG; }
// public void CHARGING_FLAG(int value) { wrapperContained.CHARGING_FLAG = value; }
// public static int CHARGING_FLAG() { return net.minecraft.entity.mob.VexEntity.CHARGING_FLAG; }
// public static void CHARGING_FLAG(int value, ) { net.minecraft.entity.mob.VexEntity.CHARGING_FLAG = value; }

// public yarnwrap.util.math.BlockPos bounds() { return new yarnwrap.util.math.BlockPos(wrapperContained.bounds); }
// public void bounds(yarnwrap.util.math.BlockPos value) { wrapperContained.bounds = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos bounds() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.VexEntity.bounds); }
// public static void bounds(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.mob.VexEntity.bounds = value.wrapperContained; }

// public int lifeTicks() { return wrapperContained.lifeTicks; }
// public void lifeTicks(int value) { wrapperContained.lifeTicks = value; }
// public static int lifeTicks() { return net.minecraft.entity.mob.VexEntity.lifeTicks; }
// public static void lifeTicks(int value, ) { net.minecraft.entity.mob.VexEntity.lifeTicks = value; }

// public boolean alive() { return wrapperContained.alive; }
// public void alive(boolean value) { wrapperContained.alive = value; }
// public static boolean alive() { return net.minecraft.entity.mob.VexEntity.alive; }
// public static void alive(boolean value, ) { net.minecraft.entity.mob.VexEntity.alive = value; }

// public yarnwrap.entity.data.TrackedData VEX_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VEX_FLAGS); }
// public void VEX_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.VEX_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VEX_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.VexEntity.VEX_FLAGS); }
// public static void VEX_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.VexEntity.VEX_FLAGS = value.wrapperContained; }

// public yarnwrap.entity.mob.MobEntity owner() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.mob.MobEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity owner() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.mob.VexEntity.owner); }
// public static void owner(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.mob.VexEntity.owner = value.wrapperContained; }

// public Object createVexAttributes() { return wrapperContained.createVexAttributes(); }
public static Object createVexAttributes() { return net.minecraft.entity.mob.VexEntity.createVexAttributes(); }
public boolean isCharging() { return wrapperContained.isCharging(); }
// public static boolean isCharging() { return net.minecraft.entity.mob.VexEntity.isCharging(); }
public void setCharging(boolean charging) { wrapperContained.setCharging(charging); }
// public static void setCharging(boolean charging, ) { net.minecraft.entity.mob.VexEntity.setCharging(charging); }
public void setOwner(yarnwrap.entity.mob.MobEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
// public static void setOwner(yarnwrap.entity.mob.MobEntity owner, ) { net.minecraft.entity.mob.VexEntity.setOwner(owner.wrapperContained); }
public void setLifeTicks(int lifeTicks) { wrapperContained.setLifeTicks(lifeTicks); }
// public static void setLifeTicks(int lifeTicks, ) { net.minecraft.entity.mob.VexEntity.setLifeTicks(lifeTicks); }
// public boolean areFlagsSet(int mask) { return wrapperContained.areFlagsSet(mask); }
// public static boolean areFlagsSet(int mask, ) { return net.minecraft.entity.mob.VexEntity.areFlagsSet(mask); }
public yarnwrap.util.math.BlockPos getBounds() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBounds()); }
// public static yarnwrap.util.math.BlockPos getBounds() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.VexEntity.getBounds()); }
public void setBounds(yarnwrap.util.math.BlockPos bounds) { wrapperContained.setBounds(bounds.wrapperContained); }
// public static void setBounds(yarnwrap.util.math.BlockPos bounds, ) { net.minecraft.entity.mob.VexEntity.setBounds(bounds.wrapperContained); }
// public void setVexFlag(int mask,boolean value) { wrapperContained.setVexFlag(mask,value); }
// public static void setVexFlag(int mask,boolean value, ) { net.minecraft.entity.mob.VexEntity.setVexFlag(mask,value); }

}