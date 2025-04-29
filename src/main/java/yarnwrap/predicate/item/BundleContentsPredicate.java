package yarnwrap.predicate.item;
public class BundleContentsPredicate { public net.minecraft.predicate.item.BundleContentsPredicate wrapperContained; public BundleContentsPredicate(net.minecraft.predicate.item.BundleContentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.BundleContentsPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.BundleContentsPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_59672(Object instance) { return wrapperContained.method_59672(instance); }
// public static com.mojang.datafixers.kinds.App method_59672(Object instance, ) { return net.minecraft.predicate.item.BundleContentsPredicate.method_59672(instance); }

}