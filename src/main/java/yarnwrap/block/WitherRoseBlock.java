package yarnwrap.block;
public class WitherRoseBlock { public net.minecraft.block.WitherRoseBlock wrapperContained; public WitherRoseBlock(net.minecraft.block.WitherRoseBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WitherRoseBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WitherRoseBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_54075(Object instance) { return wrapperContained.method_54075(instance); }
// public static com.mojang.datafixers.kinds.App method_54075(Object instance, ) { return net.minecraft.block.WitherRoseBlock.method_54075(instance); }

}