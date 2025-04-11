package yarnwrap.client.search;
public class IdentifierSearchProvider { public net.minecraft.client.search.IdentifierSearchProvider wrapperContained; public IdentifierSearchProvider(net.minecraft.client.search.IdentifierSearchProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator lastIndexComparator() { return wrapperContained.lastIndexComparator; }
// public void lastIndexComparator(java.util.Comparator value) { wrapperContained.lastIndexComparator = value; }
// public yarnwrap.client.search.IdentifierSearcher idSearcher() { return new yarnwrap.client.search.IdentifierSearcher(wrapperContained.idSearcher); }
// public void idSearcher(yarnwrap.client.search.IdentifierSearcher value) { wrapperContained.idSearcher = value.wrapperContained; }
// public java.util.List search(java.lang.String text) { return wrapperContained.search(text); }
// public java.util.List search(java.lang.String namespace,java.lang.String path) { return wrapperContained.search(namespace,path); }

}