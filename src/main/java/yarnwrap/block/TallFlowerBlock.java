package yarnwrap.block;
public class TallFlowerBlock { public net.minecraft.block.TallFlowerBlock wrapperContained; public TallFlowerBlock(net.minecraft.block.TallFlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TallFlowerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TallFlowerBlock.CODEC = value; }


}