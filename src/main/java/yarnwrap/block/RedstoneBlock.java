package yarnwrap.block;
public class RedstoneBlock { public net.minecraft.block.RedstoneBlock wrapperContained; public RedstoneBlock(net.minecraft.block.RedstoneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RedstoneBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RedstoneBlock.CODEC = value; }


}