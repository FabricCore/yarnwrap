package yarnwrap.entity.vehicle;
public class AbstractMinecartEntity { public net.minecraft.entity.vehicle.AbstractMinecartEntity wrapperContained; public AbstractMinecartEntity(net.minecraft.entity.vehicle.AbstractMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableMap DISMOUNT_FREE_Y_SPACES_NEEDED() { return wrapperContained.DISMOUNT_FREE_Y_SPACES_NEEDED; }
// public void DISMOUNT_FREE_Y_SPACES_NEEDED(com.google.common.collect.ImmutableMap value) { wrapperContained.DISMOUNT_FREE_Y_SPACES_NEEDED = value; }
// public float VELOCITY_SLOWDOWN_MULTIPLIER() { return wrapperContained.VELOCITY_SLOWDOWN_MULTIPLIER; }
// public void VELOCITY_SLOWDOWN_MULTIPLIER(float value) { wrapperContained.VELOCITY_SLOWDOWN_MULTIPLIER = value; }
// public boolean onRail() { return wrapperContained.onRail; }
// public void onRail(boolean value) { wrapperContained.onRail = value; }
// public int clientInterpolationSteps() { return wrapperContained.clientInterpolationSteps; }
// public void clientInterpolationSteps(int value) { wrapperContained.clientInterpolationSteps = value; }
// public double clientX() { return wrapperContained.clientX; }
// public void clientX(double value) { wrapperContained.clientX = value; }
// public double clientY() { return wrapperContained.clientY; }
// public void clientY(double value) { wrapperContained.clientY = value; }
// public double clientZ() { return wrapperContained.clientZ; }
// public void clientZ(double value) { wrapperContained.clientZ = value; }
// public double clientYaw() { return wrapperContained.clientYaw; }
// public void clientYaw(double value) { wrapperContained.clientYaw = value; }
// public double clientPitch() { return wrapperContained.clientPitch; }
// public void clientPitch(double value) { wrapperContained.clientPitch = value; }
// public yarnwrap.util.math.Vec3d clientVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.clientVelocity); }
// public void clientVelocity(yarnwrap.util.math.Vec3d value) { wrapperContained.clientVelocity = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d VILLAGER_PASSENGER_ATTACHMENT_POS() { return new yarnwrap.util.math.Vec3d(wrapperContained.VILLAGER_PASSENGER_ATTACHMENT_POS); }
// public void VILLAGER_PASSENGER_ATTACHMENT_POS(yarnwrap.util.math.Vec3d value) { wrapperContained.VILLAGER_PASSENGER_ATTACHMENT_POS = value.wrapperContained; }
// public boolean yawFlipped() { return wrapperContained.yawFlipped; }
// public void yawFlipped(boolean value) { wrapperContained.yawFlipped = value; }
// public yarnwrap.entity.data.TrackedData CUSTOM_BLOCK_OFFSET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_BLOCK_OFFSET); }
// public void CUSTOM_BLOCK_OFFSET(yarnwrap.entity.data.TrackedData value) { wrapperContained.CUSTOM_BLOCK_OFFSET = value.wrapperContained; }
// public java.util.Map ADJACENT_RAIL_POSITIONS_BY_SHAPE() { return wrapperContained.ADJACENT_RAIL_POSITIONS_BY_SHAPE; }
// public void ADJACENT_RAIL_POSITIONS_BY_SHAPE(java.util.Map value) { wrapperContained.ADJACENT_RAIL_POSITIONS_BY_SHAPE = value; }
// public yarnwrap.entity.data.TrackedData CUSTOM_BLOCK_PRESENT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_BLOCK_PRESENT); }
// public void CUSTOM_BLOCK_PRESENT(yarnwrap.entity.data.TrackedData value) { wrapperContained.CUSTOM_BLOCK_PRESENT = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData CUSTOM_BLOCK_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_BLOCK_ID); }
// public void CUSTOM_BLOCK_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.CUSTOM_BLOCK_ID = value.wrapperContained; }
// public AbstractMinecartEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.AbstractMinecartEntity(type.wrapperContained,world.wrapperContained,x,y,z); }
// public boolean willHitBlockAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.willHitBlockAt(pos.wrapperContained); }
// public com.mojang.datafixers.util.Pair getAdjacentRailPositionsByShape(yarnwrap.block.enums.RailShape shape) { return wrapperContained.getAdjacentRailPositionsByShape(shape.wrapperContained); }
// public void method_22865(java.util.EnumMap map) { wrapperContained.method_22865(map); }
// public yarnwrap.util.shape.VoxelShape method_30340(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_30340(pos.wrapperContained)); }
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