package yarnwrap.entity.mob;
public class VexEntity { public net.minecraft.entity.mob.VexEntity wrapperContained; public VexEntity(net.minecraft.entity.mob.VexEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHARGING_FLAG() { return wrapperContained.CHARGING_FLAG; }
// public yarnwrap.util.math.BlockPos bounds() { return new yarnwrap.util.math.BlockPos(wrapperContained.bounds); }
// public int lifeTicks() { return wrapperContained.lifeTicks; }
// public boolean alive() { return wrapperContained.alive; }
// public yarnwrap.entity.data.TrackedData VEX_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VEX_FLAGS); }
// public yarnwrap.entity.mob.MobEntity owner() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.owner); }
public Object createVexAttributes() { return wrapperContained.createVexAttributes(); }
public boolean isCharging() { return wrapperContained.isCharging(); }
public void setCharging(boolean charging) { wrapperContained.setCharging(charging); }
public void setOwner(yarnwrap.entity.mob.MobEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
public void setLifeTicks(int lifeTicks) { wrapperContained.setLifeTicks(lifeTicks); }
// public boolean areFlagsSet(int mask) { return wrapperContained.areFlagsSet(mask); }
public yarnwrap.util.math.BlockPos getBounds() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBounds()); }
public void setBounds(yarnwrap.util.math.BlockPos bounds) { wrapperContained.setBounds(bounds.wrapperContained); }
// public void setVexFlag(int mask,boolean value) { wrapperContained.setVexFlag(mask,value); }

}