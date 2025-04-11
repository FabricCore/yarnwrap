package yarnwrap.datafixer.fix;
public class ItemSpawnEggFix { public net.minecraft.datafixer.fix.ItemSpawnEggFix wrapperContained; public ItemSpawnEggFix(net.minecraft.datafixer.fix.ItemSpawnEggFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] DAMAGE_TO_ENTITY_IDS() { return wrapperContained.DAMAGE_TO_ENTITY_IDS; }
// public void DAMAGE_TO_ENTITY_IDS(java.lang.String[] value) { wrapperContained.DAMAGE_TO_ENTITY_IDS = value; }
public ItemSpawnEggFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemSpawnEggFix(outputSchema,changesType); }
// public java.util.Optional method_5025(com.mojang.datafixers.OpticFinder tagTyped) { return wrapperContained.method_5025(tagTyped); }
// public com.mojang.datafixers.Typed method_5027(com.mojang.datafixers.OpticFinder itemStack) { return wrapperContained.method_5027(itemStack); }
// public java.util.Optional method_5028(com.mojang.datafixers.OpticFinder entityTyped) { return wrapperContained.method_5028(entityTyped); }
// public void method_5029(java.lang.String[] ids) { wrapperContained.method_5029(ids); }
// public java.util.Optional method_5030(com.mojang.datafixers.OpticFinder entityTagTyped) { return wrapperContained.method_5030(entityTagTyped); }

}