package yarnwrap.block;
public class NetherWartBlock { public net.minecraft.block.NetherWartBlock wrapperContained; public NetherWartBlock(net.minecraft.block.NetherWartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}