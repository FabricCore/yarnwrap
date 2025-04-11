package yarnwrap.datafixer.fix;
public class StatusEffectDurationFix { public net.minecraft.datafixer.fix.StatusEffectDurationFix wrapperContained; public StatusEffectDurationFix(net.minecraft.datafixer.fix.StatusEffectDurationFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set POTION_ITEM_IDS() { return wrapperContained.POTION_ITEM_IDS; }
// public void POTION_ITEM_IDS(java.util.Set value) { wrapperContained.POTION_ITEM_IDS = value; }
public StatusEffectDurationFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.StatusEffectDurationFix(outputSchema); }
// public com.mojang.datafixers.Typed method_48549(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_48549(itemStackTyped); }
// public com.mojang.datafixers.Typed method_48550(com.mojang.datafixers.Typed playerTyped) { return wrapperContained.method_48550(playerTyped); }
// public com.mojang.serialization.Dynamic fixPotionEffect(com.mojang.serialization.Dynamic effectDynamic) { return wrapperContained.fixPotionEffect(effectDynamic); }
// public com.mojang.serialization.Dynamic method_48552(com.mojang.serialization.Dynamic factorCalculationDataDynamic) { return wrapperContained.method_48552(factorCalculationDataDynamic); }
// public com.mojang.datafixers.Typed method_48553(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.method_48553(entityTyped); }
// public com.mojang.serialization.Dynamic fixPotionEffects(com.mojang.serialization.Dynamic effectsDynamic) { return wrapperContained.fixPotionEffects(effectsDynamic); }
// public com.mojang.serialization.Dynamic fixEntityStatusEffects(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.fixEntityStatusEffects(entityDynamic); }

}