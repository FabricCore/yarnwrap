package yarnwrap.block;
public class KelpPlantBlock { public net.minecraft.block.KelpPlantBlock wrapperContained; public KelpPlantBlock(net.minecraft.block.KelpPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.KelpPlantBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.KelpPlantBlock.CODEC = value; }


}