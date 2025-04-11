package yarnwrap.block;
public class WitherRoseBlock { public net.minecraft.block.WitherRoseBlock wrapperContained; public WitherRoseBlock(net.minecraft.block.WitherRoseBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_54075(Object instance) { return wrapperContained.method_54075(instance); }

}