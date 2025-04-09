package yarnwrap.world.gen.feature;
public class PileConfiguredFeatures { public net.minecraft.world.gen.feature.PileConfiguredFeatures wrapperContained; public PileConfiguredFeatures(net.minecraft.world.gen.feature.PileConfiguredFeatures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey PILE_HAY() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_HAY); }
public yarnwrap.registry.RegistryKey PILE_MELON() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_MELON); }
public yarnwrap.registry.RegistryKey PILE_SNOW() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_SNOW); }
public yarnwrap.registry.RegistryKey PILE_ICE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_ICE); }
public yarnwrap.registry.RegistryKey PILE_PUMPKIN() { return new yarnwrap.registry.RegistryKey(wrapperContained.PILE_PUMPKIN); }
public void bootstrap(yarnwrap.registry.Registerable featureRegisterable) { wrapperContained.bootstrap(featureRegisterable.wrapperContained); }

}