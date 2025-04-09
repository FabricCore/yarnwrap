package yarnwrap.predicate.collection;
public class CollectionCountsPredicate { public net.minecraft.predicate.collection.CollectionCountsPredicate wrapperContained; public CollectionCountsPredicate(net.minecraft.predicate.collection.CollectionCountsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getEntries() { return wrapperContained.getEntries(); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec predicateCodec) { return wrapperContained.createCodec(predicateCodec); }
// public yarnwrap.predicate.collection.CollectionCountsPredicate create(java.util.List entries) { return new yarnwrap.predicate.collection.CollectionCountsPredicate(wrapperContained.create(entries)); }
// public yarnwrap.predicate.collection.CollectionCountsPredicate create(Object[] entries) { return new yarnwrap.predicate.collection.CollectionCountsPredicate(wrapperContained.create(entries)); }

}