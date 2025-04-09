package yarnwrap.block;
public class TorchflowerBlock { public net.minecraft.block.TorchflowerBlock wrapperContained; public TorchflowerBlock(net.minecraft.block.TorchflowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public net.minecraft.util.shape.VoxelShape[] SHAPES() { return wrapperContained.SHAPES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}