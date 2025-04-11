package yarnwrap.block;
public class SpawnerBlock { public net.minecraft.block.SpawnerBlock wrapperContained; public SpawnerBlock(net.minecraft.block.SpawnerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}