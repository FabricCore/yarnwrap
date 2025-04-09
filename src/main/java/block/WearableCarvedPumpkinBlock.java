package yarnwrap.block;
public class WearableCarvedPumpkinBlock { public net.minecraft.block.WearableCarvedPumpkinBlock wrapperContained; public WearableCarvedPumpkinBlock(net.minecraft.block.WearableCarvedPumpkinBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}