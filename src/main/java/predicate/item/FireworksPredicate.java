package yarnwrap.predicate.item;
public class FireworksPredicate { public net.minecraft.predicate.item.FireworksPredicate wrapperContained; public FireworksPredicate(net.minecraft.predicate.item.FireworksPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}