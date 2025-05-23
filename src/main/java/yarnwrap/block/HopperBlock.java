package yarnwrap.block;
public class HopperBlock { public net.minecraft.block.HopperBlock wrapperContained; public HopperBlock(net.minecraft.block.HopperBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty ENABLED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ENABLED); }
// public void ENABLED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ENABLED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty ENABLED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HopperBlock.ENABLED); }
// public static void ENABLED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HopperBlock.ENABLED = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.HopperBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.HopperBlock.FACING = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.HopperBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.HopperBlock.CODEC = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.HopperBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.HopperBlock.shapeFunction = value; }

// public java.util.Map shapesByDirection() { return wrapperContained.shapesByDirection; }
// public void shapesByDirection(java.util.Map value) { wrapperContained.shapesByDirection = value; }
// public static java.util.Map shapesByDirection() { return net.minecraft.block.HopperBlock.shapesByDirection; }
// public static void shapesByDirection(java.util.Map value, ) { net.minecraft.block.HopperBlock.shapesByDirection = value; }

// public void updateEnabled(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateEnabled(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateEnabled(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.HopperBlock.updateEnabled(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66438(yarnwrap.util.shape.VoxelShape state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66438(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66438(yarnwrap.util.shape.VoxelShape state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HopperBlock.method_66438(state.wrapperContained)); }
// public java.util.function.Function createShapeFunction(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.createShapeFunction(shape.wrapperContained); }
// public static java.util.function.Function createShapeFunction(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.block.HopperBlock.createShapeFunction(shape.wrapperContained); }

}