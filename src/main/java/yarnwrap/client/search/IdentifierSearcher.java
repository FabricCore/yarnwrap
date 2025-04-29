package yarnwrap.client.search;
public class IdentifierSearcher { public net.minecraft.client.search.IdentifierSearcher wrapperContained; public IdentifierSearcher(net.minecraft.client.search.IdentifierSearcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.search.IdentifierSearcher of() { return new yarnwrap.client.search.IdentifierSearcher(wrapperContained.of()); }
public static yarnwrap.client.search.IdentifierSearcher of() { return new yarnwrap.client.search.IdentifierSearcher(net.minecraft.client.search.IdentifierSearcher.of()); }
// public void method_43800(yarnwrap.client.search.SuffixArray id) { wrapperContained.method_43800(id.wrapperContained); }
// public static void method_43800(yarnwrap.client.search.SuffixArray id, ) { net.minecraft.client.search.IdentifierSearcher.method_43800(id.wrapperContained); }
public java.util.List searchNamespace(java.lang.String namespace) { return wrapperContained.searchNamespace(namespace); }
// public static java.util.List searchNamespace(java.lang.String namespace, ) { return net.minecraft.client.search.IdentifierSearcher.searchNamespace(namespace); }
// public yarnwrap.client.search.IdentifierSearcher of(java.util.List values,java.util.function.Function identifiersGetter) { return new yarnwrap.client.search.IdentifierSearcher(wrapperContained.of(values,identifiersGetter)); }
// public static yarnwrap.client.search.IdentifierSearcher of(java.util.List values,java.util.function.Function identifiersGetter, ) { return new yarnwrap.client.search.IdentifierSearcher(net.minecraft.client.search.IdentifierSearcher.of(values,identifiersGetter)); }
public java.util.List searchPath(java.lang.String path) { return wrapperContained.searchPath(path); }
// public static java.util.List searchPath(java.lang.String path, ) { return net.minecraft.client.search.IdentifierSearcher.searchPath(path); }

}