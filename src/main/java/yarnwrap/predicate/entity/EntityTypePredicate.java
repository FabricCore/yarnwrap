package yarnwrap.predicate.entity;
public class EntityTypePredicate { public net.minecraft.predicate.entity.EntityTypePredicate wrapperContained; public EntityTypePredicate(net.minecraft.predicate.entity.EntityTypePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.EntityTypePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntityTypePredicate.CODEC = value; }

public boolean matches(yarnwrap.entity.EntityType type) { return wrapperContained.matches(type.wrapperContained); }
// public static boolean matches(yarnwrap.entity.EntityType type, ) { return net.minecraft.predicate.entity.EntityTypePredicate.matches(type.wrapperContained); }
// public yarnwrap.predicate.entity.EntityTypePredicate create(yarnwrap.registry.RegistryEntryLookup entityTypeRegistry,yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.predicate.entity.EntityTypePredicate(wrapperContained.create(entityTypeRegistry.wrapperContained,tag.wrapperContained)); }
// public static yarnwrap.predicate.entity.EntityTypePredicate create(yarnwrap.registry.RegistryEntryLookup entityTypeRegistry,yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.predicate.entity.EntityTypePredicate(net.minecraft.predicate.entity.EntityTypePredicate.create(entityTypeRegistry.wrapperContained,tag.wrapperContained)); }
// public yarnwrap.predicate.entity.EntityTypePredicate create(yarnwrap.registry.RegistryEntryLookup entityTypeRegistry,yarnwrap.entity.EntityType type) { return new yarnwrap.predicate.entity.EntityTypePredicate(wrapperContained.create(entityTypeRegistry.wrapperContained,type.wrapperContained)); }
// public static yarnwrap.predicate.entity.EntityTypePredicate create(yarnwrap.registry.RegistryEntryLookup entityTypeRegistry,yarnwrap.entity.EntityType type, ) { return new yarnwrap.predicate.entity.EntityTypePredicate(net.minecraft.predicate.entity.EntityTypePredicate.create(entityTypeRegistry.wrapperContained,type.wrapperContained)); }

}