package yarnwrap.block;
public class AmethystBlock { public net.minecraft.block.AmethystBlock wrapperContained; public AmethystBlock(net.minecraft.block.AmethystBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.AmethystBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.AmethystBlock.CODEC = value; }


}