package yarnwrap.block;
public class FletchingTableBlock { public net.minecraft.block.FletchingTableBlock wrapperContained; public FletchingTableBlock(net.minecraft.block.FletchingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FletchingTableBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FletchingTableBlock.CODEC = value; }


}