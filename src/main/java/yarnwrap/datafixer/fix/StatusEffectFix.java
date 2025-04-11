package yarnwrap.datafixer.fix;
public class StatusEffectFix { public net.minecraft.datafixer.fix.StatusEffectFix wrapperContained; public StatusEffectFix(net.minecraft.datafixer.fix.StatusEffectFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap OLD_TO_NEW_IDS() { return wrapperContained.OLD_TO_NEW_IDS; }
// public void OLD_TO_NEW_IDS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.OLD_TO_NEW_IDS = value; }
// public java.util.Set POTION_ITEM_IDS() { return wrapperContained.POTION_ITEM_IDS; }
// public void POTION_ITEM_IDS(java.util.Set value) { wrapperContained.POTION_ITEM_IDS = value; }
public StatusEffectFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.StatusEffectFix(outputSchema); }
// public com.mojang.datafixers.TypeRewriteRule makeBlockEntitiesRule() { return wrapperContained.makeBlockEntitiesRule(); }
// public com.mojang.datafixers.Typed method_53079(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_53079(itemStackTyped); }
// public com.mojang.datafixers.Typed method_53080(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_53080(tagTyped); }
// public com.mojang.datafixers.Typed fixEntityEffects(com.mojang.datafixers.Typed entityTyped,Object entityTypeReference,java.lang.String entityId,java.util.function.Function effectsFixer) { return wrapperContained.fixEntityEffects(entityTyped,entityTypeReference,entityId,effectsFixer); }
// public com.mojang.serialization.Dynamic fixEffect(com.mojang.serialization.Dynamic effectDynamic) { return wrapperContained.fixEffect(effectDynamic); }
// public com.mojang.serialization.Dynamic fixSuspiciousStewEffect(com.mojang.serialization.Dynamic effectDynamicIn,com.mojang.serialization.Dynamic effectDynamicOut) { return wrapperContained.fixSuspiciousStewEffect(effectDynamicIn,effectDynamicOut); }
// public java.util.Optional updateId(com.mojang.serialization.Dynamic dynamic,java.lang.String idKey) { return wrapperContained.updateId(dynamic,idKey); }
// public com.mojang.serialization.Dynamic renameKeyAndUpdateId(com.mojang.serialization.Dynamic dynamic,java.lang.String oldKey,com.mojang.serialization.Dynamic newKey) { return wrapperContained.renameKeyAndUpdateId(dynamic,oldKey,newKey); }
// public com.mojang.serialization.Dynamic method_53089(com.mojang.serialization.Dynamic effects) { return wrapperContained.method_53089(effects); }
// public void method_53090(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap idMap) { wrapperContained.method_53090(idMap); }
// public java.lang.String method_53091(java.lang.Number oldId) { return wrapperContained.method_53091(oldId); }
// public com.mojang.datafixers.Typed method_53092(java.util.function.Function matchingEntityTyped) { return wrapperContained.method_53092(matchingEntityTyped); }
// public com.mojang.datafixers.TypeRewriteRule makeEntitiesRule() { return wrapperContained.makeEntitiesRule(); }
// public com.mojang.datafixers.Typed method_53094(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_53094(tagTyped); }
// public com.mojang.serialization.Dynamic fixSuspiciousStewEffect(com.mojang.serialization.Dynamic effectDynamic) { return wrapperContained.fixSuspiciousStewEffect(effectDynamic); }
// public com.mojang.serialization.Dynamic renameKeyAndUpdateId(com.mojang.serialization.Dynamic dynamic,java.lang.String oldKey,java.lang.String newKey) { return wrapperContained.renameKeyAndUpdateId(dynamic,oldKey,newKey); }
// public com.mojang.serialization.Dynamic method_53097(com.mojang.serialization.Dynamic oldEffects) { return wrapperContained.method_53097(oldEffects); }
// public com.mojang.datafixers.TypeRewriteRule makeItemStacksRule() { return wrapperContained.makeItemStacksRule(); }
// public com.mojang.datafixers.Typed method_53099(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.method_53099(entityTyped); }
// public com.mojang.serialization.Dynamic fixStewEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixStewEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixEffectList(com.mojang.serialization.Dynamic dynamic,java.lang.String oldEffectListKey,java.lang.String newEffectListKey) { return wrapperContained.fixEffectList(dynamic,oldEffectListKey,newEffectListKey); }
// public com.mojang.serialization.Dynamic fixCustomPotionEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixCustomPotionEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixActiveEffectsKey(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixActiveEffectsKey(dynamic); }
// public com.mojang.serialization.Dynamic fixSuspiciousStewEffects(com.mojang.serialization.Dynamic tagTyped) { return wrapperContained.fixSuspiciousStewEffects(tagTyped); }
// public com.mojang.serialization.Dynamic method_53107(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.method_53107(tagDynamic); }
// public com.mojang.serialization.Dynamic method_53108(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_53108(dynamic); }
// public com.mojang.datafixers.TypeRewriteRule makePlayersRule() { return wrapperContained.makePlayersRule(); }

}