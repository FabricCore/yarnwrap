package yarnwrap.block;
public class WallPlayerSkullBlock { public net.minecraft.block.WallPlayerSkullBlock wrapperContained; public WallPlayerSkullBlock(net.minecraft.block.WallPlayerSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallPlayerSkullBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallPlayerSkullBlock.CODEC = value; }


}