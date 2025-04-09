package yarnwrap.predicate.entity;
public class EntityTypePredicate { public net.minecraft.predicate.entity.EntityTypePredicate wrapperContained; public EntityTypePredicate(net.minecraft.predicate.entity.EntityTypePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean matches(yarnwrap.entity.EntityType type) { return wrapperContained.matches(type.wrapperContained); }
public yarnwrap.predicate.entity.EntityTypePredicate create(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.predicate.entity.EntityTypePredicate(wrapperContained.create(tag.wrapperContained)); }
public yarnwrap.predicate.entity.EntityTypePredicate create(yarnwrap.entity.EntityType type) { return new yarnwrap.predicate.entity.EntityTypePredicate(wrapperContained.create(type.wrapperContained)); }

}