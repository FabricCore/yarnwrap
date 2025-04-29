package yarnwrap.block;
public class CherryLeavesBlock { public net.minecraft.block.CherryLeavesBlock wrapperContained; public CherryLeavesBlock(net.minecraft.block.CherryLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CherryLeavesBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CherryLeavesBlock.CODEC = value; }


}