package yarnwrap.client.search;
public class IdentifierSearcher { public net.minecraft.client.search.IdentifierSearcher wrapperContained; public IdentifierSearcher(net.minecraft.client.search.IdentifierSearcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.search.IdentifierSearcher of() { return new yarnwrap.client.search.IdentifierSearcher(wrapperContained.of()); }
public java.util.List searchNamespace(java.lang.String namespace) { return wrapperContained.searchNamespace(namespace); }
// public yarnwrap.client.search.IdentifierSearcher of(java.util.List values,java.util.function.Function identifiersGetter) { return new yarnwrap.client.search.IdentifierSearcher(wrapperContained.of(values,identifiersGetter)); }
public java.util.List searchPath(java.lang.String path) { return wrapperContained.searchPath(path); }

}