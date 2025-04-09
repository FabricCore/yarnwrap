package yarnwrap.resource.metadata;
public class BlockEntry { public net.minecraft.resource.metadata.BlockEntry wrapperContained; public BlockEntry(net.minecraft.resource.metadata.BlockEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional namespace() { return wrapperContained.namespace; }
// public java.util.function.Predicate namespacePredicate() { return wrapperContained.namespacePredicate; }
// public java.util.Optional path() { return wrapperContained.path; }
// public java.util.function.Predicate pathPredicate() { return wrapperContained.pathPredicate; }
// public java.util.function.Predicate identifierPredicate() { return wrapperContained.identifierPredicate; }
public java.util.function.Predicate getNamespacePredicate() { return wrapperContained.getNamespacePredicate(); }
public java.util.function.Predicate getPathPredicate() { return wrapperContained.getPathPredicate(); }
public java.util.function.Predicate getIdentifierPredicate() { return wrapperContained.getIdentifierPredicate(); }

}