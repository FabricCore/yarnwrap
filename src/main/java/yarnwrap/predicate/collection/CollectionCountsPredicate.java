package yarnwrap.predicate.collection;
public class CollectionCountsPredicate { public net.minecraft.predicate.collection.CollectionCountsPredicate wrapperContained; public CollectionCountsPredicate(net.minecraft.predicate.collection.CollectionCountsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getEntries() { return wrapperContained.getEntries(); }
// public static java.util.List getEntries() { return net.minecraft.predicate.collection.CollectionCountsPredicate.getEntries(); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec) { return wrapperContained.createCodec(predicateCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec, ) { return net.minecraft.predicate.collection.CollectionCountsPredicate.createCodec(predicateCodec); }
// public yarnwrap.predicate.collection.CollectionCountsPredicate create(java.util.List entries) { return new yarnwrap.predicate.collection.CollectionCountsPredicate(wrapperContained.create(entries)); }
// public static yarnwrap.predicate.collection.CollectionCountsPredicate create(java.util.List entries, ) { return new yarnwrap.predicate.collection.CollectionCountsPredicate(net.minecraft.predicate.collection.CollectionCountsPredicate.create(entries)); }
// public yarnwrap.predicate.collection.CollectionCountsPredicate create(Object[] entries) { return new yarnwrap.predicate.collection.CollectionCountsPredicate(wrapperContained.create(entries)); }
// public static yarnwrap.predicate.collection.CollectionCountsPredicate create(Object[] entries, ) { return new yarnwrap.predicate.collection.CollectionCountsPredicate(net.minecraft.predicate.collection.CollectionCountsPredicate.create(entries)); }

}