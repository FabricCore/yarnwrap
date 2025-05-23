package yarnwrap.block.entity;
public class PistonBlockEntity { public net.minecraft.block.entity.PistonBlockEntity wrapperContained; public PistonBlockEntity(net.minecraft.block.entity.PistonBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public static yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.PistonBlockEntity.facing); }
// public static void facing(yarnwrap.util.math.Direction value, ) { net.minecraft.block.entity.PistonBlockEntity.facing = value.wrapperContained; }

// public boolean source() { return wrapperContained.source; }
// public void source(boolean value) { wrapperContained.source = value; }
// public static boolean source() { return net.minecraft.block.entity.PistonBlockEntity.source; }
// public static void source(boolean value, ) { net.minecraft.block.entity.PistonBlockEntity.source = value; }

// public boolean extending() { return wrapperContained.extending; }
// public void extending(boolean value) { wrapperContained.extending = value; }
// public static boolean extending() { return net.minecraft.block.entity.PistonBlockEntity.extending; }
// public static void extending(boolean value, ) { net.minecraft.block.entity.PistonBlockEntity.extending = value; }

// public yarnwrap.block.BlockState pushedBlockState() { return new yarnwrap.block.BlockState(wrapperContained.pushedBlockState); }
// public void pushedBlockState(yarnwrap.block.BlockState value) { wrapperContained.pushedBlockState = value.wrapperContained; }
// public static yarnwrap.block.BlockState pushedBlockState() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.PistonBlockEntity.pushedBlockState); }
// public static void pushedBlockState(yarnwrap.block.BlockState value, ) { net.minecraft.block.entity.PistonBlockEntity.pushedBlockState = value.wrapperContained; }

// public java.lang.ThreadLocal ENTITY_MOVEMENT_DIRECTION() { return wrapperContained.ENTITY_MOVEMENT_DIRECTION; }
// public void ENTITY_MOVEMENT_DIRECTION(java.lang.ThreadLocal value) { wrapperContained.ENTITY_MOVEMENT_DIRECTION = value; }
// public static java.lang.ThreadLocal ENTITY_MOVEMENT_DIRECTION() { return net.minecraft.block.entity.PistonBlockEntity.ENTITY_MOVEMENT_DIRECTION; }
// public static void ENTITY_MOVEMENT_DIRECTION(java.lang.ThreadLocal value, ) { net.minecraft.block.entity.PistonBlockEntity.ENTITY_MOVEMENT_DIRECTION = value; }

// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
// public static float lastProgress() { return net.minecraft.block.entity.PistonBlockEntity.lastProgress; }
// public static void lastProgress(float value, ) { net.minecraft.block.entity.PistonBlockEntity.lastProgress = value; }

// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public static float progress() { return net.minecraft.block.entity.PistonBlockEntity.progress; }
// public static void progress(float value, ) { net.minecraft.block.entity.PistonBlockEntity.progress = value; }

// public long savedWorldTime() { return wrapperContained.savedWorldTime; }
// public void savedWorldTime(long value) { wrapperContained.savedWorldTime = value; }
// public static long savedWorldTime() { return net.minecraft.block.entity.PistonBlockEntity.savedWorldTime; }
// public static void savedWorldTime(long value, ) { net.minecraft.block.entity.PistonBlockEntity.savedWorldTime = value; }

// public yarnwrap.block.BlockState DEFAULT_PUSHED_BLOCK_STATE() { return new yarnwrap.block.BlockState(wrapperContained.DEFAULT_PUSHED_BLOCK_STATE); }
// public void DEFAULT_PUSHED_BLOCK_STATE(yarnwrap.block.BlockState value) { wrapperContained.DEFAULT_PUSHED_BLOCK_STATE = value.wrapperContained; }
// public static yarnwrap.block.BlockState DEFAULT_PUSHED_BLOCK_STATE() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.PistonBlockEntity.DEFAULT_PUSHED_BLOCK_STATE); }
// public static void DEFAULT_PUSHED_BLOCK_STATE(yarnwrap.block.BlockState value, ) { net.minecraft.block.entity.PistonBlockEntity.DEFAULT_PUSHED_BLOCK_STATE = value.wrapperContained; }

// public float DEFAULT_PROGRESS() { return wrapperContained.DEFAULT_PROGRESS; }
// public void DEFAULT_PROGRESS(float value) { wrapperContained.DEFAULT_PROGRESS = value; }
// public static float DEFAULT_PROGRESS() { return net.minecraft.block.entity.PistonBlockEntity.DEFAULT_PROGRESS; }
// public static void DEFAULT_PROGRESS(float value, ) { net.minecraft.block.entity.PistonBlockEntity.DEFAULT_PROGRESS = value; }

// public boolean DEFAULT_EXTENDING() { return wrapperContained.DEFAULT_EXTENDING; }
// public void DEFAULT_EXTENDING(boolean value) { wrapperContained.DEFAULT_EXTENDING = value; }
// public static boolean DEFAULT_EXTENDING() { return net.minecraft.block.entity.PistonBlockEntity.DEFAULT_EXTENDING; }
// public static void DEFAULT_EXTENDING(boolean value, ) { net.minecraft.block.entity.PistonBlockEntity.DEFAULT_EXTENDING = value; }

// public boolean DEFAULT_SOURCE() { return wrapperContained.DEFAULT_SOURCE; }
// public void DEFAULT_SOURCE(boolean value) { wrapperContained.DEFAULT_SOURCE = value; }
// public static boolean DEFAULT_SOURCE() { return net.minecraft.block.entity.PistonBlockEntity.DEFAULT_SOURCE; }
// public static void DEFAULT_SOURCE(boolean value, ) { net.minecraft.block.entity.PistonBlockEntity.DEFAULT_SOURCE = value; }

public PistonBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.PistonBlockEntity(pos.wrapperContained,state.wrapperContained); }
public PistonBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.BlockState pushedBlock,yarnwrap.util.math.Direction facing,boolean extending,boolean source) { this.wrapperContained = new net.minecraft.block.entity.PistonBlockEntity(pos.wrapperContained,state.wrapperContained,pushedBlock.wrapperContained,facing.wrapperContained,extending,source); }
public float getRenderOffsetX(float tickProgress) { return wrapperContained.getRenderOffsetX(tickProgress); }
// public static float getRenderOffsetX(float tickProgress, ) { return net.minecraft.block.entity.PistonBlockEntity.getRenderOffsetX(tickProgress); }
public yarnwrap.block.BlockState getPushedBlock() { return new yarnwrap.block.BlockState(wrapperContained.getPushedBlock()); }
// public static yarnwrap.block.BlockState getPushedBlock() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.PistonBlockEntity.getPushedBlock()); }
// public yarnwrap.block.BlockState getHeadBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getHeadBlockState()); }
// public static yarnwrap.block.BlockState getHeadBlockState() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.PistonBlockEntity.getHeadBlockState()); }
// public double getIntersectionSize() { return wrapperContained.getIntersectionSize(); }
// public static double getIntersectionSize() { return net.minecraft.block.entity.PistonBlockEntity.getIntersectionSize(); }
public yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getFacing()); }
// public static yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.PistonBlockEntity.getFacing()); }
public float getProgress(float tickProgress) { return wrapperContained.getProgress(tickProgress); }
// public static float getProgress(float tickProgress, ) { return net.minecraft.block.entity.PistonBlockEntity.getProgress(tickProgress); }
// public yarnwrap.util.math.Box offsetHeadBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Box box,yarnwrap.block.entity.PistonBlockEntity blockEntity) { return new yarnwrap.util.math.Box(wrapperContained.offsetHeadBox(pos.wrapperContained,box.wrapperContained,blockEntity.wrapperContained)); }
// public static yarnwrap.util.math.Box offsetHeadBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Box box,yarnwrap.block.entity.PistonBlockEntity blockEntity, ) { return new yarnwrap.util.math.Box(net.minecraft.block.entity.PistonBlockEntity.offsetHeadBox(pos.wrapperContained,box.wrapperContained,blockEntity.wrapperContained)); }
public boolean isExtending() { return wrapperContained.isExtending(); }
// public static boolean isExtending() { return net.minecraft.block.entity.PistonBlockEntity.isExtending(); }
// public void pushEntities(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float blockEntity) { wrapperContained.pushEntities(world.wrapperContained,pos.wrapperContained,blockEntity); }
// public static void pushEntities(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float blockEntity, ) { net.minecraft.block.entity.PistonBlockEntity.pushEntities(world.wrapperContained,pos.wrapperContained,blockEntity); }
// public float getAmountExtended(float progress) { return wrapperContained.getAmountExtended(progress); }
// public static float getAmountExtended(float progress, ) { return net.minecraft.block.entity.PistonBlockEntity.getAmountExtended(progress); }
public yarnwrap.util.math.Direction getMovementDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getMovementDirection()); }
// public static yarnwrap.util.math.Direction getMovementDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.PistonBlockEntity.getMovementDirection()); }
public float getRenderOffsetZ(float tickProgress) { return wrapperContained.getRenderOffsetZ(tickProgress); }
// public static float getRenderOffsetZ(float tickProgress, ) { return net.minecraft.block.entity.PistonBlockEntity.getRenderOffsetZ(tickProgress); }
public long getSavedWorldTime() { return wrapperContained.getSavedWorldTime(); }
// public static long getSavedWorldTime() { return net.minecraft.block.entity.PistonBlockEntity.getSavedWorldTime(); }
public float getRenderOffsetY(float tickProgress) { return wrapperContained.getRenderOffsetY(tickProgress); }
// public static float getRenderOffsetY(float tickProgress, ) { return net.minecraft.block.entity.PistonBlockEntity.getRenderOffsetY(tickProgress); }
public yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCollisionShape(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.entity.PistonBlockEntity.getCollisionShape(world.wrapperContained,pos.wrapperContained)); }
public void finish() { wrapperContained.finish(); }
// public static void finish() { net.minecraft.block.entity.PistonBlockEntity.finish(); }
// public void push(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.util.math.Direction direction,double amount) { wrapperContained.push(pos.wrapperContained,entity.wrapperContained,direction.wrapperContained,amount); }
// public static void push(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.util.math.Direction direction,double amount, ) { net.minecraft.block.entity.PistonBlockEntity.push(pos.wrapperContained,entity.wrapperContained,direction.wrapperContained,amount); }
public boolean isSource() { return wrapperContained.isSource(); }
// public static boolean isSource() { return net.minecraft.block.entity.PistonBlockEntity.isSource(); }
// public boolean isPushingHoneyBlock() { return wrapperContained.isPushingHoneyBlock(); }
// public static boolean isPushingHoneyBlock() { return net.minecraft.block.entity.PistonBlockEntity.isPushingHoneyBlock(); }
// public boolean canMoveEntity(yarnwrap.util.math.Box box,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canMoveEntity(box.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public static boolean canMoveEntity(yarnwrap.util.math.Box box,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.entity.PistonBlockEntity.canMoveEntity(box.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public void moveEntity(yarnwrap.util.math.Direction direction,yarnwrap.entity.Entity entity,double distance,yarnwrap.util.math.Direction movementDirection) { wrapperContained.moveEntity(direction.wrapperContained,entity.wrapperContained,distance,movementDirection.wrapperContained); }
// public static void moveEntity(yarnwrap.util.math.Direction direction,yarnwrap.entity.Entity entity,double distance,yarnwrap.util.math.Direction movementDirection, ) { net.minecraft.block.entity.PistonBlockEntity.moveEntity(direction.wrapperContained,entity.wrapperContained,distance,movementDirection.wrapperContained); }
// public boolean method_23673(yarnwrap.util.math.Box entity) { return wrapperContained.method_23673(entity.wrapperContained); }
// public static boolean method_23673(yarnwrap.util.math.Box entity, ) { return net.minecraft.block.entity.PistonBlockEntity.method_23673(entity.wrapperContained); }
// public void moveEntitiesInHoneyBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float blockEntity) { wrapperContained.moveEntitiesInHoneyBlock(world.wrapperContained,pos.wrapperContained,blockEntity); }
// public static void moveEntitiesInHoneyBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float blockEntity, ) { net.minecraft.block.entity.PistonBlockEntity.moveEntitiesInHoneyBlock(world.wrapperContained,pos.wrapperContained,blockEntity); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.PistonBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.PistonBlockEntity blockEntity, ) { net.minecraft.block.entity.PistonBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getDirection()); }
// public static yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.entity.PistonBlockEntity.getDirection()); }

}