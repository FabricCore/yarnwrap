package yarnwrap.block;
public class CaveVinesBodyBlock { public net.minecraft.block.CaveVinesBodyBlock wrapperContained; public CaveVinesBodyBlock(net.minecraft.block.CaveVinesBodyBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CaveVinesBodyBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CaveVinesBodyBlock.CODEC = value; }


}