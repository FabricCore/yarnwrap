package yarnwrap.block;
public class WallSignBlock { public net.minecraft.block.WallSignBlock wrapperContained; public WallSignBlock(net.minecraft.block.WallSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
// public void FACING_TO_SHAPE(java.util.Map value) { wrapperContained.FACING_TO_SHAPE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_54064(Object instance) { return wrapperContained.method_54064(instance); }

}