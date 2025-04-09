package yarnwrap.block;
public class WallPlayerSkullBlock { public net.minecraft.block.WallPlayerSkullBlock wrapperContained; public WallPlayerSkullBlock(net.minecraft.block.WallPlayerSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}