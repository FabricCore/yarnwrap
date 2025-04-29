package yarnwrap.client.search;
public class IdentifierSearchProvider { public net.minecraft.client.search.IdentifierSearchProvider wrapperContained; public IdentifierSearchProvider(net.minecraft.client.search.IdentifierSearchProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator lastIndexComparator() { return wrapperContained.lastIndexComparator; }
// public void lastIndexComparator(java.util.Comparator value) { wrapperContained.lastIndexComparator = value; }
// public static java.util.Comparator lastIndexComparator() { return net.minecraft.client.search.IdentifierSearchProvider.lastIndexComparator; }
// public static void lastIndexComparator(java.util.Comparator value, ) { net.minecraft.client.search.IdentifierSearchProvider.lastIndexComparator = value; }

// public yarnwrap.client.search.IdentifierSearcher idSearcher() { return new yarnwrap.client.search.IdentifierSearcher(wrapperContained.idSearcher); }
// public void idSearcher(yarnwrap.client.search.IdentifierSearcher value) { wrapperContained.idSearcher = value.wrapperContained; }
// public static yarnwrap.client.search.IdentifierSearcher idSearcher() { return new yarnwrap.client.search.IdentifierSearcher(net.minecraft.client.search.IdentifierSearchProvider.idSearcher); }
// public static void idSearcher(yarnwrap.client.search.IdentifierSearcher value, ) { net.minecraft.client.search.IdentifierSearchProvider.idSearcher = value.wrapperContained; }

public IdentifierSearchProvider(java.util.function.Function identifiersGetter,java.util.List values) { this.wrapperContained = new net.minecraft.client.search.IdentifierSearchProvider(identifiersGetter,values); }
// public java.util.List search(java.lang.String text) { return wrapperContained.search(text); }
// public static java.util.List search(java.lang.String text, ) { return net.minecraft.client.search.IdentifierSearchProvider.search(text); }
// public java.util.List search(java.lang.String namespace,java.lang.String path) { return wrapperContained.search(namespace,path); }
// public static java.util.List search(java.lang.String namespace,java.lang.String path, ) { return net.minecraft.client.search.IdentifierSearchProvider.search(namespace,path); }

}