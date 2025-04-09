package yarnwrap.block;
public class BellBlock { public net.minecraft.block.BellBlock wrapperContained; public BellBlock(net.minecraft.block.BellBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EAST_WEST_WALLS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_WEST_WALLS_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_WALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_WALL_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape NORTH_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SOUTH_SHAPE); }
public yarnwrap.state.property.EnumProperty ATTACHMENT() { return new yarnwrap.state.property.EnumProperty(wrapperContained.ATTACHMENT); }
// public yarnwrap.util.shape.VoxelShape BELL_WAIST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BELL_WAIST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape BELL_LIP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BELL_LIP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape BELL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BELL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SOUTH_WALLS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SOUTH_WALLS_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_WALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_WALL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_WALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_WALL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_WALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_WALL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape HANGING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.HANGING_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Direction getPlacementSide(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getPlacementSide(state.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(state.wrapperContained)); }
public boolean ring(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.ring(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean isPointOnBell(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side,double y) { return wrapperContained.isPointOnBell(state.wrapperContained,side.wrapperContained,y); }
public boolean ring(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.entity.player.PlayerEntity player,boolean checkHitPos) { return wrapperContained.ring(world.wrapperContained,state.wrapperContained,hitResult.wrapperContained,player.wrapperContained,checkHitPos); }
public boolean ring(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.ring(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }

}