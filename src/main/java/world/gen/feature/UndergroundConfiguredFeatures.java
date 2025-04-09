package yarnwrap.world.gen.feature;
public class UndergroundConfiguredFeatures { public net.minecraft.world.gen.feature.UndergroundConfiguredFeatures wrapperContained; public UndergroundConfiguredFeatures(net.minecraft.world.gen.feature.UndergroundConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey MONSTER_ROOM() { return new yarnwrap.registry.RegistryKey(wrapperContained.MONSTER_ROOM); }
public yarnwrap.registry.RegistryKey FOSSIL_COAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOSSIL_COAL); }
public yarnwrap.registry.RegistryKey FOSSIL_DIAMONDS() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOSSIL_DIAMONDS); }
public yarnwrap.registry.RegistryKey DRIPSTONE_CLUSTER() { return new yarnwrap.registry.RegistryKey(wrapperContained.DRIPSTONE_CLUSTER); }
public yarnwrap.registry.RegistryKey LARGE_DRIPSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.LARGE_DRIPSTONE); }
public yarnwrap.registry.RegistryKey POINTED_DRIPSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.POINTED_DRIPSTONE); }
public yarnwrap.registry.RegistryKey UNDERWATER_MAGMA() { return new yarnwrap.registry.RegistryKey(wrapperContained.UNDERWATER_MAGMA); }
public yarnwrap.registry.RegistryKey GLOW_LICHEN() { return new yarnwrap.registry.RegistryKey(wrapperContained.GLOW_LICHEN); }
public yarnwrap.registry.RegistryKey ROOTED_AZALEA_TREE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ROOTED_AZALEA_TREE); }
public yarnwrap.registry.RegistryKey CAVE_VINE() { return new yarnwrap.registry.RegistryKey(wrapperContained.CAVE_VINE); }
public yarnwrap.registry.RegistryKey CAVE_VINE_IN_MOSS() { return new yarnwrap.registry.RegistryKey(wrapperContained.CAVE_VINE_IN_MOSS); }
public yarnwrap.registry.RegistryKey MOSS_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOSS_VEGETATION); }
public yarnwrap.registry.RegistryKey MOSS_PATCH() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOSS_PATCH); }
public yarnwrap.registry.RegistryKey MOSS_PATCH_BONEMEAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOSS_PATCH_BONEMEAL); }
public yarnwrap.registry.RegistryKey DRIPLEAF() { return new yarnwrap.registry.RegistryKey(wrapperContained.DRIPLEAF); }
public yarnwrap.registry.RegistryKey CLAY_WITH_DRIPLEAVES() { return new yarnwrap.registry.RegistryKey(wrapperContained.CLAY_WITH_DRIPLEAVES); }
public yarnwrap.registry.RegistryKey CLAY_POOL_WITH_DRIPLEAVES() { return new yarnwrap.registry.RegistryKey(wrapperContained.CLAY_POOL_WITH_DRIPLEAVES); }
public yarnwrap.registry.RegistryKey LUSH_CAVES_CLAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.LUSH_CAVES_CLAY); }
public yarnwrap.registry.RegistryKey MOSS_PATCH_CEILING() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOSS_PATCH_CEILING); }
public yarnwrap.registry.RegistryKey SPORE_BLOSSOM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPORE_BLOSSOM); }
public yarnwrap.registry.RegistryKey AMETHYST_GEODE() { return new yarnwrap.registry.RegistryKey(wrapperContained.AMETHYST_GEODE); }
public yarnwrap.registry.RegistryKey SCULK_PATCH_DEEP_DARK() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCULK_PATCH_DEEP_DARK); }
public yarnwrap.registry.RegistryKey SCULK_VEIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCULK_VEIN); }
public yarnwrap.registry.RegistryKey SCULK_PATCH_ANCIENT_CITY() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCULK_PATCH_ANCIENT_CITY); }
// public yarnwrap.registry.entry.RegistryEntry createSmallDripleafFeature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.createSmallDripleafFeature()); }
// public yarnwrap.registry.entry.RegistryEntry createBigDripleafFeature(yarnwrap.util.math.Direction direction) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.createBigDripleafFeature(direction.wrapperContained)); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}