package yarnwrap.item;
public class Instruments { public net.minecraft.item.Instruments wrapperContained; public Instruments(net.minecraft.item.Instruments wrapperContained) { this.wrapperContained = wrapperContained; }

// public int GOAT_HORN_RANGE() { return wrapperContained.GOAT_HORN_RANGE; }
// public void GOAT_HORN_RANGE(int value) { wrapperContained.GOAT_HORN_RANGE = value; }
public static int GOAT_HORN_RANGE() { return net.minecraft.item.Instruments.GOAT_HORN_RANGE; }
// public static void GOAT_HORN_RANGE(int value, ) { net.minecraft.item.Instruments.GOAT_HORN_RANGE = value; }

// public int GOAT_HORN_USE_DURATION() { return wrapperContained.GOAT_HORN_USE_DURATION; }
// public void GOAT_HORN_USE_DURATION(int value) { wrapperContained.GOAT_HORN_USE_DURATION = value; }
public static int GOAT_HORN_USE_DURATION() { return net.minecraft.item.Instruments.GOAT_HORN_USE_DURATION; }
// public static void GOAT_HORN_USE_DURATION(int value, ) { net.minecraft.item.Instruments.GOAT_HORN_USE_DURATION = value; }

// public yarnwrap.item.Instrument registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.item.Instrument(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.item.Instrument registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.item.Instrument(net.minecraft.item.Instruments.registerAndGetDefault(registry.wrapperContained)); }
// // public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.item.Instruments.of(id)); }

}