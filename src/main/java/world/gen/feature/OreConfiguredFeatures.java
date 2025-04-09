package yarnwrap.world.gen.feature;
public class OreConfiguredFeatures { public net.minecraft.world.gen.feature.OreConfiguredFeatures wrapperContained; public OreConfiguredFeatures(net.minecraft.world.gen.feature.OreConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey ORE_IRON_SMALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_IRON_SMALL); }
public yarnwrap.registry.RegistryKey ORE_GOLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_GOLD); }
public yarnwrap.registry.RegistryKey ORE_GOLD_BURIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_GOLD_BURIED); }
public yarnwrap.registry.RegistryKey ORE_REDSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_REDSTONE); }
public yarnwrap.registry.RegistryKey ORE_DIAMOND_SMALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_DIAMOND_SMALL); }
public yarnwrap.registry.RegistryKey ORE_DIAMOND_LARGE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_DIAMOND_LARGE); }
public yarnwrap.registry.RegistryKey ORE_DIAMOND_BURIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_DIAMOND_BURIED); }
public yarnwrap.registry.RegistryKey ORE_LAPIS() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_LAPIS); }
public yarnwrap.registry.RegistryKey ORE_LAPIS_BURIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_LAPIS_BURIED); }
public yarnwrap.registry.RegistryKey ORE_INFESTED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_INFESTED); }
public yarnwrap.registry.RegistryKey ORE_EMERALD() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_EMERALD); }
public yarnwrap.registry.RegistryKey ORE_ANCIENT_DEBRIS_LARGE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_ANCIENT_DEBRIS_LARGE); }
public yarnwrap.registry.RegistryKey ORE_ANCIENT_DEBRIS_SMALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_ANCIENT_DEBRIS_SMALL); }
public yarnwrap.registry.RegistryKey ORE_COPPER_SMALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_COPPER_SMALL); }
public yarnwrap.registry.RegistryKey ORE_COPPER_LARGE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_COPPER_LARGE); }
public yarnwrap.registry.RegistryKey ORE_CLAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_CLAY); }
public yarnwrap.registry.RegistryKey ORE_MAGMA() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_MAGMA); }
public yarnwrap.registry.RegistryKey ORE_SOUL_SAND() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_SOUL_SAND); }
public yarnwrap.registry.RegistryKey ORE_NETHER_GOLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_NETHER_GOLD); }
public yarnwrap.registry.RegistryKey ORE_QUARTZ() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_QUARTZ); }
public yarnwrap.registry.RegistryKey ORE_GRAVEL_NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_GRAVEL_NETHER); }
public yarnwrap.registry.RegistryKey ORE_BLACKSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_BLACKSTONE); }
public yarnwrap.registry.RegistryKey ORE_DIRT() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_DIRT); }
public yarnwrap.registry.RegistryKey ORE_GRAVEL() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_GRAVEL); }
public yarnwrap.registry.RegistryKey ORE_GRANITE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_GRANITE); }
public yarnwrap.registry.RegistryKey ORE_DIORITE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_DIORITE); }
public yarnwrap.registry.RegistryKey ORE_ANDESITE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_ANDESITE); }
public yarnwrap.registry.RegistryKey ORE_TUFF() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_TUFF); }
public yarnwrap.registry.RegistryKey ORE_COAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_COAL); }
public yarnwrap.registry.RegistryKey ORE_COAL_BURIED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_COAL_BURIED); }
public yarnwrap.registry.RegistryKey ORE_IRON() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_IRON); }
public yarnwrap.registry.RegistryKey ORE_DIAMOND_MEDIUM() { return new yarnwrap.registry.RegistryKey(wrapperContained.ORE_DIAMOND_MEDIUM); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}