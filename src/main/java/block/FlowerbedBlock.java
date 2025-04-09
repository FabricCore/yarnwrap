package yarnwrap.block;
public class FlowerbedBlock { public net.minecraft.block.FlowerbedBlock wrapperContained; public FlowerbedBlock(net.minecraft.block.FlowerbedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.state.property.IntProperty FLOWER_AMOUNT() { return new yarnwrap.state.property.IntProperty(wrapperContained.FLOWER_AMOUNT); }
// public java.util.function.BiFunction FACING_AND_AMOUNT_TO_SHAPE() { return wrapperContained.FACING_AND_AMOUNT_TO_SHAPE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}