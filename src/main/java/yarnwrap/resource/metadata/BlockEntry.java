package yarnwrap.resource.metadata;
public class BlockEntry { public net.minecraft.resource.metadata.BlockEntry wrapperContained; public BlockEntry(net.minecraft.resource.metadata.BlockEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Optional namespace() { return wrapperContained.namespace; }
// public void namespace(java.util.Optional value) { wrapperContained.namespace = value; }
// public java.util.function.Predicate namespacePredicate() { return wrapperContained.namespacePredicate; }
// public void namespacePredicate(java.util.function.Predicate value) { wrapperContained.namespacePredicate = value; }
// public java.util.Optional path() { return wrapperContained.path; }
// public void path(java.util.Optional value) { wrapperContained.path = value; }
// public java.util.function.Predicate pathPredicate() { return wrapperContained.pathPredicate; }
// public void pathPredicate(java.util.function.Predicate value) { wrapperContained.pathPredicate = value; }
// public java.util.function.Predicate identifierPredicate() { return wrapperContained.identifierPredicate; }
// public void identifierPredicate(java.util.function.Predicate value) { wrapperContained.identifierPredicate = value; }
public java.util.function.Predicate getNamespacePredicate() { return wrapperContained.getNamespacePredicate(); }
public java.util.function.Predicate getPathPredicate() { return wrapperContained.getPathPredicate(); }
public java.util.function.Predicate getIdentifierPredicate() { return wrapperContained.getIdentifierPredicate(); }

}