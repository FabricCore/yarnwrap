package yarnwrap.world.gen.feature;
public class VillagePlacedFeatures { public net.minecraft.world.gen.feature.VillagePlacedFeatures wrapperContained; public VillagePlacedFeatures(net.minecraft.world.gen.feature.VillagePlacedFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey PILE_HAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_HAY); }
// public void PILE_HAY(yarnwrap.registry.RegistryKey value) { wrapperContained.PILE_HAY = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PILE_MELON() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_MELON); }
// public void PILE_MELON(yarnwrap.registry.RegistryKey value) { wrapperContained.PILE_MELON = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PILE_SNOW() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_SNOW); }
// public void PILE_SNOW(yarnwrap.registry.RegistryKey value) { wrapperContained.PILE_SNOW = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PILE_ICE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_ICE); }
// public void PILE_ICE(yarnwrap.registry.RegistryKey value) { wrapperContained.PILE_ICE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PILE_PUMPKIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_PUMPKIN); }
// public void PILE_PUMPKIN(yarnwrap.registry.RegistryKey value) { wrapperContained.PILE_PUMPKIN = value.wrapperContained; }
public yarnwrap.registry.RegistryKey OAK() { return new yarnwrap.registry.RegistryKey(wrapperContained.OAK); }
// public void OAK(yarnwrap.registry.RegistryKey value) { wrapperContained.OAK = value.wrapperContained; }
public yarnwrap.registry.RegistryKey ACACIA() { return new yarnwrap.registry.RegistryKey(wrapperContained.ACACIA); }
// public void ACACIA(yarnwrap.registry.RegistryKey value) { wrapperContained.ACACIA = value.wrapperContained; }
public yarnwrap.registry.RegistryKey SPRUCE() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPRUCE); }
// public void SPRUCE(yarnwrap.registry.RegistryKey value) { wrapperContained.SPRUCE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PINE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PINE); }
// public void PINE(yarnwrap.registry.RegistryKey value) { wrapperContained.PINE = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PATCH_CACTUS() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_CACTUS); }
// public void PATCH_CACTUS(yarnwrap.registry.RegistryKey value) { wrapperContained.PATCH_CACTUS = value.wrapperContained; }
public yarnwrap.registry.RegistryKey FLOWER_PLAIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLOWER_PLAIN); }
// public void FLOWER_PLAIN(yarnwrap.registry.RegistryKey value) { wrapperContained.FLOWER_PLAIN = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PATCH_TAIGA_GRASS() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_TAIGA_GRASS); }
// public void PATCH_TAIGA_GRASS(yarnwrap.registry.RegistryKey value) { wrapperContained.PATCH_TAIGA_GRASS = value.wrapperContained; }
public yarnwrap.registry.RegistryKey PATCH_BERRY_BUSH() { return new yarnwrap.registry.RegistryKey(wrapperContained.PATCH_BERRY_BUSH); }
// public void PATCH_BERRY_BUSH(yarnwrap.registry.RegistryKey value) { wrapperContained.PATCH_BERRY_BUSH = value.wrapperContained; }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}