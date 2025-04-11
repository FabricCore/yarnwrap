package yarnwrap.block;
public class TorchflowerBlock { public net.minecraft.block.TorchflowerBlock wrapperContained; public TorchflowerBlock(net.minecraft.block.TorchflowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] SHAPES() { return wrapperContained.SHAPES; }
// public void SHAPES(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}