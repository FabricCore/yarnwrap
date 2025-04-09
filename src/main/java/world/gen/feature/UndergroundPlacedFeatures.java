package yarnwrap.world.gen.feature;
public class UndergroundPlacedFeatures { public net.minecraft.world.gen.feature.UndergroundPlacedFeatures wrapperContained; public UndergroundPlacedFeatures(net.minecraft.world.gen.feature.UndergroundPlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey MONSTER_ROOM() { return new yarnwrap.registry.RegistryKey(wrapperContained.MONSTER_ROOM); }
public yarnwrap.registry.RegistryKey MONSTER_ROOM_DEEP() { return new yarnwrap.registry.RegistryKey(wrapperContained.MONSTER_ROOM_DEEP); }
public yarnwrap.registry.RegistryKey FOSSIL_UPPER() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOSSIL_UPPER); }
public yarnwrap.registry.RegistryKey FOSSIL_LOWER() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOSSIL_LOWER); }
public yarnwrap.registry.RegistryKey DRIPSTONE_CLUSTER() { return new yarnwrap.registry.RegistryKey(wrapperContained.DRIPSTONE_CLUSTER); }
public yarnwrap.registry.RegistryKey LARGE_DRIPSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.LARGE_DRIPSTONE); }
public yarnwrap.registry.RegistryKey POINTED_DRIPSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.POINTED_DRIPSTONE); }
public yarnwrap.registry.RegistryKey UNDERWATER_MAGMA() { return new yarnwrap.registry.RegistryKey(wrapperContained.UNDERWATER_MAGMA); }
public yarnwrap.registry.RegistryKey GLOW_LICHEN() { return new yarnwrap.registry.RegistryKey(wrapperContained.GLOW_LICHEN); }
public yarnwrap.registry.RegistryKey ROOTED_AZALEA_TREE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ROOTED_AZALEA_TREE); }
public yarnwrap.registry.RegistryKey CAVE_VINES() { return new yarnwrap.registry.RegistryKey(wrapperContained.CAVE_VINES); }
public yarnwrap.registry.RegistryKey LUSH_CAVES_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.LUSH_CAVES_VEGETATION); }
public yarnwrap.registry.RegistryKey LUSH_CAVES_CLAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.LUSH_CAVES_CLAY); }
public yarnwrap.registry.RegistryKey LUSH_CAVES_CEILING_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.LUSH_CAVES_CEILING_VEGETATION); }
public yarnwrap.registry.RegistryKey SPORE_BLOSSOM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPORE_BLOSSOM); }
public yarnwrap.registry.RegistryKey CLASSIC_VINES_CAVE_FEATURE() { return new yarnwrap.registry.RegistryKey(wrapperContained.CLASSIC_VINES_CAVE_FEATURE); }
public yarnwrap.registry.RegistryKey AMETHYST_GEODE() { return new yarnwrap.registry.RegistryKey(wrapperContained.AMETHYST_GEODE); }
public yarnwrap.registry.RegistryKey SCULK_PATCH_DEEP_DARK() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCULK_PATCH_DEEP_DARK); }
public yarnwrap.registry.RegistryKey SCULK_VEIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCULK_VEIN); }
public yarnwrap.registry.RegistryKey SCULK_PATCH_ANCIENT_CITY() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCULK_PATCH_ANCIENT_CITY); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}