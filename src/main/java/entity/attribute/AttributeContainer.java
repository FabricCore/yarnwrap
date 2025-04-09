package yarnwrap.entity.attribute;
public class AttributeContainer { public net.minecraft.entity.attribute.AttributeContainer wrapperContained; public AttributeContainer(net.minecraft.entity.attribute.AttributeContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map custom() { return wrapperContained.custom; }
// public yarnwrap.entity.attribute.DefaultAttributeContainer fallback() { return new yarnwrap.entity.attribute.DefaultAttributeContainer(wrapperContained.fallback); }
// public java.util.Set tracked() { return wrapperContained.tracked; }
// public java.util.Set pendingUpdate() { return wrapperContained.pendingUpdate; }
// public void updateTrackedStatus(yarnwrap.entity.attribute.EntityAttributeInstance instance) { wrapperContained.updateTrackedStatus(instance.wrapperContained); }
public void setFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.setFrom(other.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtList nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public java.util.Collection getAttributesToSend() { return wrapperContained.getAttributesToSend(); }
public double getValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getValue(attribute.wrapperContained); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
public double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getBaseValue(attribute.wrapperContained); }
public yarnwrap.entity.attribute.EntityAttributeInstance getCustomInstance(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.getCustomInstance(attribute.wrapperContained)); }
public boolean hasModifierForAttribute(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.hasModifierForAttribute(attribute.wrapperContained,id.wrapperContained); }
public boolean hasAttribute(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.hasAttribute(attribute.wrapperContained); }
public double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
public void addTemporaryModifiers(com.google.common.collect.Multimap modifiersMap) { wrapperContained.addTemporaryModifiers(modifiersMap); }
public void removeModifiers(com.google.common.collect.Multimap modifiersMap) { wrapperContained.removeModifiers(modifiersMap); }
public java.util.Set getTracked() { return wrapperContained.getTracked(); }
public java.util.Set getPendingUpdate() { return wrapperContained.getPendingUpdate(); }
public void setBaseFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.setBaseFrom(other.wrapperContained); }

}