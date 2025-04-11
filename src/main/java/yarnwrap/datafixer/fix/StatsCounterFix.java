package yarnwrap.datafixer.fix;
public class StatsCounterFix { public net.minecraft.datafixer.fix.StatsCounterFix wrapperContained; public StatsCounterFix(net.minecraft.datafixer.fix.StatsCounterFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String OLD_MINE_BLOCK_ID() { return wrapperContained.OLD_MINE_BLOCK_ID; }
// public void OLD_MINE_BLOCK_ID(java.lang.String value) { wrapperContained.OLD_MINE_BLOCK_ID = value; }
// public java.lang.String NEW_MINE_BLOCK_ID() { return wrapperContained.NEW_MINE_BLOCK_ID; }
// public void NEW_MINE_BLOCK_ID(java.lang.String value) { wrapperContained.NEW_MINE_BLOCK_ID = value; }
// public java.lang.String CUSTOM() { return wrapperContained.CUSTOM; }
// public void CUSTOM(java.lang.String value) { wrapperContained.CUSTOM = value; }
// public java.util.Set SKIPPED_STATS() { return wrapperContained.SKIPPED_STATS; }
// public void SKIPPED_STATS(java.util.Set value) { wrapperContained.SKIPPED_STATS = value; }
// public java.util.Map RENAMED_ENTITIES() { return wrapperContained.RENAMED_ENTITIES; }
// public void RENAMED_ENTITIES(java.util.Map value) { wrapperContained.RENAMED_ENTITIES = value; }
// public java.util.Map RENAMED_ENTITY_STATS() { return wrapperContained.RENAMED_ENTITY_STATS; }
// public void RENAMED_ENTITY_STATS(java.util.Map value) { wrapperContained.RENAMED_ENTITY_STATS = value; }
// public java.util.Map RENAMED_GENERAL_STATS() { return wrapperContained.RENAMED_GENERAL_STATS; }
// public void RENAMED_GENERAL_STATS(java.util.Map value) { wrapperContained.RENAMED_GENERAL_STATS = value; }
// public java.util.Map RENAMED_ITEM_STATS() { return wrapperContained.RENAMED_ITEM_STATS; }
// public void RENAMED_ITEM_STATS(java.util.Map value) { wrapperContained.RENAMED_ITEM_STATS = value; }
// public java.util.Set REMOVED_STATS() { return wrapperContained.REMOVED_STATS; }
// public void REMOVED_STATS(java.util.Set value) { wrapperContained.REMOVED_STATS = value; }
public StatsCounterFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.StatsCounterFix(outputSchema,changesType); }
// public java.lang.String getItem(java.lang.String id) { return wrapperContained.getItem(id); }
// public java.lang.String getBlock(java.lang.String id) { return wrapperContained.getBlock(id); }
// public com.mojang.datafixers.TypeRewriteRule makeFirstRoundRule() { return wrapperContained.makeFirstRoundRule(); }
// public com.mojang.datafixers.Typed method_52497(com.mojang.datafixers.types.Type objectiveTyped) { return wrapperContained.method_52497(objectiveTyped); }
// public com.mojang.serialization.Dynamic method_52498(com.mojang.serialization.Dynamic criteriaNameDynamic) { return wrapperContained.method_52498(criteriaNameDynamic); }
// public Object rename(java.lang.String old) { return wrapperContained.rename(old); }
// public com.mojang.datafixers.TypeRewriteRule makeSecondRoundRule() { return wrapperContained.makeSecondRoundRule(); }
// public com.mojang.datafixers.Typed method_52502(com.mojang.datafixers.types.Type statsTyped) { return wrapperContained.method_52502(statsTyped); }
// public java.lang.String method_52505(java.lang.String criteriaName) { return wrapperContained.method_52505(criteriaName); }

}