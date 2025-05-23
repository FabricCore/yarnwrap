package yarnwrap.predicate.item;
public class PotionContentsPredicate { public net.minecraft.predicate.item.PotionContentsPredicate wrapperContained; public PotionContentsPredicate(net.minecraft.predicate.item.PotionContentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.PotionContentsPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.PotionContentsPredicate.CODEC = value; }

// public yarnwrap.predicate.component.ComponentPredicate potionContents(yarnwrap.registry.entry.RegistryEntryList potions) { return new yarnwrap.predicate.component.ComponentPredicate(wrapperContained.potionContents(potions.wrapperContained)); }
// public static yarnwrap.predicate.component.ComponentPredicate potionContents(yarnwrap.registry.entry.RegistryEntryList potions, ) { return new yarnwrap.predicate.component.ComponentPredicate(net.minecraft.predicate.item.PotionContentsPredicate.potionContents(potions.wrapperContained)); }

}