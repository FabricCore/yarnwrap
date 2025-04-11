package yarnwrap.block;
public class SmokerBlock { public net.minecraft.block.SmokerBlock wrapperContained; public SmokerBlock(net.minecraft.block.SmokerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}