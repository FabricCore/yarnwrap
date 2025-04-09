package yarnwrap.entity.mob;
public class PhantomEntity { public net.minecraft.entity.mob.PhantomEntity wrapperContained; public PhantomEntity(net.minecraft.entity.mob.PhantomEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int WING_FLAP_TICKS() { return wrapperContained.WING_FLAP_TICKS; }
// public yarnwrap.util.math.BlockPos circlingCenter() { return new yarnwrap.util.math.BlockPos(wrapperContained.circlingCenter); }
// public yarnwrap.entity.data.TrackedData SIZE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SIZE); }
// public yarnwrap.util.math.Vec3d targetPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.targetPosition); }
// public Object movementType() { return wrapperContained.movementType; }
public int getWingFlapTickOffset() { return wrapperContained.getWingFlapTickOffset(); }
public int getPhantomSize() { return wrapperContained.getPhantomSize(); }
public void setPhantomSize(int size) { wrapperContained.setPhantomSize(size); }
// public void onSizeChanged() { wrapperContained.onSizeChanged(); }

}