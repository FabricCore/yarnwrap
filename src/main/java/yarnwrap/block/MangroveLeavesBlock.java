package yarnwrap.block;
public class MangroveLeavesBlock { public net.minecraft.block.MangroveLeavesBlock wrapperContained; public MangroveLeavesBlock(net.minecraft.block.MangroveLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MangroveLeavesBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MangroveLeavesBlock.CODEC = value; }


}