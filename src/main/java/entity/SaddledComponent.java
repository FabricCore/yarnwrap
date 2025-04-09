package yarnwrap.entity;
public class SaddledComponent { public net.minecraft.entity.SaddledComponent wrapperContained; public SaddledComponent(net.minecraft.entity.SaddledComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean boosted() { return wrapperContained.boosted; }
// public int boostedTime() { return wrapperContained.boostedTime; }
// public yarnwrap.entity.data.DataTracker dataTracker() { return new yarnwrap.entity.data.DataTracker(wrapperContained.dataTracker); }
// public yarnwrap.entity.data.TrackedData boostTime() { return new yarnwrap.entity.data.TrackedData(wrapperContained.boostTime); }
// public yarnwrap.entity.data.TrackedData saddled() { return new yarnwrap.entity.data.TrackedData(wrapperContained.saddled); }
// public int MIN_BOOST_TIME() { return wrapperContained.MIN_BOOST_TIME; }
public void boost() { wrapperContained.boost(); }
public boolean boost(yarnwrap.util.math.random.Random random) { return wrapperContained.boost(random.wrapperContained); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
public void setSaddled(boolean saddled) { wrapperContained.setSaddled(saddled); }
public boolean isSaddled() { return wrapperContained.isSaddled(); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public void tickBoost() { wrapperContained.tickBoost(); }
public float getMovementSpeedMultiplier() { return wrapperContained.getMovementSpeedMultiplier(); }
// public int getBoostTime() { return wrapperContained.getBoostTime(); }

}