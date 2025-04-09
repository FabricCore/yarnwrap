package yarnwrap.loot.condition;
public class EntityPropertiesLootCondition { public net.minecraft.loot.condition.EntityPropertiesLootCondition wrapperContained; public EntityPropertiesLootCondition(net.minecraft.loot.condition.EntityPropertiesLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object entity() { return wrapperContained.entity(); }
// public Object create(Object entity) { return wrapperContained.create(entity); }
// public Object builder(Object entity,yarnwrap.predicate.entity.EntityPredicate predicate) { return wrapperContained.builder(entity,predicate.wrapperContained); }
// public Object builder(Object entity,Object predicateBuilder) { return wrapperContained.builder(entity,predicateBuilder); }

}