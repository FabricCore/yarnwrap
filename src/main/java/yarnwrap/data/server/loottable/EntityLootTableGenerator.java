package yarnwrap.data.server.loottable;
public class EntityLootTableGenerator { public net.minecraft.data.server.loottable.EntityLootTableGenerator wrapperContained; public EntityLootTableGenerator(net.minecraft.data.server.loottable.EntityLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set ENTITY_TYPES_IN_MISC_GROUP_TO_CHECK() { return wrapperContained.ENTITY_TYPES_IN_MISC_GROUP_TO_CHECK; }
// public void ENTITY_TYPES_IN_MISC_GROUP_TO_CHECK(java.util.Set value) { wrapperContained.ENTITY_TYPES_IN_MISC_GROUP_TO_CHECK = value; }
// public java.util.Map lootTables() { return wrapperContained.lootTables; }
// public void lootTables(java.util.Map value) { wrapperContained.lootTables = value; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public yarnwrap.resource.featuretoggle.FeatureSet featureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSet); }
// public void featureSet(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.featureSet = value.wrapperContained; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
public void generate() { wrapperContained.generate(); }
// public boolean shouldCheck(yarnwrap.entity.EntityType entityType) { return wrapperContained.shouldCheck(entityType.wrapperContained); }
// public void register(yarnwrap.entity.EntityType entityType,yarnwrap.registry.RegistryKey tableKey,Object lootTable) { wrapperContained.register(entityType.wrapperContained,tableKey.wrapperContained,lootTable); }
// public void register(yarnwrap.entity.EntityType entityType,Object lootTable) { wrapperContained.register(entityType.wrapperContained,lootTable); }
// public Object killedByFrog(yarnwrap.registry.RegistryKey frogVariant) { return wrapperContained.killedByFrog(frogVariant.wrapperContained); }
// public Object createForSheep(yarnwrap.item.ItemConvertible item) { return wrapperContained.createForSheep(item.wrapperContained); }
// public Object killedByFrog() { return wrapperContained.killedByFrog(); }
// public Object createSmeltLootCondition() { return wrapperContained.createSmeltLootCondition(); }

}