package yarnwrap.block;
public class BeaconBlock { public net.minecraft.block.BeaconBlock wrapperContained; public BeaconBlock(net.minecraft.block.BeaconBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}