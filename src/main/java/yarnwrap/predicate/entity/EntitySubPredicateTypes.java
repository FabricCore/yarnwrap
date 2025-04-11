package yarnwrap.predicate.entity;
public class EntitySubPredicateTypes { public net.minecraft.predicate.entity.EntitySubPredicateTypes wrapperContained; public EntitySubPredicateTypes(net.minecraft.predicate.entity.EntitySubPredicateTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional method_43100(yarnwrap.entity.Entity entity) { return wrapperContained.method_43100(entity.wrapperContained); }
// public java.util.Optional method_43102(yarnwrap.entity.Entity entity) { return wrapperContained.method_43102(entity.wrapperContained); }
// public java.util.Optional method_47829(yarnwrap.entity.Entity entity) { return wrapperContained.method_47829(entity.wrapperContained); }
// public java.util.Optional method_47830(yarnwrap.entity.Entity entity) { return wrapperContained.method_47830(entity.wrapperContained); }
// public java.util.Optional method_47831(yarnwrap.entity.Entity entity) { return wrapperContained.method_47831(entity.wrapperContained); }
// public java.util.Optional method_47832(yarnwrap.entity.Entity entity) { return wrapperContained.method_47832(entity.wrapperContained); }
// public java.util.Optional method_47833(yarnwrap.entity.Entity entity) { return wrapperContained.method_47833(entity.wrapperContained); }
// public java.util.Optional method_47834(yarnwrap.entity.Entity entity) { return wrapperContained.method_47834(entity.wrapperContained); }
// public java.util.Optional method_47835(yarnwrap.entity.Entity entity) { return wrapperContained.method_47835(entity.wrapperContained); }
// public java.util.Optional method_47836(yarnwrap.entity.Entity entity) { return wrapperContained.method_47836(entity.wrapperContained); }
// public java.util.Optional method_47837(yarnwrap.entity.Entity entity) { return wrapperContained.method_47837(entity.wrapperContained); }
// public java.util.Optional method_47838(yarnwrap.entity.Entity entity) { return wrapperContained.method_47838(entity.wrapperContained); }
// public java.util.Optional method_47839(yarnwrap.entity.Entity entity) { return wrapperContained.method_47839(entity.wrapperContained); }
public yarnwrap.predicate.entity.EntitySubPredicate catVariant(yarnwrap.registry.entry.RegistryEntry catVariant) { return new yarnwrap.predicate.entity.EntitySubPredicate(wrapperContained.catVariant(catVariant.wrapperContained)); }
public yarnwrap.predicate.entity.EntitySubPredicate frogVariant(yarnwrap.registry.entry.RegistryEntry frogVariant) { return new yarnwrap.predicate.entity.EntitySubPredicate(wrapperContained.frogVariant(frogVariant.wrapperContained)); }
// public Object register(java.lang.String id,Object type) { return wrapperContained.register(id,type); }
// public com.mojang.serialization.MapCodec register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return wrapperContained.register(id,codec); }
public com.mojang.serialization.MapCodec getDefault(yarnwrap.registry.Registry registry) { return wrapperContained.getDefault(registry.wrapperContained); }
// public java.util.Optional method_58351(yarnwrap.entity.Entity entity) { return wrapperContained.method_58351(entity.wrapperContained); }
// // public Object register(java.lang.String id,Object type) { return wrapperContained.register(id,type); }
public yarnwrap.predicate.entity.EntitySubPredicate wolfVariant(yarnwrap.registry.entry.RegistryEntryList wolfVariant) { return new yarnwrap.predicate.entity.EntitySubPredicate(wrapperContained.wolfVariant(wolfVariant.wrapperContained)); }

}