package yarnwrap.block;
public class AirBlock { public net.minecraft.block.AirBlock wrapperContained; public AirBlock(net.minecraft.block.AirBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}