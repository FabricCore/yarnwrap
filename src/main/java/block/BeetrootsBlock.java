package yarnwrap.block;
public class BeetrootsBlock { public net.minecraft.block.BeetrootsBlock wrapperContained; public BeetrootsBlock(net.minecraft.block.BeetrootsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public int BEETROOTS_MAX_AGE() { return wrapperContained.BEETROOTS_MAX_AGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }

}