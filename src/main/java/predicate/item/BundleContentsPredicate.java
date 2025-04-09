package yarnwrap.predicate.item;
public class BundleContentsPredicate { public net.minecraft.predicate.item.BundleContentsPredicate wrapperContained; public BundleContentsPredicate(net.minecraft.predicate.item.BundleContentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}