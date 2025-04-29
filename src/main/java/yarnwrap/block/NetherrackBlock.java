package yarnwrap.block;
public class NetherrackBlock { public net.minecraft.block.NetherrackBlock wrapperContained; public NetherrackBlock(net.minecraft.block.NetherrackBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.NetherrackBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.NetherrackBlock.CODEC = value; }


}