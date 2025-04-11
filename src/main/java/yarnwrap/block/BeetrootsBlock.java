package yarnwrap.block;
public class BeetrootsBlock { public net.minecraft.block.BeetrootsBlock wrapperContained; public BeetrootsBlock(net.minecraft.block.BeetrootsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public int BEETROOTS_MAX_AGE() { return wrapperContained.BEETROOTS_MAX_AGE; }
// public void BEETROOTS_MAX_AGE(int value) { wrapperContained.BEETROOTS_MAX_AGE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }

}