package yarnwrap.datafixer.fix;
public class ItemInstanceTheFlatteningFix { public net.minecraft.datafixer.fix.ItemInstanceTheFlatteningFix wrapperContained; public ItemInstanceTheFlatteningFix(net.minecraft.datafixer.fix.ItemInstanceTheFlatteningFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set DAMAGEABLE_ITEMS() { return wrapperContained.DAMAGEABLE_ITEMS; }
// public void DAMAGEABLE_ITEMS(java.util.Set value) { wrapperContained.DAMAGEABLE_ITEMS = value; }
// public java.util.Set ORIGINAL_ITEM_NAMES() { return wrapperContained.ORIGINAL_ITEM_NAMES; }
// public void ORIGINAL_ITEM_NAMES(java.util.Set value) { wrapperContained.ORIGINAL_ITEM_NAMES = value; }
// public java.util.Map FLATTENING_MAP() { return wrapperContained.FLATTENING_MAP; }
// public void FLATTENING_MAP(java.util.Map value) { wrapperContained.FLATTENING_MAP = value; }
public ItemInstanceTheFlatteningFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemInstanceTheFlatteningFix(outputSchema,changesType); }
public java.lang.String getItem(java.lang.String originalName,int damage) { return wrapperContained.getItem(originalName,damage); }
// public void method_5043(java.util.HashMap map) { wrapperContained.method_5043(map); }
// public com.mojang.datafixers.Typed method_5044(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5044(itemStackTyped); }
// public java.lang.String method_5045(java.lang.String oldId) { return wrapperContained.method_5045(oldId); }

}