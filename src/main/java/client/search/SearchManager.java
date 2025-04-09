package yarnwrap.client.search;
public class SearchManager { public net.minecraft.client.search.SearchManager wrapperContained; public SearchManager(net.minecraft.client.search.SearchManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object RECIPE_OUTPUT() { return wrapperContained.RECIPE_OUTPUT; }
// public java.util.concurrent.CompletableFuture itemTooltipReloadFuture() { return wrapperContained.itemTooltipReloadFuture; }
// public java.util.concurrent.CompletableFuture itemTagReloadFuture() { return wrapperContained.itemTagReloadFuture; }
// public java.util.concurrent.CompletableFuture recipeOutputReloadFuture() { return wrapperContained.recipeOutputReloadFuture; }
// public java.util.Map reloaders() { return wrapperContained.reloaders; }
// public Object ITEM_TAG() { return wrapperContained.ITEM_TAG; }
// public Object ITEM_TOOLTIP() { return wrapperContained.ITEM_TOOLTIP; }
public void refresh() { wrapperContained.refresh(); }
// public void addRecipeOutputReloader(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,Object registryManager) { wrapperContained.addRecipeOutputReloader(recipeBook.wrapperContained,registryManager); }
// public void addReloader(Object key,java.lang.Runnable reloader) { wrapperContained.addReloader(key,reloader); }
public void addItemTagReloader(java.util.List stacks) { wrapperContained.addItemTagReloader(stacks); }
// public java.util.stream.Stream collectItemTooltips(java.util.stream.Stream stacks,Object context,yarnwrap.item.tooltip.TooltipType type) { return wrapperContained.collectItemTooltips(stacks,context,type.wrapperContained); }
// public void addItemTooltipReloader(Object registryLookup,java.util.List stacks) { wrapperContained.addItemTooltipReloader(registryLookup,stacks); }
public yarnwrap.client.search.SearchProvider getRecipeOutputReloadFuture() { return new yarnwrap.client.search.SearchProvider(wrapperContained.getRecipeOutputReloadFuture()); }
public yarnwrap.client.search.SearchProvider getItemTagReloadFuture() { return new yarnwrap.client.search.SearchProvider(wrapperContained.getItemTagReloadFuture()); }
public yarnwrap.client.search.SearchProvider getItemTooltipReloadFuture() { return new yarnwrap.client.search.SearchProvider(wrapperContained.getItemTooltipReloadFuture()); }

}