package yarnwrap.structure;
public class AncientCityGenerator { public net.minecraft.structure.AncientCityGenerator wrapperContained; public AncientCityGenerator(net.minecraft.structure.AncientCityGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey CITY_CENTER() { return new yarnwrap.registry.RegistryKey(wrapperContained.CITY_CENTER); }
// public void CITY_CENTER(yarnwrap.registry.RegistryKey value) { wrapperContained.CITY_CENTER = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey CITY_CENTER() { return new yarnwrap.registry.RegistryKey(net.minecraft.structure.AncientCityGenerator.CITY_CENTER); }
// public static void CITY_CENTER(yarnwrap.registry.RegistryKey value, ) { net.minecraft.structure.AncientCityGenerator.CITY_CENTER = value.wrapperContained; }

// public void bootstrap(yarnwrap.registry.Registerable poolRegisterable) { wrapperContained.bootstrap(poolRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable poolRegisterable, ) { net.minecraft.structure.AncientCityGenerator.bootstrap(poolRegisterable.wrapperContained); }

}