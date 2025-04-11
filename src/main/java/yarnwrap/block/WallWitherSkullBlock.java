package yarnwrap.block;
public class WallWitherSkullBlock { public net.minecraft.block.WallWitherSkullBlock wrapperContained; public WallWitherSkullBlock(net.minecraft.block.WallWitherSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}