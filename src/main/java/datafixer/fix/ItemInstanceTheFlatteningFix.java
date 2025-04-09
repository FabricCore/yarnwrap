package yarnwrap.datafixer.fix;
public class ItemInstanceTheFlatteningFix { public net.minecraft.datafixer.fix.ItemInstanceTheFlatteningFix wrapperContained; public ItemInstanceTheFlatteningFix(net.minecraft.datafixer.fix.ItemInstanceTheFlatteningFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set DAMAGEABLE_ITEMS() { return wrapperContained.DAMAGEABLE_ITEMS; }
// public java.util.Set ORIGINAL_ITEM_NAMES() { return wrapperContained.ORIGINAL_ITEM_NAMES; }
// public java.util.Map FLATTENING_MAP() { return wrapperContained.FLATTENING_MAP; }
public java.lang.String getItem(java.lang.String originalName,int damage) { return wrapperContained.getItem(originalName,damage); }

}