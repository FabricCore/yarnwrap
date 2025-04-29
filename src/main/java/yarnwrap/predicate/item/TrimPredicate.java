package yarnwrap.predicate.item;
public class TrimPredicate { public net.minecraft.predicate.item.TrimPredicate wrapperContained; public TrimPredicate(net.minecraft.predicate.item.TrimPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.TrimPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.TrimPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_59685(Object instance) { return wrapperContained.method_59685(instance); }
// public static com.mojang.datafixers.kinds.App method_59685(Object instance, ) { return net.minecraft.predicate.item.TrimPredicate.method_59685(instance); }

}