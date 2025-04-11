package yarnwrap.world.biome.source;
public class BiomeSources { public net.minecraft.world.biome.source.BiomeSources wrapperContained; public BiomeSources(net.minecraft.world.biome.source.BiomeSources wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }

}