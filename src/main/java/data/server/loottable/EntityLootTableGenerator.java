package yarnwrap.data.server.loottable;
public class EntityLootTableGenerator { public net.minecraft.data.server.loottable.EntityLootTableGenerator wrapperContained; public EntityLootTableGenerator(net.minecraft.data.server.loottable.EntityLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set ENTITY_TYPES_IN_MISC_GROUP_TO_CHECK() { return wrapperContained.ENTITY_TYPES_IN_MISC_GROUP_TO_CHECK; }
// public java.util.Map lootTables() { return wrapperContained.lootTables; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public yarnwrap.resource.featuretoggle.FeatureSet featureSet() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.featureSet); }
// public Object registryLookup() { return wrapperContained.registryLookup; }
public void generate() { wrapperContained.generate(); }
// public boolean shouldCheck(yarnwrap.entity.EntityType entityType) { return wrapperContained.shouldCheck(entityType.wrapperContained); }
// public void register(yarnwrap.entity.EntityType entityType,yarnwrap.registry.RegistryKey tableKey,Object lootTable) { wrapperContained.register(entityType.wrapperContained,tableKey.wrapperContained,lootTable); }
// public void register(yarnwrap.entity.EntityType entityType,Object lootTable) { wrapperContained.register(entityType.wrapperContained,lootTable); }
// public Object killedByFrog(yarnwrap.registry.RegistryKey frogVariant) { return wrapperContained.killedByFrog(frogVariant.wrapperContained); }
// public Object createForSheep(yarnwrap.item.ItemConvertible item) { return wrapperContained.createForSheep(item.wrapperContained); }
// public Object killedByFrog() { return wrapperContained.killedByFrog(); }
// public Object createSmeltLootCondition() { return wrapperContained.createSmeltLootCondition(); }

}