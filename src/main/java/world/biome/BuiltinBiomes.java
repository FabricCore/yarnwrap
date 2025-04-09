package yarnwrap.world.biome;
public class BuiltinBiomes { public net.minecraft.world.biome.BuiltinBiomes wrapperContained; public BuiltinBiomes(net.minecraft.world.biome.BuiltinBiomes wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable biomeRegisterable) { wrapperContained.bootstrap(biomeRegisterable.wrapperContained); }

}