package yarnwrap.predicate.item;
public class AttributeModifiersPredicate { public net.minecraft.predicate.item.AttributeModifiersPredicate wrapperContained; public AttributeModifiersPredicate(net.minecraft.predicate.item.AttributeModifiersPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}