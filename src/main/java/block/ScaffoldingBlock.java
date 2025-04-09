package yarnwrap.block;
public class ScaffoldingBlock { public net.minecraft.block.ScaffoldingBlock wrapperContained; public ScaffoldingBlock(net.minecraft.block.ScaffoldingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape NORMAL_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORMAL_OUTLINE_SHAPE); }
public yarnwrap.state.property.IntProperty DISTANCE() { return new yarnwrap.state.property.IntProperty(wrapperContained.DISTANCE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.util.shape.VoxelShape BOTTOM_OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_OUTLINE_SHAPE); }
public yarnwrap.state.property.BooleanProperty BOTTOM() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BOTTOM); }
// public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public int calculateDistance(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calculateDistance(world.wrapperContained,pos.wrapperContained); }
// public boolean shouldBeBottom(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int distance) { return wrapperContained.shouldBeBottom(world.wrapperContained,pos.wrapperContained,distance); }

}