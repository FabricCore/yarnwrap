package yarnwrap.predicate.item;
public class FireworksPredicate { public net.minecraft.predicate.item.FireworksPredicate wrapperContained; public FireworksPredicate(net.minecraft.predicate.item.FireworksPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.FireworksPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.FireworksPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_59680(Object instance) { return wrapperContained.method_59680(instance); }
// public static com.mojang.datafixers.kinds.App method_59680(Object instance, ) { return net.minecraft.predicate.item.FireworksPredicate.method_59680(instance); }

}