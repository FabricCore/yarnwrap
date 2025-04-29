package yarnwrap.entity.passive;
public class PufferfishEntity { public net.minecraft.entity.passive.PufferfishEntity wrapperContained; public PufferfishEntity(net.minecraft.entity.passive.PufferfishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int NOT_PUFFED() { return wrapperContained.NOT_PUFFED; }
// public void NOT_PUFFED(int value) { wrapperContained.NOT_PUFFED = value; }
public static int NOT_PUFFED() { return net.minecraft.entity.passive.PufferfishEntity.NOT_PUFFED; }
// public static void NOT_PUFFED(int value, ) { net.minecraft.entity.passive.PufferfishEntity.NOT_PUFFED = value; }

// public int SEMI_PUFFED() { return wrapperContained.SEMI_PUFFED; }
// public void SEMI_PUFFED(int value) { wrapperContained.SEMI_PUFFED = value; }
public static int SEMI_PUFFED() { return net.minecraft.entity.passive.PufferfishEntity.SEMI_PUFFED; }
// public static void SEMI_PUFFED(int value, ) { net.minecraft.entity.passive.PufferfishEntity.SEMI_PUFFED = value; }

// public int FULLY_PUFFED() { return wrapperContained.FULLY_PUFFED; }
// public void FULLY_PUFFED(int value) { wrapperContained.FULLY_PUFFED = value; }
public static int FULLY_PUFFED() { return net.minecraft.entity.passive.PufferfishEntity.FULLY_PUFFED; }
// public static void FULLY_PUFFED(int value, ) { net.minecraft.entity.passive.PufferfishEntity.FULLY_PUFFED = value; }

// public yarnwrap.entity.ai.TargetPredicate BLOW_UP_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.BLOW_UP_TARGET_PREDICATE); }
// public void BLOW_UP_TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.BLOW_UP_TARGET_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate BLOW_UP_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.passive.PufferfishEntity.BLOW_UP_TARGET_PREDICATE); }
// public static void BLOW_UP_TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.passive.PufferfishEntity.BLOW_UP_TARGET_PREDICATE = value.wrapperContained; }

// public int deflateTicks() { return wrapperContained.deflateTicks; }
// public void deflateTicks(int value) { wrapperContained.deflateTicks = value; }
// public static int deflateTicks() { return net.minecraft.entity.passive.PufferfishEntity.deflateTicks; }
// public static void deflateTicks(int value, ) { net.minecraft.entity.passive.PufferfishEntity.deflateTicks = value; }

// public int inflateTicks() { return wrapperContained.inflateTicks; }
// public void inflateTicks(int value) { wrapperContained.inflateTicks = value; }
// public static int inflateTicks() { return net.minecraft.entity.passive.PufferfishEntity.inflateTicks; }
// public static void inflateTicks(int value, ) { net.minecraft.entity.passive.PufferfishEntity.inflateTicks = value; }

// public java.util.function.Predicate BLOW_UP_FILTER() { return wrapperContained.BLOW_UP_FILTER; }
// public void BLOW_UP_FILTER(java.util.function.Predicate value) { wrapperContained.BLOW_UP_FILTER = value; }
// public static java.util.function.Predicate BLOW_UP_FILTER() { return net.minecraft.entity.passive.PufferfishEntity.BLOW_UP_FILTER; }
// public static void BLOW_UP_FILTER(java.util.function.Predicate value, ) { net.minecraft.entity.passive.PufferfishEntity.BLOW_UP_FILTER = value; }

// public yarnwrap.entity.data.TrackedData PUFF_STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PUFF_STATE); }
// public void PUFF_STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.PUFF_STATE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData PUFF_STATE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.PufferfishEntity.PUFF_STATE); }
// public static void PUFF_STATE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.PufferfishEntity.PUFF_STATE = value.wrapperContained; }

// public boolean method_36550(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.method_36550(entity.wrapperContained); }
// public static boolean method_36550(yarnwrap.entity.mob.MobEntity entity, ) { return net.minecraft.entity.passive.PufferfishEntity.method_36550(entity.wrapperContained); }
// public boolean method_6591(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_6591(entity.wrapperContained); }
// public static boolean method_6591(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.PufferfishEntity.method_6591(entity.wrapperContained); }
// public float getScaleForPuffState(int puffState) { return wrapperContained.getScaleForPuffState(puffState); }
// public static float getScaleForPuffState(int puffState, ) { return net.minecraft.entity.passive.PufferfishEntity.getScaleForPuffState(puffState); }
// public void sting(yarnwrap.entity.mob.MobEntity mob) { wrapperContained.sting(mob.wrapperContained); }
// public static void sting(yarnwrap.entity.mob.MobEntity mob, ) { net.minecraft.entity.passive.PufferfishEntity.sting(mob.wrapperContained); }
public int getPuffState() { return wrapperContained.getPuffState(); }
// public static int getPuffState() { return net.minecraft.entity.passive.PufferfishEntity.getPuffState(); }
public void setPuffState(int puffState) { wrapperContained.setPuffState(puffState); }
// public static void setPuffState(int puffState, ) { net.minecraft.entity.passive.PufferfishEntity.setPuffState(puffState); }

}