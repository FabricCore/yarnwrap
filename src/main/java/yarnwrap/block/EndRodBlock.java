package yarnwrap.block;
public class EndRodBlock { public net.minecraft.block.EndRodBlock wrapperContained; public EndRodBlock(net.minecraft.block.EndRodBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.EndRodBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.EndRodBlock.CODEC = value; }


}