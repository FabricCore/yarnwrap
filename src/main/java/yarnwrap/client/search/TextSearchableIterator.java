package yarnwrap.client.search;
public class TextSearchableIterator { public net.minecraft.client.search.TextSearchableIterator wrapperContained; public TextSearchableIterator(net.minecraft.client.search.TextSearchableIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.PeekingIterator idPathsIterator() { return wrapperContained.idPathsIterator; }
// public void idPathsIterator(com.google.common.collect.PeekingIterator value) { wrapperContained.idPathsIterator = value; }
// public static com.google.common.collect.PeekingIterator idPathsIterator() { return net.minecraft.client.search.TextSearchableIterator.idPathsIterator; }
// public static void idPathsIterator(com.google.common.collect.PeekingIterator value, ) { net.minecraft.client.search.TextSearchableIterator.idPathsIterator = value; }

// public com.google.common.collect.PeekingIterator textsIterator() { return wrapperContained.textsIterator; }
// public void textsIterator(com.google.common.collect.PeekingIterator value) { wrapperContained.textsIterator = value; }
// public static com.google.common.collect.PeekingIterator textsIterator() { return net.minecraft.client.search.TextSearchableIterator.textsIterator; }
// public static void textsIterator(com.google.common.collect.PeekingIterator value, ) { net.minecraft.client.search.TextSearchableIterator.textsIterator = value; }

// public java.util.Comparator lastIndexComparator() { return wrapperContained.lastIndexComparator; }
// public void lastIndexComparator(java.util.Comparator value) { wrapperContained.lastIndexComparator = value; }
// public static java.util.Comparator lastIndexComparator() { return net.minecraft.client.search.TextSearchableIterator.lastIndexComparator; }
// public static void lastIndexComparator(java.util.Comparator value, ) { net.minecraft.client.search.TextSearchableIterator.lastIndexComparator = value; }

public TextSearchableIterator(java.util.Iterator idPathsIterator,java.util.Iterator textsIterator,java.util.Comparator lastIndexComparator) { this.wrapperContained = new net.minecraft.client.search.TextSearchableIterator(idPathsIterator,textsIterator,lastIndexComparator); }

}