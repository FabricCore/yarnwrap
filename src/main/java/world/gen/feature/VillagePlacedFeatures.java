package yarnwrap.world.gen.feature;
public class VillagePlacedFeatures { public net.minecraft.world.gen.feature.VillagePlacedFeatures wrapperContained; public VillagePlacedFeatures(net.minecraft.world.gen.feature.VillagePlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey PILE_HAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_HAY); }
public yarnwrap.registry.RegistryKey PILE_MELON() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_MELON); }
public yarnwrap.registry.RegistryKey PILE_SNOW() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_SNOW); }
public yarnwrap.registry.RegistryKey PILE_ICE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_ICE); }
public yarnwrap.registry.RegistryKey PILE_PUMPKIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_PUMPKIN); }
public yarnwrap.registry.RegistryKey OAK() { return new yarnwrap.registry.RegistryKey(wrapperContained.OAK); }
public yarnwrap.registry.RegistryKey ACACIA() { return new yarnwrap.registry.RegistryKey(wrapperContained.ACACIA); }
public yarnwrap.registry.RegistryKey SPRUCE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRUCE); }
public yarnwrap.registry.RegistryKey PINE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PINE); }
public yarnwrap.registry.RegistryKey PATCH_CACTUS() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_CACTUS); }
public yarnwrap.registry.RegistryKey FLOWER_PLAIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLOWER_PLAIN); }
public yarnwrap.registry.RegistryKey PATCH_TAIGA_GRASS() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_TAIGA_GRASS); }
public yarnwrap.registry.RegistryKey PATCH_BERRY_BUSH() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_BERRY_BUSH); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}