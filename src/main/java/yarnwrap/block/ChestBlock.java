package yarnwrap.block;
public class ChestBlock { public net.minecraft.block.ChestBlock wrapperContained; public ChestBlock(net.minecraft.block.ChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape DOUBLE_NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_NORTH_SHAPE); }
// public void DOUBLE_NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOUBLE_NORTH_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOUBLE_EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_EAST_SHAPE); }
// public void DOUBLE_EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOUBLE_EAST_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty CHEST_TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.CHEST_TYPE); }
// public void CHEST_TYPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.CHEST_TYPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOUBLE_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_SOUTH_SHAPE); }
// public void DOUBLE_SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOUBLE_SOUTH_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOUBLE_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOUBLE_WEST_SHAPE); }
// public void DOUBLE_WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOUBLE_WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SINGLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SINGLE_SHAPE); }
// public void SINGLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SINGLE_SHAPE = value.wrapperContained; }
// public Object INVENTORY_RETRIEVER() { return wrapperContained.INVENTORY_RETRIEVER; }
// // public void INVENTORY_RETRIEVER(Object value) { wrapperContained.INVENTORY_RETRIEVER = value; }
// public Object NAME_RETRIEVER() { return wrapperContained.NAME_RETRIEVER; }
// // public void NAME_RETRIEVER(Object value) { wrapperContained.NAME_RETRIEVER = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.inventory.Inventory getInventory(yarnwrap.block.ChestBlock block,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ignoreBlocked) { return new yarnwrap.inventory.Inventory(wrapperContained.getInventory(block.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreBlocked)); }
public Object getAnimationProgressRetriever(yarnwrap.block.entity.LidOpenable progress) { return wrapperContained.getAnimationProgressRetriever(progress.wrapperContained); }
// public boolean method_24168(yarnwrap.world.WorldAccess worldx,yarnwrap.util.math.BlockPos posx) { return wrapperContained.method_24168(worldx.wrapperContained,posx.wrapperContained); }
public Object getDoubleBlockType(yarnwrap.block.BlockState state) { return wrapperContained.getDoubleBlockType(state.wrapperContained); }
public yarnwrap.block.entity.BlockEntityType getExpectedEntityType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getExpectedEntityType()); }
// public yarnwrap.block.ChestBlock method_53992(Object settings) { return new yarnwrap.block.ChestBlock(wrapperContained.method_53992(settings)); }
// public yarnwrap.util.math.Direction getNeighborChestDirection(yarnwrap.item.ItemPlacementContext ctx,yarnwrap.util.math.Direction dir) { return new yarnwrap.util.math.Direction(wrapperContained.getNeighborChestDirection(ctx.wrapperContained,dir.wrapperContained)); }
// public boolean hasCatOnTop(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasCatOnTop(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.stat.Stat getOpenStat() { return new yarnwrap.stat.Stat(wrapperContained.getOpenStat()); }
public boolean isChestBlocked(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isChestBlocked(world.wrapperContained,pos.wrapperContained); }
// public boolean hasBlockOnTop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasBlockOnTop(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.util.math.Direction getFacing(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getFacing(state.wrapperContained)); }

}