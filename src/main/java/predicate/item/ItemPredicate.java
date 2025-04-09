package yarnwrap.predicate.item;
public class ItemPredicate { public net.minecraft.predicate.item.ItemPredicate wrapperContained; public ItemPredicate(net.minecraft.predicate.item.ItemPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }

}