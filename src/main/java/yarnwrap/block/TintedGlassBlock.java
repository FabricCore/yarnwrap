package yarnwrap.block;
public class TintedGlassBlock { public net.minecraft.block.TintedGlassBlock wrapperContained; public TintedGlassBlock(net.minecraft.block.TintedGlassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TintedGlassBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TintedGlassBlock.CODEC = value; }


}