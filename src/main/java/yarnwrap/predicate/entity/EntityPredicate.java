package yarnwrap.predicate.entity;
public class EntityPredicate { public net.minecraft.predicate.entity.EntityPredicate wrapperContained; public EntityPredicate(net.minecraft.predicate.entity.EntityPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional type() { return wrapperContained.type; }
// public void type(java.util.Optional value) { wrapperContained.type = value; }
// public java.util.Optional distance() { return wrapperContained.distance; }
// public void distance(java.util.Optional value) { wrapperContained.distance = value; }
// public java.util.Optional typeSpecific() { return wrapperContained.typeSpecific; }
// public void typeSpecific(java.util.Optional value) { wrapperContained.typeSpecific = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec LOOT_CONTEXT_PREDICATE_CODEC() { return wrapperContained.LOOT_CONTEXT_PREDICATE_CODEC; }
// public void LOOT_CONTEXT_PREDICATE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LOOT_CONTEXT_PREDICATE_CODEC = value; }
// public java.util.Optional type() { return wrapperContained.type(); }
// public java.util.Optional distance() { return wrapperContained.distance(); }
// public java.util.Optional typeSpecific() { return wrapperContained.typeSpecific(); }
public yarnwrap.loot.context.LootContext createAdvancementEntityLootContext(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity target) { return new yarnwrap.loot.context.LootContext(wrapperContained.createAdvancementEntityLootContext(player.wrapperContained,target.wrapperContained)); }
public yarnwrap.predicate.entity.LootContextPredicate asLootContextPredicate(yarnwrap.predicate.entity.EntityPredicate predicate) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.asLootContextPredicate(predicate.wrapperContained)); }
// public yarnwrap.predicate.entity.LootContextPredicate contextPredicateFromEntityPredicate(Object builder) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.contextPredicateFromEntityPredicate(builder)); }
public java.util.Optional contextPredicateFromEntityPredicate(java.util.Optional entityPredicate) { return wrapperContained.contextPredicateFromEntityPredicate(entityPredicate); }
// public java.util.List contextPredicateFromEntityPredicates(Object[] builders) { return wrapperContained.contextPredicateFromEntityPredicates(builders); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
public boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity) { return wrapperContained.test(player.wrapperContained,entity.wrapperContained); }

}