package yarnwrap.world.gen.feature;
public class TreePlacedFeatures { public net.minecraft.world.gen.feature.TreePlacedFeatures wrapperContained; public TreePlacedFeatures(net.minecraft.world.gen.feature.TreePlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey FANCY_OAK_BEES() { return new yarnwrap.registry.RegistryKey(wrapperContained.FANCY_OAK_BEES); }
public yarnwrap.registry.RegistryKey CRIMSON_FUNGI() { return new yarnwrap.registry.RegistryKey(wrapperContained.CRIMSON_FUNGI); }
public yarnwrap.registry.RegistryKey WARPED_FUNGI() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARPED_FUNGI); }
public yarnwrap.registry.RegistryKey OAK_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.OAK_CHECKED); }
public yarnwrap.registry.RegistryKey DARK_OAK_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.DARK_OAK_CHECKED); }
public yarnwrap.registry.RegistryKey BIRCH_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIRCH_CHECKED); }
public yarnwrap.registry.RegistryKey ACACIA_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.ACACIA_CHECKED); }
public yarnwrap.registry.RegistryKey SPRUCE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRUCE_CHECKED); }
public yarnwrap.registry.RegistryKey PINE_ON_SNOW() { return new yarnwrap.registry.RegistryKey(wrapperContained.PINE_ON_SNOW); }
public yarnwrap.registry.RegistryKey SPRUCE_ON_SNOW() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRUCE_ON_SNOW); }
public yarnwrap.registry.RegistryKey PINE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.PINE_CHECKED); }
public yarnwrap.registry.RegistryKey JUNGLE_TREE() { return new yarnwrap.registry.RegistryKey(wrapperContained.JUNGLE_TREE); }
public yarnwrap.registry.RegistryKey FANCY_OAK_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.FANCY_OAK_CHECKED); }
public yarnwrap.registry.RegistryKey MEGA_JUNGLE_TREE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.MEGA_JUNGLE_TREE_CHECKED); }
public yarnwrap.registry.RegistryKey MEGA_SPRUCE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.MEGA_SPRUCE_CHECKED); }
public yarnwrap.registry.RegistryKey MEGA_PINE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.MEGA_PINE_CHECKED); }
public yarnwrap.registry.RegistryKey JUNGLE_BUSH() { return new yarnwrap.registry.RegistryKey(wrapperContained.JUNGLE_BUSH); }
public yarnwrap.registry.RegistryKey SUPER_BIRCH_BEES_0002() { return new yarnwrap.registry.RegistryKey(wrapperContained.SUPER_BIRCH_BEES_0002); }
public yarnwrap.registry.RegistryKey SUPER_BIRCH_BEES() { return new yarnwrap.registry.RegistryKey(wrapperContained.SUPER_BIRCH_BEES); }
public yarnwrap.registry.RegistryKey OAK_BEES_0002() { return new yarnwrap.registry.RegistryKey(wrapperContained.OAK_BEES_0002); }
public yarnwrap.registry.RegistryKey OAK_BEES_002() { return new yarnwrap.registry.RegistryKey(wrapperContained.OAK_BEES_002); }
public yarnwrap.registry.RegistryKey BIRCH_BEES_0002() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIRCH_BEES_0002); }
public yarnwrap.registry.RegistryKey BIRCH_BEES_002() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIRCH_BEES_002); }
public yarnwrap.registry.RegistryKey FANCY_OAK_BEES_0002() { return new yarnwrap.registry.RegistryKey(wrapperContained.FANCY_OAK_BEES_0002); }
public yarnwrap.registry.RegistryKey FANCY_OAK_BEES_002() { return new yarnwrap.registry.RegistryKey(wrapperContained.FANCY_OAK_BEES_002); }
public yarnwrap.registry.RegistryKey MANGROVE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.MANGROVE_CHECKED); }
public yarnwrap.registry.RegistryKey TALL_MANGROVE_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.TALL_MANGROVE_CHECKED); }
public yarnwrap.registry.RegistryKey CHERRY_BEES_005() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHERRY_BEES_005); }
public yarnwrap.registry.RegistryKey CHERRY_CHECKED() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHERRY_CHECKED); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}