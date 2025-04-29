package yarnwrap.block;
public class WearableCarvedPumpkinBlock { public net.minecraft.block.WearableCarvedPumpkinBlock wrapperContained; public WearableCarvedPumpkinBlock(net.minecraft.block.WearableCarvedPumpkinBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WearableCarvedPumpkinBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WearableCarvedPumpkinBlock.CODEC = value; }


}