package yarnwrap.predicate.item;
public class WritableBookContentPredicate { public net.minecraft.predicate.item.WritableBookContentPredicate wrapperContained; public WritableBookContentPredicate(net.minecraft.predicate.item.WritableBookContentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.WritableBookContentPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.WritableBookContentPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_59687(Object instance) { return wrapperContained.method_59687(instance); }
// public static com.mojang.datafixers.kinds.App method_59687(Object instance, ) { return net.minecraft.predicate.item.WritableBookContentPredicate.method_59687(instance); }

}