package yarnwrap.world.biome.source;
public class SeedMixer { public net.minecraft.world.biome.source.SeedMixer wrapperContained; public SeedMixer(net.minecraft.world.biome.source.SeedMixer wrapperContained) { this.wrapperContained = wrapperContained; }

public long mixSeed(long seed,long salt) { return wrapperContained.mixSeed(seed,salt); }

}