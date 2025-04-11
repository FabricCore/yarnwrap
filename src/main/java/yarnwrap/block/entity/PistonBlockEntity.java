package yarnwrap.block.entity;
public class PistonBlockEntity { public net.minecraft.block.entity.PistonBlockEntity wrapperContained; public PistonBlockEntity(net.minecraft.block.entity.PistonBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public boolean source() { return wrapperContained.source; }
// public void source(boolean value) { wrapperContained.source = value; }
// public boolean extending() { return wrapperContained.extending; }
// public void extending(boolean value) { wrapperContained.extending = value; }
// public yarnwrap.block.BlockState pushedBlock() { return new yarnwrap.block.BlockState(wrapperContained.pushedBlock); }
// public void pushedBlock(yarnwrap.block.BlockState value) { wrapperContained.pushedBlock = value.wrapperContained; }
// public java.lang.ThreadLocal entityMovementDirection() { return wrapperContained.entityMovementDirection; }
// public void entityMovementDirection(java.lang.ThreadLocal value) { wrapperContained.entityMovementDirection = value; }
// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public long savedWorldTime() { return wrapperContained.savedWorldTime; }
// public void savedWorldTime(long value) { wrapperContained.savedWorldTime = value; }
public PistonBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.PistonBlockEntity(pos.wrapperContained,state.wrapperContained); }
public PistonBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.BlockState pushedBlock,yarnwrap.util.math.Direction facing,boolean extending,boolean source) { this.wrapperContained = new net.minecraft.block.entity.PistonBlockEntity(pos.wrapperContained,state.wrapperContained,pushedBlock.wrapperContained,facing.wrapperContained,extending,source); }
public float getRenderOffsetX(float tickDelta) { return wrapperContained.getRenderOffsetX(tickDelta); }
public yarnwrap.block.BlockState getPushedBlock() { return new yarnwrap.block.BlockState(wrapperContained.getPushedBlock()); }
// public yarnwrap.block.BlockState getHeadBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getHeadBlockState()); }
// public double getIntersectionSize() { return wrapperContained.getIntersectionSize(); }
public yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getFacing()); }
public float getProgress(float tickDelta) { return wrapperContained.getProgress(tickDelta); }
// public yarnwrap.util.math.Box offsetHeadBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Box box,yarnwrap.block.entity.PistonBlockEntity blockEntity) { return new yarnwrap.util.math.Box(wrapperContained.offsetHeadBox(pos.wrapperContained,box.wrapperContained,blockEntity.wrapperContained)); }
public boolean isExtending() { return wrapperContained.isExtending(); }
// public void pushEntities(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float blockEntity) { wrapperContained.pushEntities(world.wrapperContained,pos.wrapperContained,blockEntity); }
// public float getAmountExtended(float progress) { return wrapperContained.getAmountExtended(progress); }
public yarnwrap.util.math.Direction getMovementDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getMovementDirection()); }
public float getRenderOffsetZ(float tickDelta) { return wrapperContained.getRenderOffsetZ(tickDelta); }
public long getSavedWorldTime() { return wrapperContained.getSavedWorldTime(); }
public float getRenderOffsetY(float tickDelta) { return wrapperContained.getRenderOffsetY(tickDelta); }
public yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCollisionShape(world.wrapperContained,pos.wrapperContained)); }
public void finish() { wrapperContained.finish(); }
// public void push(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.util.math.Direction direction,double amount) { wrapperContained.push(pos.wrapperContained,entity.wrapperContained,direction.wrapperContained,amount); }
public boolean isSource() { return wrapperContained.isSource(); }
// public boolean isPushingHoneyBlock() { return wrapperContained.isPushingHoneyBlock(); }
// public boolean canMoveEntity(yarnwrap.util.math.Box box,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canMoveEntity(box.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public void moveEntity(yarnwrap.util.math.Direction direction,yarnwrap.entity.Entity entity,double distance,yarnwrap.util.math.Direction movementDirection) { wrapperContained.moveEntity(direction.wrapperContained,entity.wrapperContained,distance,movementDirection.wrapperContained); }
// public boolean method_23673(yarnwrap.util.math.Box entity) { return wrapperContained.method_23673(entity.wrapperContained); }
// public void moveEntitiesInHoneyBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float blockEntity) { wrapperContained.moveEntitiesInHoneyBlock(world.wrapperContained,pos.wrapperContained,blockEntity); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.PistonBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}