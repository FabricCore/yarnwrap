package yarnwrap.block;
public class AbstractRailBlock { public net.minecraft.block.AbstractRailBlock wrapperContained; public AbstractRailBlock(net.minecraft.block.AbstractRailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape STRAIGHT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.STRAIGHT_SHAPE); }
// public void STRAIGHT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.STRAIGHT_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape STRAIGHT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractRailBlock.STRAIGHT_SHAPE); }
// public static void STRAIGHT_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractRailBlock.STRAIGHT_SHAPE = value.wrapperContained; }

// public boolean forbidCurves() { return wrapperContained.forbidCurves; }
// public void forbidCurves(boolean value) { wrapperContained.forbidCurves = value; }
// public static boolean forbidCurves() { return net.minecraft.block.AbstractRailBlock.forbidCurves; }
// public static void forbidCurves(boolean value, ) { net.minecraft.block.AbstractRailBlock.forbidCurves = value; }

// public yarnwrap.util.shape.VoxelShape ASCENDING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ASCENDING_SHAPE); }
// public void ASCENDING_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ASCENDING_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape ASCENDING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractRailBlock.ASCENDING_SHAPE); }
// public static void ASCENDING_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractRailBlock.ASCENDING_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AbstractRailBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AbstractRailBlock.WATERLOGGED = value.wrapperContained; }

// public AbstractRailBlock(boolean forbidCurves,Object settings) { this.wrapperContained = new net.minecraft.block.AbstractRailBlock(forbidCurves,settings); }
public yarnwrap.state.property.Property getShapeProperty() { return new yarnwrap.state.property.Property(wrapperContained.getShapeProperty()); }
// public static yarnwrap.state.property.Property getShapeProperty() { return new yarnwrap.state.property.Property(net.minecraft.block.AbstractRailBlock.getShapeProperty()); }
// public yarnwrap.block.BlockState updateBlockState(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean forceUpdate) { return new yarnwrap.block.BlockState(wrapperContained.updateBlockState(world.wrapperContained,pos.wrapperContained,state.wrapperContained,forceUpdate)); }
// public static yarnwrap.block.BlockState updateBlockState(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean forceUpdate, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractRailBlock.updateBlockState(world.wrapperContained,pos.wrapperContained,state.wrapperContained,forceUpdate)); }
// public boolean isRail(yarnwrap.block.BlockState state) { return wrapperContained.isRail(state.wrapperContained); }
// public static boolean isRail(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRailBlock.isRail(state.wrapperContained); }
// public void updateBlockState(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block neighbor) { wrapperContained.updateBlockState(state.wrapperContained,world.wrapperContained,pos.wrapperContained,neighbor.wrapperContained); }
// public static void updateBlockState(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block neighbor, ) { net.minecraft.block.AbstractRailBlock.updateBlockState(state.wrapperContained,world.wrapperContained,pos.wrapperContained,neighbor.wrapperContained); }
public boolean cannotMakeCurves() { return wrapperContained.cannotMakeCurves(); }
// public static boolean cannotMakeCurves() { return net.minecraft.block.AbstractRailBlock.cannotMakeCurves(); }
// public boolean isRail(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isRail(world.wrapperContained,pos.wrapperContained); }
// public static boolean isRail(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractRailBlock.isRail(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState updateCurves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean notify) { return new yarnwrap.block.BlockState(wrapperContained.updateCurves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,notify)); }
// public static yarnwrap.block.BlockState updateCurves(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean notify, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractRailBlock.updateCurves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,notify)); }
// public boolean shouldDropRail(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.block.enums.RailShape shape) { return wrapperContained.shouldDropRail(pos.wrapperContained,world.wrapperContained,shape.wrapperContained); }
// public static boolean shouldDropRail(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.block.enums.RailShape shape, ) { return net.minecraft.block.AbstractRailBlock.shouldDropRail(pos.wrapperContained,world.wrapperContained,shape.wrapperContained); }
// public yarnwrap.block.enums.RailShape mirrorShape(yarnwrap.block.enums.RailShape shape,yarnwrap.util.BlockMirror mirror) { return new yarnwrap.block.enums.RailShape(wrapperContained.mirrorShape(shape.wrapperContained,mirror.wrapperContained)); }
// public static yarnwrap.block.enums.RailShape mirrorShape(yarnwrap.block.enums.RailShape shape,yarnwrap.util.BlockMirror mirror, ) { return new yarnwrap.block.enums.RailShape(net.minecraft.block.AbstractRailBlock.mirrorShape(shape.wrapperContained,mirror.wrapperContained)); }
// public yarnwrap.block.enums.RailShape rotateShape(yarnwrap.block.enums.RailShape shape,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.block.enums.RailShape(wrapperContained.rotateShape(shape.wrapperContained,rotation.wrapperContained)); }
// public static yarnwrap.block.enums.RailShape rotateShape(yarnwrap.block.enums.RailShape shape,yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.block.enums.RailShape(net.minecraft.block.AbstractRailBlock.rotateShape(shape.wrapperContained,rotation.wrapperContained)); }

}