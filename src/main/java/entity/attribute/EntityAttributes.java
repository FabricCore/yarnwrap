package yarnwrap.entity.attribute;
public class EntityAttributes { public net.minecraft.entity.attribute.EntityAttributes wrapperContained; public EntityAttributes(net.minecraft.entity.attribute.EntityAttributes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,yarnwrap.entity.attribute.EntityAttribute attribute) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,attribute.wrapperContained)); }
public yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }

}