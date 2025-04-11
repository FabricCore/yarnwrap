package yarnwrap.predicate.item;
public class PotionContentsPredicate { public net.minecraft.predicate.item.PotionContentsPredicate wrapperContained; public PotionContentsPredicate(net.minecraft.predicate.item.PotionContentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.predicate.item.ItemSubPredicate potionContents(yarnwrap.registry.entry.RegistryEntryList potions) { return new yarnwrap.predicate.item.ItemSubPredicate(wrapperContained.potionContents(potions.wrapperContained)); }

}