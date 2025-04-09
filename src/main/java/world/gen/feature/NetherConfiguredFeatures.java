package yarnwrap.world.gen.feature;
public class NetherConfiguredFeatures { public net.minecraft.world.gen.feature.NetherConfiguredFeatures wrapperContained; public NetherConfiguredFeatures(net.minecraft.world.gen.feature.NetherConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey DELTA() { return new yarnwrap.registry.RegistryKey(wrapperContained.DELTA); }
public yarnwrap.registry.RegistryKey SMALL_BASALT_COLUMNS() { return new yarnwrap.registry.RegistryKey(wrapperContained.SMALL_BASALT_COLUMNS); }
public yarnwrap.registry.RegistryKey SMALL_BASALT_COLUMNS_TEMP() { return new yarnwrap.registry.RegistryKey(wrapperContained.SMALL_BASALT_COLUMNS_TEMP); }
public yarnwrap.registry.RegistryKey BASALT_BLOBS() { return new yarnwrap.registry.RegistryKey(wrapperContained.BASALT_BLOBS); }
public yarnwrap.registry.RegistryKey BLACKSTONE_BLOBS() { return new yarnwrap.registry.RegistryKey(wrapperContained.BLACKSTONE_BLOBS); }
public yarnwrap.registry.RegistryKey GLOWSTONE_EXTRA() { return new yarnwrap.registry.RegistryKey(wrapperContained.GLOWSTONE_EXTRA); }
public yarnwrap.registry.RegistryKey CRIMSON_FOREST_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.CRIMSON_FOREST_VEGETATION); }
public yarnwrap.registry.RegistryKey CRIMSON_FOREST_VEGETATION_BONEMEAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.CRIMSON_FOREST_VEGETATION_BONEMEAL); }
public yarnwrap.registry.RegistryKey WARPED_FOREST_VEGETATION() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARPED_FOREST_VEGETATION); }
public yarnwrap.registry.RegistryKey WARPED_FOREST_VEGETATION_BONEMEAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARPED_FOREST_VEGETATION_BONEMEAL); }
public yarnwrap.registry.RegistryKey NETHER_SPROUTS() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER_SPROUTS); }
public yarnwrap.registry.RegistryKey NETHER_SPROUTS_BONEMEAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.NETHER_SPROUTS_BONEMEAL); }
public yarnwrap.registry.RegistryKey TWISTING_VINES() { return new yarnwrap.registry.RegistryKey(wrapperContained.TWISTING_VINES); }
public yarnwrap.registry.RegistryKey TWISTING_VINES_BONEMEAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.TWISTING_VINES_BONEMEAL); }
public yarnwrap.registry.RegistryKey WEEPING_VINES() { return new yarnwrap.registry.RegistryKey(wrapperContained.WEEPING_VINES); }
public yarnwrap.registry.RegistryKey PATCH_CRIMSON_ROOTS() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_CRIMSON_ROOTS); }
public yarnwrap.registry.RegistryKey BASALT_PILLAR() { return new yarnwrap.registry.RegistryKey(wrapperContained.BASALT_PILLAR); }
public yarnwrap.registry.RegistryKey SPRING_LAVA_NETHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRING_LAVA_NETHER); }
public yarnwrap.registry.RegistryKey SPRING_NETHER_CLOSED() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRING_NETHER_CLOSED); }
public yarnwrap.registry.RegistryKey SPRING_NETHER_OPEN() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRING_NETHER_OPEN); }
public yarnwrap.registry.RegistryKey PATCH_FIRE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_FIRE); }
public yarnwrap.registry.RegistryKey PATCH_SOUL_FIRE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_SOUL_FIRE); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}