package yarnwrap.block;
public class AbstractRailBlock { public net.minecraft.block.AbstractRailBlock wrapperContained; public AbstractRailBlock(net.minecraft.block.AbstractRailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape STRAIGHT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.STRAIGHT_SHAPE); }
// public void STRAIGHT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.STRAIGHT_SHAPE = value.wrapperContained; }
// public boolean forbidCurves() { return wrapperContained.forbidCurves; }
// public void forbidCurves(boolean value) { wrapperContained.forbidCurves = value; }
// public yarnwrap.util.shape.VoxelShape ASCENDING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ASCENDING_SHAPE); }
// public void ASCENDING_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ASCENDING_SHAPE = value.wrapperContained; }
// public yarnwrap.block.BlockState updateCurves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean notify) { return new yarnwrap.block.BlockState(wrapperContained.updateCurves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,notify)); }
// public boolean shouldDropRail(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.block.enums.RailShape shape) { return wrapperContained.shouldDropRail(pos.wrapperContained,world.wrapperContained,shape.wrapperContained); }
public yarnwrap.state.property.Property getShapeProperty() { return new yarnwrap.state.property.Property(wrapperContained.getShapeProperty()); }
// public yarnwrap.block.BlockState updateBlockState(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean forceUpdate) { return new yarnwrap.block.BlockState(wrapperContained.updateBlockState(world.wrapperContained,pos.wrapperContained,state.wrapperContained,forceUpdate)); }
public boolean isRail(yarnwrap.block.BlockState state) { return wrapperContained.isRail(state.wrapperContained); }
// public void updateBlockState(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block neighbor) { wrapperContained.updateBlockState(state.wrapperContained,world.wrapperContained,pos.wrapperContained,neighbor.wrapperContained); }
public boolean cannotMakeCurves() { return wrapperContained.cannotMakeCurves(); }
public boolean isRail(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isRail(world.wrapperContained,pos.wrapperContained); }

}