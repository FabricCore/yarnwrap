package yarnwrap.entity;
public class Variants { public net.minecraft.entity.Variants wrapperContained; public Variants(net.minecraft.entity.Variants wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String VARIANT_NBT_KEY() { return wrapperContained.VARIANT_NBT_KEY; }
// public void VARIANT_NBT_KEY(java.lang.String value) { wrapperContained.VARIANT_NBT_KEY = value; }
public static java.lang.String VARIANT_NBT_KEY() { return net.minecraft.entity.Variants.VARIANT_NBT_KEY; }
// public static void VARIANT_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.Variants.VARIANT_NBT_KEY = value; }

// public yarnwrap.registry.RegistryKey method_67174(yarnwrap.registry.RegistryKey id) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_67174(id.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_67174(yarnwrap.registry.RegistryKey id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.Variants.method_67174(id.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry getOrDefaultOrThrow(yarnwrap.registry.DynamicRegistryManager registries,yarnwrap.registry.RegistryKey variantKey) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getOrDefaultOrThrow(registries.wrapperContained,variantKey.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry getOrDefaultOrThrow(yarnwrap.registry.DynamicRegistryManager registries,yarnwrap.registry.RegistryKey variantKey, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.Variants.getOrDefaultOrThrow(registries.wrapperContained,variantKey.wrapperContained)); }
// public void method_67176(yarnwrap.storage.WriteView key) { wrapperContained.method_67176(key.wrapperContained); }
// public static void method_67176(yarnwrap.storage.WriteView key, ) { net.minecraft.entity.Variants.method_67176(key.wrapperContained); }
// public void writeVariantToNbt(yarnwrap.storage.WriteView view,yarnwrap.registry.entry.RegistryEntry variantEntry) { wrapperContained.writeVariantToNbt(view.wrapperContained,variantEntry.wrapperContained); }
// public static void writeVariantToNbt(yarnwrap.storage.WriteView view,yarnwrap.registry.entry.RegistryEntry variantEntry, ) { net.minecraft.entity.Variants.writeVariantToNbt(view.wrapperContained,variantEntry.wrapperContained); }
// public java.util.Optional readVariantFromNbt(yarnwrap.storage.ReadView view,yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.readVariantFromNbt(view.wrapperContained,registryRef.wrapperContained); }
// public static java.util.Optional readVariantFromNbt(yarnwrap.storage.ReadView view,yarnwrap.registry.RegistryKey registryRef, ) { return net.minecraft.entity.Variants.readVariantFromNbt(view.wrapperContained,registryRef.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry getDefaultOrThrow(yarnwrap.registry.DynamicRegistryManager registries,yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDefaultOrThrow(registries.wrapperContained,registryRef.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry getDefaultOrThrow(yarnwrap.registry.DynamicRegistryManager registries,yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.Variants.getDefaultOrThrow(registries.wrapperContained,registryRef.wrapperContained)); }

}