package yarnwrap.entity.passive;
public class CowEntity { public net.minecraft.entity.passive.CowEntity wrapperContained; public CowEntity(net.minecraft.entity.passive.CowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.CowEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.CowEntity.VARIANT = value.wrapperContained; }

public void setVariant(yarnwrap.registry.entry.RegistryEntry variant) { wrapperContained.setVariant(variant.wrapperContained); }
// public static void setVariant(yarnwrap.registry.entry.RegistryEntry variant, ) { net.minecraft.entity.passive.CowEntity.setVariant(variant.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getVariant()); }
// public static yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.passive.CowEntity.getVariant()); }

}