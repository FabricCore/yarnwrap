package yarnwrap.block;
public class PlayerSkullBlock { public net.minecraft.block.PlayerSkullBlock wrapperContained; public PlayerSkullBlock(net.minecraft.block.PlayerSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}