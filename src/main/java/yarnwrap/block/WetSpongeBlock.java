package yarnwrap.block;
public class WetSpongeBlock { public net.minecraft.block.WetSpongeBlock wrapperContained; public WetSpongeBlock(net.minecraft.block.WetSpongeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}