package yarnwrap.entity.attribute;
public class AttributeContainer { public net.minecraft.entity.attribute.AttributeContainer wrapperContained; public AttributeContainer(net.minecraft.entity.attribute.AttributeContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map custom() { return wrapperContained.custom; }
// public void custom(java.util.Map value) { wrapperContained.custom = value; }
// public yarnwrap.entity.attribute.DefaultAttributeContainer fallback() { return new yarnwrap.entity.attribute.DefaultAttributeContainer(wrapperContained.fallback); }
// public void fallback(yarnwrap.entity.attribute.DefaultAttributeContainer value) { wrapperContained.fallback = value.wrapperContained; }
// public java.util.Set tracked() { return wrapperContained.tracked; }
// public void tracked(java.util.Set value) { wrapperContained.tracked = value; }
// public java.util.Set pendingUpdate() { return wrapperContained.pendingUpdate; }
// public void pendingUpdate(java.util.Set value) { wrapperContained.pendingUpdate = value; }
public AttributeContainer(yarnwrap.entity.attribute.DefaultAttributeContainer defaultAttributes) { this.wrapperContained = new net.minecraft.entity.attribute.AttributeContainer(defaultAttributes.wrapperContained); }
// public void updateTrackedStatus(yarnwrap.entity.attribute.EntityAttributeInstance instance) { wrapperContained.updateTrackedStatus(instance.wrapperContained); }
public void setFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.setFrom(other.wrapperContained); }
// public void method_26849(yarnwrap.nbt.NbtCompound attribute) { wrapperContained.method_26849(attribute.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtList nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public java.util.Collection getAttributesToSend() { return wrapperContained.getAttributesToSend(); }
public double getValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getValue(attribute.wrapperContained); }
// public void method_26853(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance) { wrapperContained.method_26853(attributeInstance.wrapperContained); }
public yarnwrap.nbt.NbtList toNbt() { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt()); }
public double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getBaseValue(attribute.wrapperContained); }
// public boolean method_26857(yarnwrap.entity.attribute.EntityAttributeInstance attribute) { return wrapperContained.method_26857(attribute.wrapperContained); }
public yarnwrap.entity.attribute.EntityAttributeInstance getCustomInstance(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.getCustomInstance(attribute.wrapperContained)); }
public boolean hasModifierForAttribute(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.hasModifierForAttribute(attribute.wrapperContained,id.wrapperContained); }
public boolean hasAttribute(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.hasAttribute(attribute.wrapperContained); }
public double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
// public yarnwrap.entity.attribute.EntityAttributeInstance method_55698(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.method_55698(attribute.wrapperContained)); }
// public void method_59931(yarnwrap.entity.attribute.EntityAttributeInstance modifier) { wrapperContained.method_59931(modifier.wrapperContained); }
public void addTemporaryModifiers(com.google.common.collect.Multimap modifiersMap) { wrapperContained.addTemporaryModifiers(modifiersMap); }
// public void method_59933(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.method_59933(attribute.wrapperContained,modifier.wrapperContained); }
// public void method_59934(yarnwrap.registry.entry.RegistryEntry attribute,java.util.Collection modifiers) { wrapperContained.method_59934(attribute.wrapperContained,modifiers); }
public void removeModifiers(com.google.common.collect.Multimap modifiersMap) { wrapperContained.removeModifiers(modifiersMap); }
public java.util.Set getTracked() { return wrapperContained.getTracked(); }
public java.util.Set getPendingUpdate() { return wrapperContained.getPendingUpdate(); }
// public void method_60613(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance) { wrapperContained.method_60613(attributeInstance.wrapperContained); }
public void setBaseFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.setBaseFrom(other.wrapperContained); }

}