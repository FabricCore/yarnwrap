package yarnwrap.predicate.item;
public class ItemPredicate { public net.minecraft.predicate.item.ItemPredicate wrapperContained; public ItemPredicate(net.minecraft.predicate.item.ItemPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.ItemPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.ItemPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_57298(Object instance) { return wrapperContained.method_57298(instance); }
// public static com.mojang.datafixers.kinds.App method_57298(Object instance, ) { return net.minecraft.predicate.item.ItemPredicate.method_57298(instance); }
public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }
// public static boolean test(yarnwrap.item.ItemStack stack, ) { return net.minecraft.predicate.item.ItemPredicate.test(stack.wrapperContained); }
// public boolean test(java.lang.Object stack) { return wrapperContained.test(stack); }
// public static boolean test(java.lang.Object stack, ) { return net.minecraft.predicate.item.ItemPredicate.test(stack); }

}