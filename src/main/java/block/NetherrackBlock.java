package yarnwrap.block;
public class NetherrackBlock { public net.minecraft.block.NetherrackBlock wrapperContained; public NetherrackBlock(net.minecraft.block.NetherrackBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}