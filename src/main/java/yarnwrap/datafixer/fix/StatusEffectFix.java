package yarnwrap.datafixer.fix;
public class StatusEffectFix { public net.minecraft.datafixer.fix.StatusEffectFix wrapperContained; public StatusEffectFix(net.minecraft.datafixer.fix.StatusEffectFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap OLD_TO_NEW_IDS() { return wrapperContained.OLD_TO_NEW_IDS; }
// public void OLD_TO_NEW_IDS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.OLD_TO_NEW_IDS = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap OLD_TO_NEW_IDS() { return net.minecraft.datafixer.fix.StatusEffectFix.OLD_TO_NEW_IDS; }
// public static void OLD_TO_NEW_IDS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.datafixer.fix.StatusEffectFix.OLD_TO_NEW_IDS = value; }

// public java.util.Set POTION_ITEM_IDS() { return wrapperContained.POTION_ITEM_IDS; }
// public void POTION_ITEM_IDS(java.util.Set value) { wrapperContained.POTION_ITEM_IDS = value; }
// public static java.util.Set POTION_ITEM_IDS() { return net.minecraft.datafixer.fix.StatusEffectFix.POTION_ITEM_IDS; }
// public static void POTION_ITEM_IDS(java.util.Set value, ) { net.minecraft.datafixer.fix.StatusEffectFix.POTION_ITEM_IDS = value; }

public StatusEffectFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.StatusEffectFix(outputSchema); }
// public com.mojang.datafixers.TypeRewriteRule makeBlockEntitiesRule() { return wrapperContained.makeBlockEntitiesRule(); }
// public static com.mojang.datafixers.TypeRewriteRule makeBlockEntitiesRule() { return net.minecraft.datafixer.fix.StatusEffectFix.makeBlockEntitiesRule(); }
// public com.mojang.datafixers.Typed method_53079(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_53079(itemStackTyped); }
// public static com.mojang.datafixers.Typed method_53079(com.mojang.datafixers.OpticFinder itemStackTyped, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53079(itemStackTyped); }
// public com.mojang.datafixers.Typed method_53080(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_53080(tagTyped); }
// public static com.mojang.datafixers.Typed method_53080(com.mojang.datafixers.Typed tagTyped, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53080(tagTyped); }
// public com.mojang.datafixers.Typed fixEntityEffects(com.mojang.datafixers.Typed entityTyped,Object entityTypeReference,java.lang.String entityId,java.util.function.Function effectsFixer) { return wrapperContained.fixEntityEffects(entityTyped,entityTypeReference,entityId,effectsFixer); }
// public static com.mojang.datafixers.Typed fixEntityEffects(com.mojang.datafixers.Typed entityTyped,Object entityTypeReference,java.lang.String entityId,java.util.function.Function effectsFixer, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixEntityEffects(entityTyped,entityTypeReference,entityId,effectsFixer); }
// public com.mojang.serialization.Dynamic fixEffect(com.mojang.serialization.Dynamic effectDynamic) { return wrapperContained.fixEffect(effectDynamic); }
// public static com.mojang.serialization.Dynamic fixEffect(com.mojang.serialization.Dynamic effectDynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixEffect(effectDynamic); }
// public com.mojang.serialization.Dynamic fixSuspiciousStewEffect(com.mojang.serialization.Dynamic effectDynamicIn,com.mojang.serialization.Dynamic effectDynamicOut) { return wrapperContained.fixSuspiciousStewEffect(effectDynamicIn,effectDynamicOut); }
// public static com.mojang.serialization.Dynamic fixSuspiciousStewEffect(com.mojang.serialization.Dynamic effectDynamicIn,com.mojang.serialization.Dynamic effectDynamicOut, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixSuspiciousStewEffect(effectDynamicIn,effectDynamicOut); }
// public java.util.Optional updateId(com.mojang.serialization.Dynamic dynamic,java.lang.String idKey) { return wrapperContained.updateId(dynamic,idKey); }
// public static java.util.Optional updateId(com.mojang.serialization.Dynamic dynamic,java.lang.String idKey, ) { return net.minecraft.datafixer.fix.StatusEffectFix.updateId(dynamic,idKey); }
// public com.mojang.serialization.Dynamic renameKeyAndUpdateId(com.mojang.serialization.Dynamic dynamic,java.lang.String oldKey,com.mojang.serialization.Dynamic newKey) { return wrapperContained.renameKeyAndUpdateId(dynamic,oldKey,newKey); }
// public static com.mojang.serialization.Dynamic renameKeyAndUpdateId(com.mojang.serialization.Dynamic dynamic,java.lang.String oldKey,com.mojang.serialization.Dynamic newKey, ) { return net.minecraft.datafixer.fix.StatusEffectFix.renameKeyAndUpdateId(dynamic,oldKey,newKey); }
// public com.mojang.serialization.Dynamic method_53089(com.mojang.serialization.Dynamic effects) { return wrapperContained.method_53089(effects); }
// public static com.mojang.serialization.Dynamic method_53089(com.mojang.serialization.Dynamic effects, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53089(effects); }
// public void method_53090(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap idMap) { wrapperContained.method_53090(idMap); }
// public static void method_53090(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap idMap, ) { net.minecraft.datafixer.fix.StatusEffectFix.method_53090(idMap); }
// public java.lang.String method_53091(java.lang.Number oldId) { return wrapperContained.method_53091(oldId); }
// public static java.lang.String method_53091(java.lang.Number oldId, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53091(oldId); }
// public com.mojang.datafixers.Typed method_53092(java.util.function.Function matchingEntityTyped) { return wrapperContained.method_53092(matchingEntityTyped); }
// public static com.mojang.datafixers.Typed method_53092(java.util.function.Function matchingEntityTyped, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53092(matchingEntityTyped); }
// public com.mojang.datafixers.TypeRewriteRule makeEntitiesRule() { return wrapperContained.makeEntitiesRule(); }
// public static com.mojang.datafixers.TypeRewriteRule makeEntitiesRule() { return net.minecraft.datafixer.fix.StatusEffectFix.makeEntitiesRule(); }
// public com.mojang.datafixers.Typed method_53094(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_53094(tagTyped); }
// public static com.mojang.datafixers.Typed method_53094(com.mojang.datafixers.Typed tagTyped, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53094(tagTyped); }
// public com.mojang.serialization.Dynamic fixSuspiciousStewEffect(com.mojang.serialization.Dynamic effectDynamic) { return wrapperContained.fixSuspiciousStewEffect(effectDynamic); }
// public static com.mojang.serialization.Dynamic fixSuspiciousStewEffect(com.mojang.serialization.Dynamic effectDynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixSuspiciousStewEffect(effectDynamic); }
// public com.mojang.serialization.Dynamic renameKeyAndUpdateId(com.mojang.serialization.Dynamic dynamic,java.lang.String oldKey,java.lang.String newKey) { return wrapperContained.renameKeyAndUpdateId(dynamic,oldKey,newKey); }
// public static com.mojang.serialization.Dynamic renameKeyAndUpdateId(com.mojang.serialization.Dynamic dynamic,java.lang.String oldKey,java.lang.String newKey, ) { return net.minecraft.datafixer.fix.StatusEffectFix.renameKeyAndUpdateId(dynamic,oldKey,newKey); }
// public com.mojang.serialization.Dynamic method_53097(com.mojang.serialization.Dynamic oldEffects) { return wrapperContained.method_53097(oldEffects); }
// public static com.mojang.serialization.Dynamic method_53097(com.mojang.serialization.Dynamic oldEffects, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53097(oldEffects); }
// public com.mojang.datafixers.TypeRewriteRule makeItemStacksRule() { return wrapperContained.makeItemStacksRule(); }
// public static com.mojang.datafixers.TypeRewriteRule makeItemStacksRule() { return net.minecraft.datafixer.fix.StatusEffectFix.makeItemStacksRule(); }
// public com.mojang.datafixers.Typed method_53099(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.method_53099(entityTyped); }
// public static com.mojang.datafixers.Typed method_53099(com.mojang.datafixers.Typed entityTyped, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53099(entityTyped); }
// public com.mojang.serialization.Dynamic fixStewEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixStewEffectsKey(dynamic); }
// public static com.mojang.serialization.Dynamic fixStewEffectsKey(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixStewEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixEffectList(com.mojang.serialization.Dynamic dynamic,java.lang.String oldEffectListKey,java.lang.String newEffectListKey) { return wrapperContained.fixEffectList(dynamic,oldEffectListKey,newEffectListKey); }
// public static com.mojang.serialization.Dynamic fixEffectList(com.mojang.serialization.Dynamic dynamic,java.lang.String oldEffectListKey,java.lang.String newEffectListKey, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixEffectList(dynamic,oldEffectListKey,newEffectListKey); }
// public com.mojang.serialization.Dynamic fixCustomPotionEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixCustomPotionEffectsKey(dynamic); }
// public static com.mojang.serialization.Dynamic fixCustomPotionEffectsKey(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixCustomPotionEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixEffectsKey(dynamic); }
// public static com.mojang.serialization.Dynamic fixEffectsKey(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixActiveEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixActiveEffectsKey(dynamic); }
// public static com.mojang.serialization.Dynamic fixActiveEffectsKey(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixActiveEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixSuspiciousStewEffects(com.mojang.serialization.Dynamic tagTyped) { return wrapperContained.fixSuspiciousStewEffects(tagTyped); }
// public static com.mojang.serialization.Dynamic fixSuspiciousStewEffects(com.mojang.serialization.Dynamic tagTyped, ) { return net.minecraft.datafixer.fix.StatusEffectFix.fixSuspiciousStewEffects(tagTyped); }
// public com.mojang.serialization.Dynamic method_53107(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.method_53107(tagDynamic); }
// public static com.mojang.serialization.Dynamic method_53107(com.mojang.serialization.Dynamic tagDynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53107(tagDynamic); }
// public com.mojang.serialization.Dynamic method_53108(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_53108(dynamic); }
// public static com.mojang.serialization.Dynamic method_53108(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.StatusEffectFix.method_53108(dynamic); }
// public com.mojang.datafixers.TypeRewriteRule makePlayersRule() { return wrapperContained.makePlayersRule(); }
// public static com.mojang.datafixers.TypeRewriteRule makePlayersRule() { return net.minecraft.datafixer.fix.StatusEffectFix.makePlayersRule(); }

}