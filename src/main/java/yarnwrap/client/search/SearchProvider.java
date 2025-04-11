package yarnwrap.client.search;
public class SearchProvider { public net.minecraft.client.search.SearchProvider wrapperContained; public SearchProvider(net.minecraft.client.search.SearchProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List findAll(java.lang.String text) { return wrapperContained.findAll(text); }

}