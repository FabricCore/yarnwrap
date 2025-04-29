package yarnwrap.block;
public class BlastFurnaceBlock { public net.minecraft.block.BlastFurnaceBlock wrapperContained; public BlastFurnaceBlock(net.minecraft.block.BlastFurnaceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BlastFurnaceBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BlastFurnaceBlock.CODEC = value; }


}