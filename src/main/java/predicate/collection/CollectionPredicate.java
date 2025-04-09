package yarnwrap.predicate.collection;
public class CollectionPredicate { public net.minecraft.predicate.collection.CollectionPredicate wrapperContained; public CollectionPredicate(net.minecraft.predicate.collection.CollectionPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec) { return wrapperContained.createCodec(predicateCodec); }

}