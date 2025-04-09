package yarnwrap.structure;
public class AncientCityGenerator { public net.minecraft.structure.AncientCityGenerator wrapperContained; public AncientCityGenerator(net.minecraft.structure.AncientCityGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey CITY_CENTER() { return new yarnwrap.registry.RegistryKey(wrapperContained.CITY_CENTER); }
public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }

}