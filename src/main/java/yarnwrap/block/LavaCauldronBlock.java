package yarnwrap.block;
public class LavaCauldronBlock { public net.minecraft.block.LavaCauldronBlock wrapperContained; public LavaCauldronBlock(net.minecraft.block.LavaCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LavaCauldronBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LavaCauldronBlock.CODEC = value; }


}