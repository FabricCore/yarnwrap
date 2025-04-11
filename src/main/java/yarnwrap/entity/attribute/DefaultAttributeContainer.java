package yarnwrap.entity.attribute;
public class DefaultAttributeContainer { public net.minecraft.entity.attribute.DefaultAttributeContainer wrapperContained; public DefaultAttributeContainer(net.minecraft.entity.attribute.DefaultAttributeContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map instances() { return wrapperContained.instances; }
// public void instances(java.util.Map value) { wrapperContained.instances = value; }
public Object builder() { return wrapperContained.builder(); }
public double getValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getValue(attribute.wrapperContained); }
public yarnwrap.entity.attribute.EntityAttributeInstance createOverride(java.util.function.Consumer updateCallback,yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.createOverride(updateCallback,attribute.wrapperContained)); }
public double getBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getBaseValue(attribute.wrapperContained); }
// public yarnwrap.entity.attribute.EntityAttributeInstance require(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.require(attribute.wrapperContained)); }
public double getModifierValue(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.getModifierValue(attribute.wrapperContained,id.wrapperContained); }
public boolean hasModifier(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.hasModifier(attribute.wrapperContained,id.wrapperContained); }
public boolean has(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.has(attribute.wrapperContained); }

}