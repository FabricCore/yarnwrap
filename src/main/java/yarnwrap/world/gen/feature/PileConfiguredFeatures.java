package yarnwrap.world.gen.feature;
public class PileConfiguredFeatures { public net.minecraft.world.gen.feature.PileConfiguredFeatures wrapperContained; public PileConfiguredFeatures(net.minecraft.world.gen.feature.PileConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

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
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}