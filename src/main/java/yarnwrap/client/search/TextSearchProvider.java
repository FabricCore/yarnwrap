package yarnwrap.client.search;
public class TextSearchProvider { public net.minecraft.client.search.TextSearchProvider wrapperContained; public TextSearchProvider(net.minecraft.client.search.TextSearchProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.search.SearchProvider textSearcher() { return new yarnwrap.client.search.SearchProvider(wrapperContained.textSearcher); }
// public void textSearcher(yarnwrap.client.search.SearchProvider value) { wrapperContained.textSearcher = value.wrapperContained; }
public TextSearchProvider(java.util.function.Function textsGetter,java.util.function.Function identifiersGetter,java.util.List values) { this.wrapperContained = new net.minecraft.client.search.TextSearchProvider(textsGetter,identifiersGetter,values); }

}