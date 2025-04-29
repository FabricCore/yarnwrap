package yarnwrap.block;
public class FlowerbedBlock { public net.minecraft.block.FlowerbedBlock wrapperContained; public FlowerbedBlock(net.minecraft.block.FlowerbedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.FlowerbedBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.FlowerbedBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty FLOWER_AMOUNT() { return new yarnwrap.state.property.IntProperty(wrapperContained.FLOWER_AMOUNT); }
// public void FLOWER_AMOUNT(yarnwrap.state.property.IntProperty value) { wrapperContained.FLOWER_AMOUNT = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty FLOWER_AMOUNT() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.FlowerbedBlock.FLOWER_AMOUNT); }
// public static void FLOWER_AMOUNT(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.FlowerbedBlock.FLOWER_AMOUNT = value.wrapperContained; }

// public java.util.function.BiFunction FACING_AND_AMOUNT_TO_SHAPE() { return wrapperContained.FACING_AND_AMOUNT_TO_SHAPE; }
// public void FACING_AND_AMOUNT_TO_SHAPE(java.util.function.BiFunction value) { wrapperContained.FACING_AND_AMOUNT_TO_SHAPE = value; }
// public static java.util.function.BiFunction FACING_AND_AMOUNT_TO_SHAPE() { return net.minecraft.block.FlowerbedBlock.FACING_AND_AMOUNT_TO_SHAPE; }
// public static void FACING_AND_AMOUNT_TO_SHAPE(java.util.function.BiFunction value, ) { net.minecraft.block.FlowerbedBlock.FACING_AND_AMOUNT_TO_SHAPE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FlowerbedBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FlowerbedBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape method_52574(yarnwrap.util.math.Direction facing,java.lang.Integer flowerAmount) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_52574(facing.wrapperContained,flowerAmount)); }
// public static yarnwrap.util.shape.VoxelShape method_52574(yarnwrap.util.math.Direction facing,java.lang.Integer flowerAmount, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FlowerbedBlock.method_52574(facing.wrapperContained,flowerAmount)); }

}