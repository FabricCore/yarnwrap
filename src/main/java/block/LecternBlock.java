package yarnwrap.block;
public class LecternBlock { public net.minecraft.block.LecternBlock wrapperContained; public LecternBlock(net.minecraft.block.LecternBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.util.shape.VoxelShape MIDDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.MIDDLE_SHAPE); }
public yarnwrap.util.shape.VoxelShape BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public yarnwrap.state.property.BooleanProperty HAS_BOOK() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HAS_BOOK); }
public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE_TOP() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE_TOP); }
public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void openScreen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.openScreen(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
public void setPowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setPowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean putBookIfAbsent(yarnwrap.entity.LivingEntity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack) { return wrapperContained.putBookIfAbsent(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,stack.wrapperContained); }
public void setHasBook(yarnwrap.entity.Entity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean hasBook) { wrapperContained.setHasBook(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,hasBook); }
// public void updateNeighborAlways(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighborAlways(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void putBook(yarnwrap.entity.LivingEntity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack) { wrapperContained.putBook(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,stack.wrapperContained); }
// public void setPowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean powered) { wrapperContained.setPowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained,powered); }
// public void dropBook(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.dropBook(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}