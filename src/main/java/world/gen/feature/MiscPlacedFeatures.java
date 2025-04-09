package yarnwrap.world.gen.feature;
public class MiscPlacedFeatures { public net.minecraft.world.gen.feature.MiscPlacedFeatures wrapperContained; public MiscPlacedFeatures(net.minecraft.world.gen.feature.MiscPlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey ICE_SPIKE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ICE_SPIKE); }
public yarnwrap.registry.RegistryKey ICE_PATCH() { return new yarnwrap.registry.RegistryKey(wrapperContained.ICE_PATCH); }
public yarnwrap.registry.RegistryKey FOREST_ROCK() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOREST_ROCK); }
public yarnwrap.registry.RegistryKey ICEBERG_PACKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ICEBERG_PACKED); }
public yarnwrap.registry.RegistryKey ICEBERG_BLUE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ICEBERG_BLUE); }
public yarnwrap.registry.RegistryKey BLUE_ICE() { return new yarnwrap.registry.RegistryKey(wrapperContained.BLUE_ICE); }
public yarnwrap.registry.RegistryKey LAKE_LAVA_UNDERGROUND() { return new yarnwrap.registry.RegistryKey(wrapperContained.LAKE_LAVA_UNDERGROUND); }
public yarnwrap.registry.RegistryKey LAKE_LAVA_SURFACE() { return new yarnwrap.registry.RegistryKey(wrapperContained.LAKE_LAVA_SURFACE); }
public yarnwrap.registry.RegistryKey DISK_CLAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.DISK_CLAY); }
public yarnwrap.registry.RegistryKey DISK_GRAVEL() { return new yarnwrap.registry.RegistryKey(wrapperContained.DISK_GRAVEL); }
public yarnwrap.registry.RegistryKey DISK_SAND() { return new yarnwrap.registry.RegistryKey(wrapperContained.DISK_SAND); }
public yarnwrap.registry.RegistryKey FREEZE_TOP_LAYER() { return new yarnwrap.registry.RegistryKey(wrapperContained.FREEZE_TOP_LAYER); }
public yarnwrap.registry.RegistryKey VOID_START_PLATFORM() { return new yarnwrap.registry.RegistryKey(wrapperContained.VOID_START_PLATFORM); }
public yarnwrap.registry.RegistryKey DESERT_WELL() { return new yarnwrap.registry.RegistryKey(wrapperContained.DESERT_WELL); }
public yarnwrap.registry.RegistryKey SPRING_LAVA() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRING_LAVA); }
public yarnwrap.registry.RegistryKey SPRING_LAVA_FROZEN() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRING_LAVA_FROZEN); }
public yarnwrap.registry.RegistryKey SPRING_WATER() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRING_WATER); }
public yarnwrap.registry.RegistryKey DISK_GRASS() { return new yarnwrap.registry.RegistryKey(wrapperContained.DISK_GRASS); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}