package yarnwrap.client.search;
public class IdentifierSearchableIterator { public net.minecraft.client.search.IdentifierSearchableIterator wrapperContained; public IdentifierSearchableIterator(net.minecraft.client.search.IdentifierSearchableIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.PeekingIterator namespacesIterator() { return wrapperContained.namespacesIterator; }
// public void namespacesIterator(com.google.common.collect.PeekingIterator value) { wrapperContained.namespacesIterator = value; }
// public static com.google.common.collect.PeekingIterator namespacesIterator() { return net.minecraft.client.search.IdentifierSearchableIterator.namespacesIterator; }
// public static void namespacesIterator(com.google.common.collect.PeekingIterator value, ) { net.minecraft.client.search.IdentifierSearchableIterator.namespacesIterator = value; }

// public com.google.common.collect.PeekingIterator pathsIterator() { return wrapperContained.pathsIterator; }
// public void pathsIterator(com.google.common.collect.PeekingIterator value) { wrapperContained.pathsIterator = value; }
// public static com.google.common.collect.PeekingIterator pathsIterator() { return net.minecraft.client.search.IdentifierSearchableIterator.pathsIterator; }
// public static void pathsIterator(com.google.common.collect.PeekingIterator value, ) { net.minecraft.client.search.IdentifierSearchableIterator.pathsIterator = value; }

// public java.util.Comparator lastIndexComparator() { return wrapperContained.lastIndexComparator; }
// public void lastIndexComparator(java.util.Comparator value) { wrapperContained.lastIndexComparator = value; }
// public static java.util.Comparator lastIndexComparator() { return net.minecraft.client.search.IdentifierSearchableIterator.lastIndexComparator; }
// public static void lastIndexComparator(java.util.Comparator value, ) { net.minecraft.client.search.IdentifierSearchableIterator.lastIndexComparator = value; }

public IdentifierSearchableIterator(java.util.Iterator namespacesIterator,java.util.Iterator pathsIterator,java.util.Comparator lastIndexComparator) { this.wrapperContained = new net.minecraft.client.search.IdentifierSearchableIterator(namespacesIterator,pathsIterator,lastIndexComparator); }

}