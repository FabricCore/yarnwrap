package yarnwrap.block;
public class GlazedTerracottaBlock { public net.minecraft.block.GlazedTerracottaBlock wrapperContained; public GlazedTerracottaBlock(net.minecraft.block.GlazedTerracottaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.GlazedTerracottaBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.GlazedTerracottaBlock.CODEC = value; }


}