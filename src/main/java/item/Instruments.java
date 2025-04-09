package yarnwrap.item;
public class Instruments { public net.minecraft.item.Instruments wrapperContained; public Instruments(net.minecraft.item.Instruments wrapperContained) { this.wrapperContained = wrapperContained; }

public int GOAT_HORN_RANGE() { return wrapperContained.GOAT_HORN_RANGE; }
public int GOAT_HORN_USE_DURATION() { return wrapperContained.GOAT_HORN_USE_DURATION; }
// public yarnwrap.item.Instrument registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.item.Instrument(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// // public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }

}