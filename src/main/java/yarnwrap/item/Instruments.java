package yarnwrap.item;
public class Instruments { public net.minecraft.item.Instruments wrapperContained; public Instruments(net.minecraft.item.Instruments wrapperContained) { this.wrapperContained = wrapperContained; }

// public int GOAT_HORN_RANGE() { return wrapperContained.GOAT_HORN_RANGE; }
// public void GOAT_HORN_RANGE(int value) { wrapperContained.GOAT_HORN_RANGE = value; }
public static int GOAT_HORN_RANGE() { return net.minecraft.item.Instruments.GOAT_HORN_RANGE; }
// public static void GOAT_HORN_RANGE(int value, ) { net.minecraft.item.Instruments.GOAT_HORN_RANGE = value; }

// public float GOAT_HORN_USE_DURATION() { return wrapperContained.GOAT_HORN_USE_DURATION; }
// public void GOAT_HORN_USE_DURATION(float value) { wrapperContained.GOAT_HORN_USE_DURATION = value; }
public static float GOAT_HORN_USE_DURATION() { return net.minecraft.item.Instruments.GOAT_HORN_USE_DURATION; }
// public static void GOAT_HORN_USE_DURATION(float value, ) { net.minecraft.item.Instruments.GOAT_HORN_USE_DURATION = value; }

// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.item.Instruments.bootstrap(registry.wrapperContained); }
// // public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.item.Instruments.of(id)); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,yarnwrap.registry.entry.RegistryEntry sound,float useDuration,float range) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,sound.wrapperContained,useDuration,range); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,yarnwrap.registry.entry.RegistryEntry sound,float useDuration,float range, ) { net.minecraft.item.Instruments.register(registry.wrapperContained,key.wrapperContained,sound.wrapperContained,useDuration,range); }

}