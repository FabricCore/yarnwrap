package yarnwrap.block;
public class BlockState { public net.minecraft.block.BlockState wrapperContained; public BlockState(net.minecraft.block.BlockState wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}