package yarnwrap.entity.attribute;
public class DefaultAttributeRegistry { public net.minecraft.entity.attribute.DefaultAttributeRegistry wrapperContained; public DefaultAttributeRegistry(net.minecraft.entity.attribute.DefaultAttributeRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map DEFAULT_ATTRIBUTE_REGISTRY() { return wrapperContained.DEFAULT_ATTRIBUTE_REGISTRY; }
// public void DEFAULT_ATTRIBUTE_REGISTRY(java.util.Map value) { wrapperContained.DEFAULT_ATTRIBUTE_REGISTRY = value; }
public void checkMissing() { wrapperContained.checkMissing(); }
public yarnwrap.entity.attribute.DefaultAttributeContainer get(yarnwrap.entity.EntityType type) { return new yarnwrap.entity.attribute.DefaultAttributeContainer(wrapperContained.get(type.wrapperContained)); }
public boolean hasDefinitionFor(yarnwrap.entity.EntityType type) { return wrapperContained.hasDefinitionFor(type.wrapperContained); }

}