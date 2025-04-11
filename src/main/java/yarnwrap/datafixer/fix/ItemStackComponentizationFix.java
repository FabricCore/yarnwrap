package yarnwrap.datafixer.fix;
public class ItemStackComponentizationFix { public net.minecraft.datafixer.fix.ItemStackComponentizationFix wrapperContained; public ItemStackComponentizationFix(net.minecraft.datafixer.fix.ItemStackComponentizationFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HIDE_ENCHANTMENTS_FLAG() { return wrapperContained.HIDE_ENCHANTMENTS_FLAG; }
// public void HIDE_ENCHANTMENTS_FLAG(int value) { wrapperContained.HIDE_ENCHANTMENTS_FLAG = value; }
// public int HIDE_MODIFIERS_FLAG() { return wrapperContained.HIDE_MODIFIERS_FLAG; }
// public void HIDE_MODIFIERS_FLAG(int value) { wrapperContained.HIDE_MODIFIERS_FLAG = value; }
// public int HIDE_UNBREAKABLE_FLAG() { return wrapperContained.HIDE_UNBREAKABLE_FLAG; }
// public void HIDE_UNBREAKABLE_FLAG(int value) { wrapperContained.HIDE_UNBREAKABLE_FLAG = value; }
// public int HIDE_CAN_DESTROY_FLAG() { return wrapperContained.HIDE_CAN_DESTROY_FLAG; }
// public void HIDE_CAN_DESTROY_FLAG(int value) { wrapperContained.HIDE_CAN_DESTROY_FLAG = value; }
// public int HIDE_CAN_PLACE_FLAG() { return wrapperContained.HIDE_CAN_PLACE_FLAG; }
// public void HIDE_CAN_PLACE_FLAG(int value) { wrapperContained.HIDE_CAN_PLACE_FLAG = value; }
// public int HIDE_ADDITIONAL_FLAG() { return wrapperContained.HIDE_ADDITIONAL_FLAG; }
// public void HIDE_ADDITIONAL_FLAG(int value) { wrapperContained.HIDE_ADDITIONAL_FLAG = value; }
// public int HIDE_DYED_FLAG() { return wrapperContained.HIDE_DYED_FLAG; }
// public void HIDE_DYED_FLAG(int value) { wrapperContained.HIDE_DYED_FLAG = value; }
// public int HIDE_UPGRADE_FLAG() { return wrapperContained.HIDE_UPGRADE_FLAG; }
// public void HIDE_UPGRADE_FLAG(int value) { wrapperContained.HIDE_UPGRADE_FLAG = value; }
// public java.util.Set POTION_ITEM_IDS() { return wrapperContained.POTION_ITEM_IDS; }
// public void POTION_ITEM_IDS(java.util.Set value) { wrapperContained.POTION_ITEM_IDS = value; }
// public java.util.Set ENTITY_BUCKET_ITEM_IDS() { return wrapperContained.ENTITY_BUCKET_ITEM_IDS; }
// public void ENTITY_BUCKET_ITEM_IDS(java.util.Set value) { wrapperContained.ENTITY_BUCKET_ITEM_IDS = value; }
// public java.util.List RELEVANT_ENTITY_NBT_KEYS() { return wrapperContained.RELEVANT_ENTITY_NBT_KEYS; }
// public void RELEVANT_ENTITY_NBT_KEYS(java.util.List value) { wrapperContained.RELEVANT_ENTITY_NBT_KEYS = value; }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public java.util.Set BOOLEAN_BLOCK_STATE_PROPERTIES() { return wrapperContained.BOOLEAN_BLOCK_STATE_PROPERTIES; }
// public void BOOLEAN_BLOCK_STATE_PROPERTIES(java.util.Set value) { wrapperContained.BOOLEAN_BLOCK_STATE_PROPERTIES = value; }
public ItemStackComponentizationFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemStackComponentizationFix(outputSchema); }
// public java.lang.String getMapDecorationName(int index) { return wrapperContained.getMapDecorationName(index); }
// public void fixExplosion(Object data) { wrapperContained.fixExplosion(data); }
// public com.mojang.serialization.Dynamic method_57210(Object displayDynamic) { return wrapperContained.method_57210(displayDynamic); }
// public void fixStack(Object data,com.mojang.serialization.Dynamic dynamic) { wrapperContained.fixStack(data,dynamic); }
// public com.mojang.serialization.Dynamic fixDisplay(Object data,com.mojang.serialization.Dynamic dynamic,int hideFlags) { return wrapperContained.fixDisplay(data,dynamic,hideFlags); }
// public com.mojang.serialization.Dynamic fixBlockEntityData(Object data,com.mojang.serialization.Dynamic dynamic,java.lang.String blockEntityId) { return wrapperContained.fixBlockEntityData(data,dynamic,blockEntityId); }
// public void fixEnchantments(Object data,com.mojang.serialization.Dynamic dynamic,java.lang.String nbtKey,java.lang.String componentId,boolean hideInTooltip) { wrapperContained.fixEnchantments(data,dynamic,nbtKey,componentId,hideInTooltip); }
// public java.util.Optional getEnchantmentAndLevelPair(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.getEnchantmentAndLevelPair(dynamic); }
// public com.mojang.serialization.Dynamic createBlockPredicateListDynamic(com.mojang.serialization.Dynamic dynamic,java.lang.String listAsString) { return wrapperContained.createBlockPredicateListDynamic(dynamic,listAsString); }
// public com.mojang.serialization.Dynamic createFilterableTextDynamic(com.mojang.serialization.Dynamic dynamic,java.lang.String unfiltered,java.util.Optional filtered) { return wrapperContained.createFilterableTextDynamic(dynamic,unfiltered,filtered); }
// public com.mojang.serialization.Dynamic createPropertiesDynamic(com.mojang.serialization.OptionalDynamic propertiesDynamic) { return wrapperContained.createPropertiesDynamic(propertiesDynamic); }
// public boolean method_57221(java.lang.String potionId) { return wrapperContained.method_57221(potionId); }
// public com.mojang.datafixers.util.Pair method_57222(java.lang.String enchantmentId,java.lang.Number level) { return wrapperContained.method_57222(enchantmentId,level); }
// public void fixFireworks(Object data) { wrapperContained.fixFireworks(data); }
// public void fixPotionContents(Object data,com.mojang.serialization.Dynamic dynamic) { wrapperContained.fixPotionContents(data,dynamic); }
// public void fixAdventureModePredicates(Object data,com.mojang.serialization.Dynamic dynamic,int hideFlags) { wrapperContained.fixAdventureModePredicates(data,dynamic,hideFlags); }
// public void fixBlockPredicateList(Object data,com.mojang.serialization.Dynamic dynamic,java.lang.String nbtKey,java.lang.String componentId,boolean hideInTooltip) { wrapperContained.fixBlockPredicateList(data,dynamic,nbtKey,componentId,hideInTooltip); }
// public com.mojang.serialization.Dynamic fixAttributeModifier(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixAttributeModifier(dynamic); }
// public com.mojang.serialization.Dynamic method_57229(Object data) { return wrapperContained.method_57229(data); }
// public void fixWritableBookContent(Object data,com.mojang.serialization.Dynamic dynamic) { wrapperContained.fixWritableBookContent(data,dynamic); }
// public void fixAttributeModifiers(Object data,com.mojang.serialization.Dynamic dynamic,int hideFlags) { wrapperContained.fixAttributeModifiers(data,dynamic,hideFlags); }
// public com.mojang.datafixers.util.Pair fixMapDecorations(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixMapDecorations(dynamic); }
// public void fixWrittenBookContent(Object data,com.mojang.serialization.Dynamic dynamic) { wrapperContained.fixWrittenBookContent(data,dynamic); }
// public com.mojang.serialization.Dynamic fixExplosion(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixExplosion(dynamic); }
// public com.mojang.serialization.Dynamic fixBookPages(Object data,com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixBookPages(data,dynamic); }
public com.mojang.serialization.Dynamic createProfileDynamic(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.createProfileDynamic(dynamic); }
// public void fixBucketEntityData(Object data,com.mojang.serialization.Dynamic dynamic) { wrapperContained.fixBucketEntityData(data,dynamic); }
// public com.mojang.serialization.Dynamic method_57238(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_57238(dynamic); }
// public void fixLodestoneTarget(Object data,com.mojang.serialization.Dynamic dynamic) { wrapperContained.fixLodestoneTarget(data,dynamic); }
// public com.mojang.serialization.Dynamic method_57241(Object fireworksDynamic) { return wrapperContained.method_57241(fireworksDynamic); }
// public com.mojang.serialization.Dynamic method_57243(Object explosionDynamic) { return wrapperContained.method_57243(explosionDynamic); }
// public void method_57245(Object skullOwnerDynamic) { wrapperContained.method_57245(skullOwnerDynamic); }
// public com.mojang.serialization.Dynamic method_57247(Object blockEntityTagDynamic) { return wrapperContained.method_57247(blockEntityTagDynamic); }
// public java.lang.String method_57248(com.mojang.serialization.Dynamic filteredPagesValueDynamic) { return wrapperContained.method_57248(filteredPagesValueDynamic); }
// public java.lang.String method_57249(com.mojang.serialization.Dynamic filteredPagesKeyDynamic) { return wrapperContained.method_57249(filteredPagesKeyDynamic); }
// public java.lang.String method_57250(com.mojang.serialization.Dynamic pagesDynamic) { return wrapperContained.method_57250(pagesDynamic); }
// public com.mojang.serialization.Dynamic method_57252(com.mojang.serialization.Dynamic operationDynamic) { return wrapperContained.method_57252(operationDynamic); }
// public com.mojang.serialization.Dynamic method_57253(com.mojang.serialization.Dynamic predicatesDynamic) { return wrapperContained.method_57253(predicatesDynamic); }
// public java.util.stream.Stream method_57254(com.mojang.serialization.Dynamic enchantmentsDynamic) { return wrapperContained.method_57254(enchantmentsDynamic); }
// public com.mojang.serialization.Dynamic method_57255(com.mojang.serialization.Dynamic itemsDynamic) { return wrapperContained.method_57255(itemsDynamic); }
// public boolean isValidUsername(java.lang.String username) { return wrapperContained.isValidUsername(username); }
// public boolean method_58049(int c) { return wrapperContained.method_58049(c); }
// public com.mojang.serialization.Dynamic fixBlockStateTag(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixBlockStateTag(dynamic); }
// public void method_58051(Object blockStateTagDynamic) { wrapperContained.method_58051(blockStateTagDynamic); }

}