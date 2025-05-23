package yarnwrap.entity.attribute;
public class AttributeContainer { public net.minecraft.entity.attribute.AttributeContainer wrapperContained; public AttributeContainer(net.minecraft.entity.attribute.AttributeContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map custom() { return wrapperContained.custom; }
// public void custom(java.util.Map value) { wrapperContained.custom = value; }
// public static java.util.Map custom() { return net.minecraft.entity.attribute.AttributeContainer.custom; }
// public static void custom(java.util.Map value, ) { net.minecraft.entity.attribute.AttributeContainer.custom = value; }

// public yarnwrap.entity.attribute.DefaultAttributeContainer defaultAttributes() { return new yarnwrap.entity.attribute.DefaultAttributeContainer(wrapperContained.defaultAttributes); }
// public void defaultAttributes(yarnwrap.entity.attribute.DefaultAttributeContainer value) { wrapperContained.defaultAttributes = value.wrapperContained; }
// public static yarnwrap.entity.attribute.DefaultAttributeContainer defaultAttributes() { return new yarnwrap.entity.attribute.DefaultAttributeContainer(net.minecraft.entity.attribute.AttributeContainer.defaultAttributes); }
// public static void defaultAttributes(yarnwrap.entity.attribute.DefaultAttributeContainer value, ) { net.minecraft.entity.attribute.AttributeContainer.defaultAttributes = value.wrapperContained; }

// public java.util.Set tracked() { return wrapperContained.tracked; }
// public void tracked(java.util.Set value) { wrapperContained.tracked = value; }
// public static java.util.Set tracked() { return net.minecraft.entity.attribute.AttributeContainer.tracked; }
// public static void tracked(java.util.Set value, ) { net.minecraft.entity.attribute.AttributeContainer.tracked = value; }

// public java.util.Set pendingUpdate() { return wrapperContained.pendingUpdate; }
// public void pendingUpdate(java.util.Set value) { wrapperContained.pendingUpdate = value; }
// public static java.util.Set pendingUpdate() { return net.minecraft.entity.attribute.AttributeContainer.pendingUpdate; }
// public static void pendingUpdate(java.util.Set value, ) { net.minecraft.entity.attribute.AttributeContainer.pendingUpdate = value; }

public AttributeContainer(yarnwrap.entity.attribute.DefaultAttributeContainer defaultAttributes) { this.wrapperContained = new net.minecraft.entity.attribute.AttributeContainer(defaultAttributes.wrapperContained); }
// public void updateTrackedStatus(yarnwrap.entity.attribute.EntityAttributeInstance instance) { wrapperContained.updateTrackedStatus(instance.wrapperContained); }
// public static void updateTrackedStatus(yarnwrap.entity.attribute.EntityAttributeInstance instance, ) { net.minecraft.entity.attribute.AttributeContainer.updateTrackedStatus(instance.wrapperContained); }
public void setFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.setFrom(other.wrapperContained); }
// public static void setFrom(yarnwrap.entity.attribute.AttributeContainer other, ) { net.minecraft.entity.attribute.AttributeContainer.setFrom(other.wrapperContained); }
public java.util.Collection getAttributesToSend() { return wrapperContained.getAttributesToSend(); }
// public static java.util.Collection getAttributesToSend() { return net.minecraft.entity.attribute.AttributeContainer.getAttributesToSend(); }
public double getValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getValue(attribute.wrapperContained); }
// public static double getValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.AttributeContainer.getValue(attribute.wrapperContained); }
// public void method_26853(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance) { wrapperContained.method_26853(attributeInstance.wrapperContained); }
// public static void method_26853(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance, ) { net.minecraft.entity.attribute.AttributeContainer.method_26853(attributeInstance.wrapperContained); }
public double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getBaseValue(attribute.wrapperContained); }
// public static double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.AttributeContainer.getBaseValue(attribute.wrapperContained); }
// public boolean method_26857(yarnwrap.entity.attribute.EntityAttributeInstance attribute) { return wrapperContained.method_26857(attribute.wrapperContained); }
// public static boolean method_26857(yarnwrap.entity.attribute.EntityAttributeInstance attribute, ) { return net.minecraft.entity.attribute.AttributeContainer.method_26857(attribute.wrapperContained); }
public yarnwrap.entity.attribute.EntityAttributeInstance getCustomInstance(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.getCustomInstance(attribute.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeInstance getCustomInstance(yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.attribute.EntityAttributeInstance(net.minecraft.entity.attribute.AttributeContainer.getCustomInstance(attribute.wrapperContained)); }
public boolean hasModifierForAttribute(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.hasModifierForAttribute(attribute.wrapperContained,id.wrapperContained); }
// public static boolean hasModifierForAttribute(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.AttributeContainer.hasModifierForAttribute(attribute.wrapperContained,id.wrapperContained); }
public boolean hasAttribute(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.hasAttribute(attribute.wrapperContained); }
// public static boolean hasAttribute(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.AttributeContainer.hasAttribute(attribute.wrapperContained); }
public double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
// public static double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.AttributeContainer.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
// public yarnwrap.entity.attribute.EntityAttributeInstance method_55698(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.method_55698(attribute.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeInstance method_55698(yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.attribute.EntityAttributeInstance(net.minecraft.entity.attribute.AttributeContainer.method_55698(attribute.wrapperContained)); }
// public void method_59931(yarnwrap.entity.attribute.EntityAttributeInstance modifier) { wrapperContained.method_59931(modifier.wrapperContained); }
// public static void method_59931(yarnwrap.entity.attribute.EntityAttributeInstance modifier, ) { net.minecraft.entity.attribute.AttributeContainer.method_59931(modifier.wrapperContained); }
public void addTemporaryModifiers(com.google.common.collect.Multimap modifiersMap) { wrapperContained.addTemporaryModifiers(modifiersMap); }
// public static void addTemporaryModifiers(com.google.common.collect.Multimap modifiersMap, ) { net.minecraft.entity.attribute.AttributeContainer.addTemporaryModifiers(modifiersMap); }
// public void method_59933(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.method_59933(attribute.wrapperContained,modifier.wrapperContained); }
// public static void method_59933(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.attribute.AttributeContainer.method_59933(attribute.wrapperContained,modifier.wrapperContained); }
// public void method_59934(yarnwrap.registry.entry.RegistryEntry attribute,java.util.Collection modifiers) { wrapperContained.method_59934(attribute.wrapperContained,modifiers); }
// public static void method_59934(yarnwrap.registry.entry.RegistryEntry attribute,java.util.Collection modifiers, ) { net.minecraft.entity.attribute.AttributeContainer.method_59934(attribute.wrapperContained,modifiers); }
public void removeModifiers(com.google.common.collect.Multimap modifiersMap) { wrapperContained.removeModifiers(modifiersMap); }
// public static void removeModifiers(com.google.common.collect.Multimap modifiersMap, ) { net.minecraft.entity.attribute.AttributeContainer.removeModifiers(modifiersMap); }
public java.util.Set getTracked() { return wrapperContained.getTracked(); }
// public static java.util.Set getTracked() { return net.minecraft.entity.attribute.AttributeContainer.getTracked(); }
public java.util.Set getPendingUpdate() { return wrapperContained.getPendingUpdate(); }
// public static java.util.Set getPendingUpdate() { return net.minecraft.entity.attribute.AttributeContainer.getPendingUpdate(); }
// public void method_60613(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance) { wrapperContained.method_60613(attributeInstance.wrapperContained); }
// public static void method_60613(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance, ) { net.minecraft.entity.attribute.AttributeContainer.method_60613(attributeInstance.wrapperContained); }
public void setBaseFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.setBaseFrom(other.wrapperContained); }
// public static void setBaseFrom(yarnwrap.entity.attribute.AttributeContainer other, ) { net.minecraft.entity.attribute.AttributeContainer.setBaseFrom(other.wrapperContained); }
// public void method_61436(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance) { wrapperContained.method_61436(attributeInstance.wrapperContained); }
// public static void method_61436(yarnwrap.entity.attribute.EntityAttributeInstance attributeInstance, ) { net.minecraft.entity.attribute.AttributeContainer.method_61436(attributeInstance.wrapperContained); }
public void addPersistentModifiersFrom(yarnwrap.entity.attribute.AttributeContainer other) { wrapperContained.addPersistentModifiersFrom(other.wrapperContained); }
// public static void addPersistentModifiersFrom(yarnwrap.entity.attribute.AttributeContainer other, ) { net.minecraft.entity.attribute.AttributeContainer.addPersistentModifiersFrom(other.wrapperContained); }
public boolean resetToBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.resetToBaseValue(attribute.wrapperContained); }
// public static boolean resetToBaseValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.AttributeContainer.resetToBaseValue(attribute.wrapperContained); }
// public void unpack(java.util.List packedList) { wrapperContained.unpack(packedList); }
// public static void unpack(java.util.List packedList, ) { net.minecraft.entity.attribute.AttributeContainer.unpack(packedList); }
// public java.util.List pack() { return wrapperContained.pack(); }
// public static java.util.List pack() { return net.minecraft.entity.attribute.AttributeContainer.pack(); }

}