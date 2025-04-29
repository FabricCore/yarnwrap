package yarnwrap.entity.attribute;
public class DefaultAttributeRegistry { public net.minecraft.entity.attribute.DefaultAttributeRegistry wrapperContained; public DefaultAttributeRegistry(net.minecraft.entity.attribute.DefaultAttributeRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.attribute.DefaultAttributeRegistry.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.attribute.DefaultAttributeRegistry.LOGGER = value; }

// public java.util.Map DEFAULT_ATTRIBUTE_REGISTRY() { return wrapperContained.DEFAULT_ATTRIBUTE_REGISTRY; }
// public void DEFAULT_ATTRIBUTE_REGISTRY(java.util.Map value) { wrapperContained.DEFAULT_ATTRIBUTE_REGISTRY = value; }
// public static java.util.Map DEFAULT_ATTRIBUTE_REGISTRY() { return net.minecraft.entity.attribute.DefaultAttributeRegistry.DEFAULT_ATTRIBUTE_REGISTRY; }
// public static void DEFAULT_ATTRIBUTE_REGISTRY(java.util.Map value, ) { net.minecraft.entity.attribute.DefaultAttributeRegistry.DEFAULT_ATTRIBUTE_REGISTRY = value; }

// public void checkMissing() { wrapperContained.checkMissing(); }
public static void checkMissing() { net.minecraft.entity.attribute.DefaultAttributeRegistry.checkMissing(); }
// public yarnwrap.entity.attribute.DefaultAttributeContainer get(yarnwrap.entity.EntityType type) { return new yarnwrap.entity.attribute.DefaultAttributeContainer(wrapperContained.get(type.wrapperContained)); }
// public static yarnwrap.entity.attribute.DefaultAttributeContainer get(yarnwrap.entity.EntityType type, ) { return new yarnwrap.entity.attribute.DefaultAttributeContainer(net.minecraft.entity.attribute.DefaultAttributeRegistry.get(type.wrapperContained)); }
// public void method_26874(yarnwrap.util.Identifier id) { wrapperContained.method_26874(id.wrapperContained); }
// public static void method_26874(yarnwrap.util.Identifier id, ) { net.minecraft.entity.attribute.DefaultAttributeRegistry.method_26874(id.wrapperContained); }
// public boolean hasDefinitionFor(yarnwrap.entity.EntityType type) { return wrapperContained.hasDefinitionFor(type.wrapperContained); }
// public static boolean hasDefinitionFor(yarnwrap.entity.EntityType type, ) { return net.minecraft.entity.attribute.DefaultAttributeRegistry.hasDefinitionFor(type.wrapperContained); }
// public boolean method_26876(yarnwrap.entity.EntityType entityType) { return wrapperContained.method_26876(entityType.wrapperContained); }
// public static boolean method_26876(yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.attribute.DefaultAttributeRegistry.method_26876(entityType.wrapperContained); }
// public boolean method_26877(yarnwrap.entity.EntityType entityType) { return wrapperContained.method_26877(entityType.wrapperContained); }
// public static boolean method_26877(yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.attribute.DefaultAttributeRegistry.method_26877(entityType.wrapperContained); }

}