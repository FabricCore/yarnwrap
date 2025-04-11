package yarnwrap.entity.passive;
public class PufferfishEntity { public net.minecraft.entity.passive.PufferfishEntity wrapperContained; public PufferfishEntity(net.minecraft.entity.passive.PufferfishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int NOT_PUFFED() { return wrapperContained.NOT_PUFFED; }
// public void NOT_PUFFED(int value) { wrapperContained.NOT_PUFFED = value; }
public int SEMI_PUFFED() { return wrapperContained.SEMI_PUFFED; }
// public void SEMI_PUFFED(int value) { wrapperContained.SEMI_PUFFED = value; }
public int FULLY_PUFFED() { return wrapperContained.FULLY_PUFFED; }
// public void FULLY_PUFFED(int value) { wrapperContained.FULLY_PUFFED = value; }
// public yarnwrap.entity.ai.TargetPredicate BLOW_UP_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.BLOW_UP_TARGET_PREDICATE); }
// public void BLOW_UP_TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.BLOW_UP_TARGET_PREDICATE = value.wrapperContained; }
// public int deflateTicks() { return wrapperContained.deflateTicks; }
// public void deflateTicks(int value) { wrapperContained.deflateTicks = value; }
// public int inflateTicks() { return wrapperContained.inflateTicks; }
// public void inflateTicks(int value) { wrapperContained.inflateTicks = value; }
// public java.util.function.Predicate BLOW_UP_FILTER() { return wrapperContained.BLOW_UP_FILTER; }
// public void BLOW_UP_FILTER(java.util.function.Predicate value) { wrapperContained.BLOW_UP_FILTER = value; }
// public yarnwrap.entity.data.TrackedData PUFF_STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PUFF_STATE); }
// public void PUFF_STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.PUFF_STATE = value.wrapperContained; }
// public float getScaleForPuffState(int puffState) { return wrapperContained.getScaleForPuffState(puffState); }
// public void sting(yarnwrap.entity.mob.MobEntity mob) { wrapperContained.sting(mob.wrapperContained); }
public int getPuffState() { return wrapperContained.getPuffState(); }
public void setPuffState(int puffState) { wrapperContained.setPuffState(puffState); }

}