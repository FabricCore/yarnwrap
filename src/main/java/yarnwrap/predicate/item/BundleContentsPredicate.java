package yarnwrap.predicate.item;
public class BundleContentsPredicate { public net.minecraft.predicate.item.BundleContentsPredicate wrapperContained; public BundleContentsPredicate(net.minecraft.predicate.item.BundleContentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_59672(Object instance) { return wrapperContained.method_59672(instance); }

}