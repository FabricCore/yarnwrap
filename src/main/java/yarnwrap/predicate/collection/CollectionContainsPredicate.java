package yarnwrap.predicate.collection;
public class CollectionContainsPredicate { public net.minecraft.predicate.collection.CollectionContainsPredicate wrapperContained; public CollectionContainsPredicate(net.minecraft.predicate.collection.CollectionContainsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getPredicates() { return wrapperContained.getPredicates(); }
// public static java.util.List getPredicates() { return net.minecraft.predicate.collection.CollectionContainsPredicate.getPredicates(); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec) { return wrapperContained.createCodec(predicateCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec, ) { return net.minecraft.predicate.collection.CollectionContainsPredicate.createCodec(predicateCodec); }
// public yarnwrap.predicate.collection.CollectionContainsPredicate create(java.util.List predicates) { return new yarnwrap.predicate.collection.CollectionContainsPredicate(wrapperContained.create(predicates)); }
// public static yarnwrap.predicate.collection.CollectionContainsPredicate create(java.util.List predicates, ) { return new yarnwrap.predicate.collection.CollectionContainsPredicate(net.minecraft.predicate.collection.CollectionContainsPredicate.create(predicates)); }
// public yarnwrap.predicate.collection.CollectionContainsPredicate create(java.util.function.Predicate[] predicates) { return new yarnwrap.predicate.collection.CollectionContainsPredicate(wrapperContained.create(predicates)); }
// public static yarnwrap.predicate.collection.CollectionContainsPredicate create(java.util.function.Predicate[] predicates, ) { return new yarnwrap.predicate.collection.CollectionContainsPredicate(net.minecraft.predicate.collection.CollectionContainsPredicate.create(predicates)); }

}