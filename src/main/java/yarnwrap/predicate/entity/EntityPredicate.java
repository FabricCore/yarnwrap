package yarnwrap.predicate.entity;
public class EntityPredicate { public net.minecraft.predicate.entity.EntityPredicate wrapperContained; public EntityPredicate(net.minecraft.predicate.entity.EntityPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional type() { return wrapperContained.type; }
// public void type(java.util.Optional value) { wrapperContained.type = value; }
// public static java.util.Optional type() { return net.minecraft.predicate.entity.EntityPredicate.type; }
// public static void type(java.util.Optional value, ) { net.minecraft.predicate.entity.EntityPredicate.type = value; }

// public java.util.Optional distance() { return wrapperContained.distance; }
// public void distance(java.util.Optional value) { wrapperContained.distance = value; }
// public static java.util.Optional distance() { return net.minecraft.predicate.entity.EntityPredicate.distance; }
// public static void distance(java.util.Optional value, ) { net.minecraft.predicate.entity.EntityPredicate.distance = value; }

// public java.util.Optional typeSpecific() { return wrapperContained.typeSpecific; }
// public void typeSpecific(java.util.Optional value) { wrapperContained.typeSpecific = value; }
// public static java.util.Optional typeSpecific() { return net.minecraft.predicate.entity.EntityPredicate.typeSpecific; }
// public static void typeSpecific(java.util.Optional value, ) { net.minecraft.predicate.entity.EntityPredicate.typeSpecific = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.EntityPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntityPredicate.CODEC = value; }

// public com.mojang.serialization.Codec LOOT_CONTEXT_PREDICATE_CODEC() { return wrapperContained.LOOT_CONTEXT_PREDICATE_CODEC; }
// public void LOOT_CONTEXT_PREDICATE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LOOT_CONTEXT_PREDICATE_CODEC = value; }
public static com.mojang.serialization.Codec LOOT_CONTEXT_PREDICATE_CODEC() { return net.minecraft.predicate.entity.EntityPredicate.LOOT_CONTEXT_PREDICATE_CODEC; }
// public static void LOOT_CONTEXT_PREDICATE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntityPredicate.LOOT_CONTEXT_PREDICATE_CODEC = value; }

// public java.util.Optional type() { return wrapperContained.type(); }
// // public static java.util.Optional type() { return net.minecraft.predicate.entity.EntityPredicate.type(); }
// public java.util.Optional distance() { return wrapperContained.distance(); }
// // public static java.util.Optional distance() { return net.minecraft.predicate.entity.EntityPredicate.distance(); }
// public java.util.Optional typeSpecific() { return wrapperContained.typeSpecific(); }
// // public static java.util.Optional typeSpecific() { return net.minecraft.predicate.entity.EntityPredicate.typeSpecific(); }
// public yarnwrap.loot.context.LootContext createAdvancementEntityLootContext(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity target) { return new yarnwrap.loot.context.LootContext(wrapperContained.createAdvancementEntityLootContext(player.wrapperContained,target.wrapperContained)); }
// public static yarnwrap.loot.context.LootContext createAdvancementEntityLootContext(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity target, ) { return new yarnwrap.loot.context.LootContext(net.minecraft.predicate.entity.EntityPredicate.createAdvancementEntityLootContext(player.wrapperContained,target.wrapperContained)); }
// public boolean method_37227(yarnwrap.server.world.ServerWorld entityx) { return wrapperContained.method_37227(entityx.wrapperContained); }
// public static boolean method_37227(yarnwrap.server.world.ServerWorld entityx, ) { return net.minecraft.predicate.entity.EntityPredicate.method_37227(entityx.wrapperContained); }
// public yarnwrap.predicate.entity.LootContextPredicate asLootContextPredicate(yarnwrap.predicate.entity.EntityPredicate predicate) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.asLootContextPredicate(predicate.wrapperContained)); }
// public static yarnwrap.predicate.entity.LootContextPredicate asLootContextPredicate(yarnwrap.predicate.entity.EntityPredicate predicate, ) { return new yarnwrap.predicate.entity.LootContextPredicate(net.minecraft.predicate.entity.EntityPredicate.asLootContextPredicate(predicate.wrapperContained)); }
// public yarnwrap.predicate.entity.LootContextPredicate contextPredicateFromEntityPredicate(Object builder) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.contextPredicateFromEntityPredicate(builder)); }
// public static yarnwrap.predicate.entity.LootContextPredicate contextPredicateFromEntityPredicate(Object builder, ) { return new yarnwrap.predicate.entity.LootContextPredicate(net.minecraft.predicate.entity.EntityPredicate.contextPredicateFromEntityPredicate(builder)); }
// public com.mojang.serialization.Codec method_53135(com.mojang.serialization.Codec entityPredicateCodec) { return wrapperContained.method_53135(entityPredicateCodec); }
// public static com.mojang.serialization.Codec method_53135(com.mojang.serialization.Codec entityPredicateCodec, ) { return net.minecraft.predicate.entity.EntityPredicate.method_53135(entityPredicateCodec); }
// public com.mojang.datafixers.kinds.App method_53136(com.mojang.serialization.Codec instance) { return wrapperContained.method_53136(instance); }
// public static com.mojang.datafixers.kinds.App method_53136(com.mojang.serialization.Codec instance, ) { return net.minecraft.predicate.entity.EntityPredicate.method_53136(instance); }
// public java.util.Optional contextPredicateFromEntityPredicate(java.util.Optional entityPredicate) { return wrapperContained.contextPredicateFromEntityPredicate(entityPredicate); }
// public static java.util.Optional contextPredicateFromEntityPredicate(java.util.Optional entityPredicate, ) { return net.minecraft.predicate.entity.EntityPredicate.contextPredicateFromEntityPredicate(entityPredicate); }
// public java.util.List contextPredicateFromEntityPredicates(Object[] builders) { return wrapperContained.contextPredicateFromEntityPredicates(builders); }
// public static java.util.List contextPredicateFromEntityPredicates(Object[] builders, ) { return net.minecraft.predicate.entity.EntityPredicate.contextPredicateFromEntityPredicates(builders); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public static boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.entity.EntityPredicate.test(world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
public boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity) { return wrapperContained.test(player.wrapperContained,entity.wrapperContained); }
// public static boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.entity.EntityPredicate.test(player.wrapperContained,entity.wrapperContained); }

}