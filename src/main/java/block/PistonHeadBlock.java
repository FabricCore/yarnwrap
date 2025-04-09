package yarnwrap.block;
public class PistonHeadBlock { public net.minecraft.block.PistonHeadBlock wrapperContained; public PistonHeadBlock(net.minecraft.block.PistonHeadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHORT_WEST_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHORT_WEST_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_HEAD_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_HEAD_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_HEAD_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_HEAD_SHAPE); }
// public yarnwrap.util.shape.VoxelShape UP_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SHORT_SOUTH_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHORT_SOUTH_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SHORT_DOWN_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHORT_DOWN_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SHORT_EAST_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHORT_EAST_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape DOWN_HEAD_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_HEAD_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_HEAD_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_HEAD_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_ARM_SHAPE); }
public yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TYPE); }
// public yarnwrap.util.shape.VoxelShape SHORT_NORTH_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHORT_NORTH_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape DOWN_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_ARM_SHAPE); }
public yarnwrap.state.property.BooleanProperty SHORT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SHORT); }
// public yarnwrap.util.shape.VoxelShape SOUTH_HEAD_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_HEAD_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_ARM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape UP_HEAD_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_HEAD_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SHORT_UP_ARM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHORT_UP_ARM_SHAPE); }
// public net.minecraft.util.shape.VoxelShape[] SHORT_HEAD_SHAPES() { return wrapperContained.SHORT_HEAD_SHAPES; }
// public net.minecraft.util.shape.VoxelShape[] HEAD_SHAPES() { return wrapperContained.HEAD_SHAPES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape getHeadShape(yarnwrap.util.math.Direction direction,boolean shortHead) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getHeadShape(direction.wrapperContained,shortHead)); }
// public boolean isAttached(yarnwrap.block.BlockState headState,yarnwrap.block.BlockState pistonState) { return wrapperContained.isAttached(headState.wrapperContained,pistonState.wrapperContained); }
// public net.minecraft.util.shape.VoxelShape[] getHeadShapes(boolean shortHead) { return wrapperContained.getHeadShapes(shortHead); }

}