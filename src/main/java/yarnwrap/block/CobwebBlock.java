package yarnwrap.block;
public class CobwebBlock { public net.minecraft.block.CobwebBlock wrapperContained; public CobwebBlock(net.minecraft.block.CobwebBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CobwebBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CobwebBlock.CODEC = value; }


}