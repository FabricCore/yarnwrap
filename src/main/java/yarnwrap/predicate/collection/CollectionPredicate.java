package yarnwrap.predicate.collection;
public class CollectionPredicate { public net.minecraft.predicate.collection.CollectionPredicate wrapperContained; public CollectionPredicate(net.minecraft.predicate.collection.CollectionPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec) { return wrapperContained.createCodec(predicateCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec, ) { return net.minecraft.predicate.collection.CollectionPredicate.createCodec(predicateCodec); }
// public com.mojang.datafixers.kinds.App method_59624(com.mojang.serialization.Codec instance) { return wrapperContained.method_59624(instance); }
// public static com.mojang.datafixers.kinds.App method_59624(com.mojang.serialization.Codec instance, ) { return net.minecraft.predicate.collection.CollectionPredicate.method_59624(instance); }
public boolean test(java.lang.Object collection) { return wrapperContained.test(collection); }
// public static boolean test(java.lang.Object collection, ) { return net.minecraft.predicate.collection.CollectionPredicate.test(collection); }

}