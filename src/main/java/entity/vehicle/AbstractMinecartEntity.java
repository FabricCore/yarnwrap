package yarnwrap.entity.vehicle;
public class AbstractMinecartEntity { public net.minecraft.entity.vehicle.AbstractMinecartEntity wrapperContained; public AbstractMinecartEntity(net.minecraft.entity.vehicle.AbstractMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableMap DISMOUNT_FREE_Y_SPACES_NEEDED() { return wrapperContained.DISMOUNT_FREE_Y_SPACES_NEEDED; }
// public float VELOCITY_SLOWDOWN_MULTIPLIER() { return wrapperContained.VELOCITY_SLOWDOWN_MULTIPLIER; }
// public boolean onRail() { return wrapperContained.onRail; }
// public int clientInterpolationSteps() { return wrapperContained.clientInterpolationSteps; }
// public double clientX() { return wrapperContained.clientX; }
// public double clientY() { return wrapperContained.clientY; }
// public double clientZ() { return wrapperContained.clientZ; }
// public double clientYaw() { return wrapperContained.clientYaw; }
// public double clientPitch() { return wrapperContained.clientPitch; }
// public yarnwrap.util.math.Vec3d clientVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.clientVelocity); }
// public yarnwrap.util.math.Vec3d VILLAGER_PASSENGER_ATTACHMENT_POS() { return new yarnwrap.util.math.Vec3d(wrapperContained.VILLAGER_PASSENGER_ATTACHMENT_POS); }
// public boolean yawFlipped() { return wrapperContained.yawFlipped; }
// public yarnwrap.entity.data.TrackedData CUSTOM_BLOCK_OFFSET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_BLOCK_OFFSET); }
// public java.util.Map ADJACENT_RAIL_POSITIONS_BY_SHAPE() { return wrapperContained.ADJACENT_RAIL_POSITIONS_BY_SHAPE; }
// public yarnwrap.entity.data.TrackedData CUSTOM_BLOCK_PRESENT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_BLOCK_PRESENT); }
// public yarnwrap.entity.data.TrackedData CUSTOM_BLOCK_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_BLOCK_ID); }
// public boolean willHitBlockAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.willHitBlockAt(pos.wrapperContained); }
// public com.mojang.datafixers.util.Pair getAdjacentRailPositionsByShape(yarnwrap.block.enums.RailShape shape) { return wrapperContained.getAdjacentRailPositionsByShape(shape.wrapperContained); }
// public double getMaxSpeed() { return wrapperContained.getMaxSpeed(); }
public yarnwrap.util.math.Vec3d snapPositionToRailWithOffset(double x,double y,double z,double offset) { return new yarnwrap.util.math.Vec3d(wrapperContained.snapPositionToRailWithOffset(x,y,z,offset)); }
public void onActivatorRail(int x,int y,int z,boolean powered) { wrapperContained.onActivatorRail(x,y,z,powered); }
public yarnwrap.util.math.Vec3d snapPositionToRail(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.snapPositionToRail(x,y,z)); }
public boolean hasCustomBlock() { return wrapperContained.hasCustomBlock(); }
public void setCustomBlockPresent(boolean present) { wrapperContained.setCustomBlockPresent(present); }
// public void moveOffRail() { wrapperContained.moveOffRail(); }
// public void moveOnRail(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.moveOnRail(pos.wrapperContained,state.wrapperContained); }
public int getBlockOffset() { return wrapperContained.getBlockOffset(); }
public void setCustomBlockOffset(int offset) { wrapperContained.setCustomBlockOffset(offset); }
public yarnwrap.block.BlockState getDefaultContainedBlock() { return new yarnwrap.block.BlockState(wrapperContained.getDefaultContainedBlock()); }
public Object getMinecartType() { return wrapperContained.getMinecartType(); }
public yarnwrap.block.BlockState getContainedBlock() { return new yarnwrap.block.BlockState(wrapperContained.getContainedBlock()); }
// public yarnwrap.entity.vehicle.AbstractMinecartEntity create(yarnwrap.server.world.ServerWorld world,double x,double y,double z,Object type,yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(wrapperContained.create(world.wrapperContained,x,y,z,type,stack.wrapperContained,player.wrapperContained)); }
// public void applySlowdown() { wrapperContained.applySlowdown(); }
public int getDefaultBlockOffset() { return wrapperContained.getDefaultBlockOffset(); }
public void setCustomBlock(yarnwrap.block.BlockState state) { wrapperContained.setCustomBlock(state.wrapperContained); }

}