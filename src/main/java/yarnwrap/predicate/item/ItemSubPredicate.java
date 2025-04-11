package yarnwrap.predicate.item;
public class ItemSubPredicate { public net.minecraft.predicate.item.ItemSubPredicate wrapperContained; public ItemSubPredicate(net.minecraft.predicate.item.ItemSubPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec PREDICATES_MAP_CODEC() { return wrapperContained.PREDICATES_MAP_CODEC; }
// public void PREDICATES_MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PREDICATES_MAP_CODEC = value; }
public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }

}