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
// public BlockEntry(java.util.Optional namespace,java.util.Optional path) { this.wrapperContained = new net.minecraft.resource.metadata.BlockEntry(namespace,path); }
// public java.util.Optional method_41284(yarnwrap.resource.metadata.BlockEntry entry) { return wrapperContained.method_41284(entry.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_41285(Object instance) { return wrapperContained.method_41285(instance); }
// public boolean method_41286(java.lang.String path_) { return wrapperContained.method_41286(path_); }
// public java.util.Optional method_41288(yarnwrap.resource.metadata.BlockEntry entry) { return wrapperContained.method_41288(entry.wrapperContained); }
// public boolean method_41289(java.lang.String namespace_) { return wrapperContained.method_41289(namespace_); }
public java.util.function.Predicate getNamespacePredicate() { return wrapperContained.getNamespacePredicate(); }
// public boolean method_47546(yarnwrap.util.Identifier id) { return wrapperContained.method_47546(id.wrapperContained); }
public java.util.function.Predicate getPathPredicate() { return wrapperContained.getPathPredicate(); }
public java.util.function.Predicate getIdentifierPredicate() { return wrapperContained.getIdentifierPredicate(); }

}