package yarnwrap.block;
public class TrappedChestBlock { public net.minecraft.block.TrappedChestBlock wrapperContained; public TrappedChestBlock(net.minecraft.block.TrappedChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}