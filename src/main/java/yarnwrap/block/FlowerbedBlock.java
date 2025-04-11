package yarnwrap.block;
public class FlowerbedBlock { public net.minecraft.block.FlowerbedBlock wrapperContained; public FlowerbedBlock(net.minecraft.block.FlowerbedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public yarnwrap.state.property.IntProperty FLOWER_AMOUNT() { return new yarnwrap.state.property.IntProperty(wrapperContained.FLOWER_AMOUNT); }
// public void FLOWER_AMOUNT(yarnwrap.state.property.IntProperty value) { wrapperContained.FLOWER_AMOUNT = value.wrapperContained; }
// public java.util.function.BiFunction FACING_AND_AMOUNT_TO_SHAPE() { return wrapperContained.FACING_AND_AMOUNT_TO_SHAPE; }
// public void FACING_AND_AMOUNT_TO_SHAPE(java.util.function.BiFunction value) { wrapperContained.FACING_AND_AMOUNT_TO_SHAPE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.shape.VoxelShape method_52574(yarnwrap.util.math.Direction facing,java.lang.Integer flowerAmount) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_52574(facing.wrapperContained,flowerAmount)); }

}