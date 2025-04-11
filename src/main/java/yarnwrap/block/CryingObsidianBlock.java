package yarnwrap.block;
public class CryingObsidianBlock { public net.minecraft.block.CryingObsidianBlock wrapperContained; public CryingObsidianBlock(net.minecraft.block.CryingObsidianBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}