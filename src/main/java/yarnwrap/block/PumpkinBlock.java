package yarnwrap.block;
public class PumpkinBlock { public net.minecraft.block.PumpkinBlock wrapperContained; public PumpkinBlock(net.minecraft.block.PumpkinBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PumpkinBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PumpkinBlock.CODEC = value; }


}