package yarnwrap.loot.condition;
public class EntityPropertiesLootCondition { public net.minecraft.loot.condition.EntityPropertiesLootCondition wrapperContained; public EntityPropertiesLootCondition(net.minecraft.loot.condition.EntityPropertiesLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
// // public void entity(Object value) { wrapperContained.entity = value; }
// // public static Object entity() { return net.minecraft.loot.condition.EntityPropertiesLootCondition.entity; }
// // public static void entity(Object value, ) { net.minecraft.loot.condition.EntityPropertiesLootCondition.entity = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.EntityPropertiesLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.EntityPropertiesLootCondition.CODEC = value; }

// public EntityPropertiesLootCondition(java.util.Optional entity) { this.wrapperContained = new net.minecraft.loot.condition.EntityPropertiesLootCondition(entity); }
// public Object entity() { return wrapperContained.entity(); }
// // public static Object entity() { return net.minecraft.loot.condition.EntityPropertiesLootCondition.entity(); }
// public Object create(Object entity) { return wrapperContained.create(entity); }
// public static Object create(Object entity, ) { return net.minecraft.loot.condition.EntityPropertiesLootCondition.create(entity); }
// public Object builder(Object entity,yarnwrap.predicate.entity.EntityPredicate predicate) { return wrapperContained.builder(entity,predicate.wrapperContained); }
// public static Object builder(Object entity,yarnwrap.predicate.entity.EntityPredicate predicate, ) { return net.minecraft.loot.condition.EntityPropertiesLootCondition.builder(entity,predicate.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53423(Object instance) { return wrapperContained.method_53423(instance); }
// public static com.mojang.datafixers.kinds.App method_53423(Object instance, ) { return net.minecraft.loot.condition.EntityPropertiesLootCondition.method_53423(instance); }
// public Object builder(Object entity,Object predicateBuilder) { return wrapperContained.builder(entity,predicateBuilder); }
// public static Object builder(Object entity,Object predicateBuilder, ) { return net.minecraft.loot.condition.EntityPropertiesLootCondition.builder(entity,predicateBuilder); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.EntityPropertiesLootCondition.test(context); }

}