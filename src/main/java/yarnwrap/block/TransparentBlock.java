package yarnwrap.block;
public class TransparentBlock { public net.minecraft.block.TransparentBlock wrapperContained; public TransparentBlock(net.minecraft.block.TransparentBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TransparentBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TransparentBlock.CODEC = value; }


}