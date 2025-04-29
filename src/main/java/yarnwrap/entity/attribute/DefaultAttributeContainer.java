package yarnwrap.entity.attribute;
public class DefaultAttributeContainer { public net.minecraft.entity.attribute.DefaultAttributeContainer wrapperContained; public DefaultAttributeContainer(net.minecraft.entity.attribute.DefaultAttributeContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map instances() { return wrapperContained.instances; }
// public void instances(java.util.Map value) { wrapperContained.instances = value; }
// public static java.util.Map instances() { return net.minecraft.entity.attribute.DefaultAttributeContainer.instances; }
// public static void instances(java.util.Map value, ) { net.minecraft.entity.attribute.DefaultAttributeContainer.instances = value; }

// public DefaultAttributeContainer(java.util.Map instances) { this.wrapperContained = new net.minecraft.entity.attribute.DefaultAttributeContainer(instances); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.entity.attribute.DefaultAttributeContainer.builder(); }
public double getValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getValue(attribute.wrapperContained); }
// public static double getValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.DefaultAttributeContainer.getValue(attribute.wrapperContained); }
public yarnwrap.entity.attribute.EntityAttributeInstance createOverride(java.util.function.Consumer updateCallback,yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.createOverride(updateCallback,attribute.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeInstance createOverride(java.util.function.Consumer updateCallback,yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.attribute.EntityAttributeInstance(net.minecraft.entity.attribute.DefaultAttributeContainer.createOverride(updateCallback,attribute.wrapperContained)); }
public double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getBaseValue(attribute.wrapperContained); }
// public static double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.DefaultAttributeContainer.getBaseValue(attribute.wrapperContained); }
// public yarnwrap.entity.attribute.EntityAttributeInstance require(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.require(attribute.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeInstance require(yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.attribute.EntityAttributeInstance(net.minecraft.entity.attribute.DefaultAttributeContainer.require(attribute.wrapperContained)); }
public double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
// public static double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.DefaultAttributeContainer.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
public boolean hasModifier(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.hasModifier(attribute.wrapperContained,id.wrapperContained); }
// public static boolean hasModifier(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id, ) { return net.minecraft.entity.attribute.DefaultAttributeContainer.hasModifier(attribute.wrapperContained,id.wrapperContained); }
public boolean has(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.has(attribute.wrapperContained); }
// public static boolean has(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.attribute.DefaultAttributeContainer.has(attribute.wrapperContained); }

}