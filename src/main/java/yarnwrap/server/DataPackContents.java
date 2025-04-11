package yarnwrap.server;
public class DataPackContents { public net.minecraft.server.DataPackContents wrapperContained; public DataPackContents(net.minecraft.server.DataPackContents wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture COMPLETED_UNIT() { return wrapperContained.COMPLETED_UNIT; }
// public void COMPLETED_UNIT(java.util.concurrent.CompletableFuture value) { wrapperContained.COMPLETED_UNIT = value; }
// public yarnwrap.server.command.CommandManager commandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.commandManager); }
// public void commandManager(yarnwrap.server.command.CommandManager value) { wrapperContained.commandManager = value.wrapperContained; }
// public yarnwrap.recipe.RecipeManager recipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.recipeManager); }
// public void recipeManager(yarnwrap.recipe.RecipeManager value) { wrapperContained.recipeManager = value.wrapperContained; }
// public yarnwrap.registry.tag.TagManagerLoader registryTagManager() { return new yarnwrap.registry.tag.TagManagerLoader(wrapperContained.registryTagManager); }
// public void registryTagManager(yarnwrap.registry.tag.TagManagerLoader value) { wrapperContained.registryTagManager = value.wrapperContained; }
// public yarnwrap.server.ServerAdvancementLoader serverAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.serverAdvancementLoader); }
// public void serverAdvancementLoader(yarnwrap.server.ServerAdvancementLoader value) { wrapperContained.serverAdvancementLoader = value.wrapperContained; }
// public yarnwrap.server.function.FunctionLoader functionLoader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.functionLoader); }
// public void functionLoader(yarnwrap.server.function.FunctionLoader value) { wrapperContained.functionLoader = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// public Object reloadableRegistries() { return wrapperContained.reloadableRegistries; }
// // public void reloadableRegistries(Object value) { wrapperContained.reloadableRegistries = value; }
public yarnwrap.server.function.FunctionLoader getFunctionLoader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.getFunctionLoader()); }
// public java.util.concurrent.CompletableFuture reload(yarnwrap.resource.ResourceManager manager,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,int functionPermissionLevel,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor) { return wrapperContained.reload(manager.wrapperContained,dynamicRegistries.wrapperContained,enabledFeatures.wrapperContained,environment,functionPermissionLevel,prepareExecutor,applyExecutor); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
public yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.getCommandManager()); }
public yarnwrap.server.ServerAdvancementLoader getServerAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.getServerAdvancementLoader()); }
public void refresh() { wrapperContained.refresh(); }
// public void repopulateTags(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,Object tags) { wrapperContained.repopulateTags(dynamicRegistryManager.wrapperContained,tags); }
public java.util.List getContents() { return wrapperContained.getContents(); }
public Object getReloadableRegistries() { return wrapperContained.getReloadableRegistries(); }

}