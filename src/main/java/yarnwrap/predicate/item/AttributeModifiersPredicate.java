package yarnwrap.predicate.item;
public class AttributeModifiersPredicate { public net.minecraft.predicate.item.AttributeModifiersPredicate wrapperContained; public AttributeModifiersPredicate(net.minecraft.predicate.item.AttributeModifiersPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_59668(Object instance) { return wrapperContained.method_59668(instance); }

}