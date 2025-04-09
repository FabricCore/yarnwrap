package yarnwrap.block;
public class ChestBlock { public net.minecraft.block.ChestBlock wrapperContained; public ChestBlock(net.minecraft.block.ChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape DOUBLE_NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_NORTH_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape DOUBLE_EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_EAST_SHAPE); }
public yarnwrap.state.property.EnumProperty CHEST_TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.CHEST_TYPE); }
// public yarnwrap.util.shape.VoxelShape DOUBLE_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_SOUTH_SHAPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.util.shape.VoxelShape DOUBLE_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SINGLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SINGLE_SHAPE); }
// public Object INVENTORY_RETRIEVER() { return wrapperContained.INVENTORY_RETRIEVER; }
// public Object NAME_RETRIEVER() { return wrapperContained.NAME_RETRIEVER; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.inventory.Inventory getInventory(yarnwrap.block.ChestBlock block,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ignoreBlocked) { return new yarnwrap.inventory.Inventory(wrapperContained.getInventory(block.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreBlocked)); }
public Object getAnimationProgressRetriever(yarnwrap.block.entity.LidOpenable progress) { return wrapperContained.getAnimationProgressRetriever(progress.wrapperContained); }
public Object getDoubleBlockType(yarnwrap.block.BlockState state) { return wrapperContained.getDoubleBlockType(state.wrapperContained); }
public yarnwrap.block.entity.BlockEntityType getExpectedEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getExpectedEntityType()); }
// public yarnwrap.util.math.Direction getNeighborChestDirection(yarnwrap.item.ItemPlacementContext ctx,yarnwrap.util.math.Direction dir) { return new yarnwrap.util.math.Direction(wrapperContained.getNeighborChestDirection(ctx.wrapperContained,dir.wrapperContained)); }
// public boolean hasCatOnTop(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasCatOnTop(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.stat.Stat getOpenStat() { return new yarnwrap.stat.Stat(wrapperContained.getOpenStat()); }
public boolean isChestBlocked(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isChestBlocked(world.wrapperContained,pos.wrapperContained); }
// public boolean hasBlockOnTop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasBlockOnTop(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.util.math.Direction getFacing(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getFacing(state.wrapperContained)); }

}