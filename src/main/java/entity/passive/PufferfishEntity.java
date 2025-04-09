package yarnwrap.entity.passive;
public class PufferfishEntity { public net.minecraft.entity.passive.PufferfishEntity wrapperContained; public PufferfishEntity(net.minecraft.entity.passive.PufferfishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int NOT_PUFFED() { return wrapperContained.NOT_PUFFED; }
public int SEMI_PUFFED() { return wrapperContained.SEMI_PUFFED; }
public int FULLY_PUFFED() { return wrapperContained.FULLY_PUFFED; }
// public yarnwrap.entity.ai.TargetPredicate BLOW_UP_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.BLOW_UP_TARGET_PREDICATE); }
// public int deflateTicks() { return wrapperContained.deflateTicks; }
// public int inflateTicks() { return wrapperContained.inflateTicks; }
// public java.util.function.Predicate BLOW_UP_FILTER() { return wrapperContained.BLOW_UP_FILTER; }
// public yarnwrap.entity.data.TrackedData PUFF_STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PUFF_STATE); }
// public float getScaleForPuffState(int puffState) { return wrapperContained.getScaleForPuffState(puffState); }
// public void sting(yarnwrap.entity.mob.MobEntity mob) { wrapperContained.sting(mob.wrapperContained); }
public int getPuffState() { return wrapperContained.getPuffState(); }
public void setPuffState(int puffState) { wrapperContained.setPuffState(puffState); }

}