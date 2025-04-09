package yarnwrap.predicate.entity;
public class EntitySubPredicateTypes { public net.minecraft.predicate.entity.EntitySubPredicateTypes wrapperContained; public EntitySubPredicateTypes(net.minecraft.predicate.entity.EntitySubPredicateTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.predicate.entity.EntitySubPredicate catVariant(yarnwrap.registry.entry.RegistryEntry catVariant) { return new yarnwrap.predicate.entity.EntitySubPredicate(wrapperContained.catVariant(catVariant.wrapperContained)); }
public yarnwrap.predicate.entity.EntitySubPredicate frogVariant(yarnwrap.registry.entry.RegistryEntry frogVariant) { return new yarnwrap.predicate.entity.EntitySubPredicate(wrapperContained.frogVariant(frogVariant.wrapperContained)); }
// public Object register(java.lang.String id,Object type) { return wrapperContained.register(id,type); }
// public com.mojang.serialization.MapCodec register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return wrapperContained.register(id,codec); }
public com.mojang.serialization.MapCodec getDefault(yarnwrap.registry.Registry registry) { return wrapperContained.getDefault(registry.wrapperContained); }
// // public Object register(java.lang.String id,Object type) { return wrapperContained.register(id,type); }
public yarnwrap.predicate.entity.EntitySubPredicate wolfVariant(yarnwrap.registry.entry.RegistryEntryList wolfVariant) { return new yarnwrap.predicate.entity.EntitySubPredicate(wrapperContained.wolfVariant(wolfVariant.wrapperContained)); }

}