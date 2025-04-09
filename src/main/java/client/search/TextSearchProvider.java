package yarnwrap.client.search;
public class TextSearchProvider { public net.minecraft.client.search.TextSearchProvider wrapperContained; public TextSearchProvider(net.minecraft.client.search.TextSearchProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.search.SearchProvider textSearcher() { return new yarnwrap.client.search.SearchProvider(wrapperContained.textSearcher); }

}