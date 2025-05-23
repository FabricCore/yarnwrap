package yarnwrap.entity.mob;
public class PhantomEntity { public net.minecraft.entity.mob.PhantomEntity wrapperContained; public PhantomEntity(net.minecraft.entity.mob.PhantomEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos circlingCenter() { return new yarnwrap.util.math.BlockPos(wrapperContained.circlingCenter); }
// public void circlingCenter(yarnwrap.util.math.BlockPos value) { wrapperContained.circlingCenter = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos circlingCenter() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.PhantomEntity.circlingCenter); }
// public static void circlingCenter(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.mob.PhantomEntity.circlingCenter = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData SIZE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SIZE); }
// public void SIZE(yarnwrap.entity.data.TrackedData value) { wrapperContained.SIZE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SIZE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.PhantomEntity.SIZE); }
// public static void SIZE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.PhantomEntity.SIZE = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d targetPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.targetPosition); }
// public void targetPosition(yarnwrap.util.math.Vec3d value) { wrapperContained.targetPosition = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d targetPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.mob.PhantomEntity.targetPosition); }
// public static void targetPosition(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.mob.PhantomEntity.targetPosition = value.wrapperContained; }

// public Object movementType() { return wrapperContained.movementType; }
// // public void movementType(Object value) { wrapperContained.movementType = value; }
// // public static Object movementType() { return net.minecraft.entity.mob.PhantomEntity.movementType; }
// // public static void movementType(Object value, ) { net.minecraft.entity.mob.PhantomEntity.movementType = value; }

// public int WING_FLAP_TICKS() { return wrapperContained.WING_FLAP_TICKS; }
// public void WING_FLAP_TICKS(int value) { wrapperContained.WING_FLAP_TICKS = value; }
public static int WING_FLAP_TICKS() { return net.minecraft.entity.mob.PhantomEntity.WING_FLAP_TICKS; }
// public static void WING_FLAP_TICKS(int value, ) { net.minecraft.entity.mob.PhantomEntity.WING_FLAP_TICKS = value; }

public int getPhantomSize() { return wrapperContained.getPhantomSize(); }
// public static int getPhantomSize() { return net.minecraft.entity.mob.PhantomEntity.getPhantomSize(); }
public void setPhantomSize(int size) { wrapperContained.setPhantomSize(size); }
// public static void setPhantomSize(int size, ) { net.minecraft.entity.mob.PhantomEntity.setPhantomSize(size); }
// public void onSizeChanged() { wrapperContained.onSizeChanged(); }
// public static void onSizeChanged() { net.minecraft.entity.mob.PhantomEntity.onSizeChanged(); }
public int getWingFlapTickOffset() { return wrapperContained.getWingFlapTickOffset(); }
// public static int getWingFlapTickOffset() { return net.minecraft.entity.mob.PhantomEntity.getWingFlapTickOffset(); }
// public boolean testTargetPredicate(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity target,yarnwrap.entity.ai.TargetPredicate predicate) { return wrapperContained.testTargetPredicate(world.wrapperContained,target.wrapperContained,predicate.wrapperContained); }
// public static boolean testTargetPredicate(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity target,yarnwrap.entity.ai.TargetPredicate predicate, ) { return net.minecraft.entity.mob.PhantomEntity.testTargetPredicate(world.wrapperContained,target.wrapperContained,predicate.wrapperContained); }

}