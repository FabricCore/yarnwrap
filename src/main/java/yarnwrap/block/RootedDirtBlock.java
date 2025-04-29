package yarnwrap.block;
public class RootedDirtBlock { public net.minecraft.block.RootedDirtBlock wrapperContained; public RootedDirtBlock(net.minecraft.block.RootedDirtBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RootedDirtBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RootedDirtBlock.CODEC = value; }


}