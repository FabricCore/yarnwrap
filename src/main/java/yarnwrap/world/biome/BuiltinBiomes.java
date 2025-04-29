package yarnwrap.world.biome;
public class BuiltinBiomes { public net.minecraft.world.biome.BuiltinBiomes wrapperContained; public BuiltinBiomes(net.minecraft.world.biome.BuiltinBiomes wrapperContained) { this.wrapperContained = wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable biomeRegisterable) { wrapperContained.bootstrap(biomeRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable biomeRegisterable, ) { net.minecraft.world.biome.BuiltinBiomes.bootstrap(biomeRegisterable.wrapperContained); }

}