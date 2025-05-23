package yarnwrap.block;
public class TintedParticleLeavesBlock { public net.minecraft.block.TintedParticleLeavesBlock wrapperContained; public TintedParticleLeavesBlock(net.minecraft.block.TintedParticleLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TintedParticleLeavesBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TintedParticleLeavesBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67237(Object instance) { return wrapperContained.method_67237(instance); }
// public static com.mojang.datafixers.kinds.App method_67237(Object instance, ) { return net.minecraft.block.TintedParticleLeavesBlock.method_67237(instance); }

}