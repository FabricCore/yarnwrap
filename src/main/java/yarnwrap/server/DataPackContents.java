package yarnwrap.server;
public class DataPackContents { public net.minecraft.server.DataPackContents wrapperContained; public DataPackContents(net.minecraft.server.DataPackContents wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture COMPLETED_UNIT() { return wrapperContained.COMPLETED_UNIT; }
// public void COMPLETED_UNIT(java.util.concurrent.CompletableFuture value) { wrapperContained.COMPLETED_UNIT = value; }
// public static java.util.concurrent.CompletableFuture COMPLETED_UNIT() { return net.minecraft.server.DataPackContents.COMPLETED_UNIT; }
// public static void COMPLETED_UNIT(java.util.concurrent.CompletableFuture value, ) { net.minecraft.server.DataPackContents.COMPLETED_UNIT = value; }

// public yarnwrap.server.command.CommandManager commandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.commandManager); }
// public void commandManager(yarnwrap.server.command.CommandManager value) { wrapperContained.commandManager = value.wrapperContained; }
// public static yarnwrap.server.command.CommandManager commandManager() { return new yarnwrap.server.command.CommandManager(net.minecraft.server.DataPackContents.commandManager); }
// public static void commandManager(yarnwrap.server.command.CommandManager value, ) { net.minecraft.server.DataPackContents.commandManager = value.wrapperContained; }

// public yarnwrap.recipe.RecipeManager recipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.recipeManager); }
// public void recipeManager(yarnwrap.recipe.RecipeManager value) { wrapperContained.recipeManager = value.wrapperContained; }
// public static yarnwrap.recipe.RecipeManager recipeManager() { return new yarnwrap.recipe.RecipeManager(net.minecraft.server.DataPackContents.recipeManager); }
// public static void recipeManager(yarnwrap.recipe.RecipeManager value, ) { net.minecraft.server.DataPackContents.recipeManager = value.wrapperContained; }

// public yarnwrap.registry.tag.TagManagerLoader registryTagManager() { return new yarnwrap.registry.tag.TagManagerLoader(wrapperContained.registryTagManager); }
// public void registryTagManager(yarnwrap.registry.tag.TagManagerLoader value) { wrapperContained.registryTagManager = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagManagerLoader registryTagManager() { return new yarnwrap.registry.tag.TagManagerLoader(net.minecraft.server.DataPackContents.registryTagManager); }
// public static void registryTagManager(yarnwrap.registry.tag.TagManagerLoader value, ) { net.minecraft.server.DataPackContents.registryTagManager = value.wrapperContained; }

// public yarnwrap.server.ServerAdvancementLoader serverAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.serverAdvancementLoader); }
// public void serverAdvancementLoader(yarnwrap.server.ServerAdvancementLoader value) { wrapperContained.serverAdvancementLoader = value.wrapperContained; }
// public static yarnwrap.server.ServerAdvancementLoader serverAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(net.minecraft.server.DataPackContents.serverAdvancementLoader); }
// public static void serverAdvancementLoader(yarnwrap.server.ServerAdvancementLoader value, ) { net.minecraft.server.DataPackContents.serverAdvancementLoader = value.wrapperContained; }

// public yarnwrap.server.function.FunctionLoader functionLoader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.functionLoader); }
// public void functionLoader(yarnwrap.server.function.FunctionLoader value) { wrapperContained.functionLoader = value.wrapperContained; }
// public static yarnwrap.server.function.FunctionLoader functionLoader() { return new yarnwrap.server.function.FunctionLoader(net.minecraft.server.DataPackContents.functionLoader); }
// public static void functionLoader(yarnwrap.server.function.FunctionLoader value, ) { net.minecraft.server.DataPackContents.functionLoader = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.DataPackContents.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.DataPackContents.LOGGER = value; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.server.DataPackContents.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.server.DataPackContents.registryLookup = value; }

// public Object reloadableRegistries() { return wrapperContained.reloadableRegistries; }
// // public void reloadableRegistries(Object value) { wrapperContained.reloadableRegistries = value; }
// // public static Object reloadableRegistries() { return net.minecraft.server.DataPackContents.reloadableRegistries; }
// // public static void reloadableRegistries(Object value, ) { net.minecraft.server.DataPackContents.reloadableRegistries = value; }

// public DataPackContents(Object dynamicRegistryManager,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,int functionPermissionLevel) { this.wrapperContained = new net.minecraft.server.DataPackContents(dynamicRegistryManager,enabledFeatures.wrapperContained,environment,functionPermissionLevel); }
public yarnwrap.server.function.FunctionLoader getFunctionLoader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.getFunctionLoader()); }
// public static yarnwrap.server.function.FunctionLoader getFunctionLoader() { return new yarnwrap.server.function.FunctionLoader(net.minecraft.server.DataPackContents.getFunctionLoader()); }
// public java.util.concurrent.CompletableFuture reload(yarnwrap.resource.ResourceManager manager,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,int functionPermissionLevel,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor) { return wrapperContained.reload(manager.wrapperContained,dynamicRegistries.wrapperContained,enabledFeatures.wrapperContained,environment,functionPermissionLevel,prepareExecutor,applyExecutor); }
// public static java.util.concurrent.CompletableFuture reload(yarnwrap.resource.ResourceManager manager,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,int functionPermissionLevel,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor, ) { return net.minecraft.server.DataPackContents.reload(manager.wrapperContained,dynamicRegistries.wrapperContained,enabledFeatures.wrapperContained,environment,functionPermissionLevel,prepareExecutor,applyExecutor); }
public yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(wrapperContained.getRecipeManager()); }
// public static yarnwrap.recipe.RecipeManager getRecipeManager() { return new yarnwrap.recipe.RecipeManager(net.minecraft.server.DataPackContents.getRecipeManager()); }
public yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.getCommandManager()); }
// public static yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(net.minecraft.server.DataPackContents.getCommandManager()); }
public yarnwrap.server.ServerAdvancementLoader getServerAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.getServerAdvancementLoader()); }
// public static yarnwrap.server.ServerAdvancementLoader getServerAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(net.minecraft.server.DataPackContents.getServerAdvancementLoader()); }
public void refresh() { wrapperContained.refresh(); }
// public static void refresh() { net.minecraft.server.DataPackContents.refresh(); }
// public void repopulateTags(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,Object tags) { wrapperContained.repopulateTags(dynamicRegistryManager.wrapperContained,tags); }
// public static void repopulateTags(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,Object tags, ) { net.minecraft.server.DataPackContents.repopulateTags(dynamicRegistryManager.wrapperContained,tags); }
// public java.util.List method_40423(Object entry) { return wrapperContained.method_40423(entry); }
// public static java.util.List method_40423(Object entry, ) { return net.minecraft.server.DataPackContents.method_40423(entry); }
// public yarnwrap.registry.tag.TagKey method_40424(yarnwrap.registry.RegistryKey entry) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_40424(entry.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_40424(yarnwrap.registry.RegistryKey entry, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.server.DataPackContents.method_40424(entry.wrapperContained)); }
// public yarnwrap.server.DataPackContents method_40425(yarnwrap.server.DataPackContents void_) { return new yarnwrap.server.DataPackContents(wrapperContained.method_40425(void_.wrapperContained)); }
// public static yarnwrap.server.DataPackContents method_40425(yarnwrap.server.DataPackContents void_, ) { return new yarnwrap.server.DataPackContents(net.minecraft.server.DataPackContents.method_40425(void_.wrapperContained)); }
// public void method_40426(Object tags) { wrapperContained.method_40426(tags); }
// public static void method_40426(Object tags, ) { net.minecraft.server.DataPackContents.method_40426(tags); }
public java.util.List getContents() { return wrapperContained.getContents(); }
// public static java.util.List getContents() { return net.minecraft.server.DataPackContents.getContents(); }
// public void method_42095(yarnwrap.server.DataPackContents void_,java.lang.Object throwable) { wrapperContained.method_42095(void_.wrapperContained,throwable); }
// public static void method_42095(yarnwrap.server.DataPackContents void_,java.lang.Object throwable, ) { net.minecraft.server.DataPackContents.method_42095(void_.wrapperContained,throwable); }
// public java.util.concurrent.CompletionStage method_58296(yarnwrap.resource.featuretoggle.FeatureSet reloadedDynamicRegistries) { return wrapperContained.method_58296(reloadedDynamicRegistries.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_58296(yarnwrap.resource.featuretoggle.FeatureSet reloadedDynamicRegistries, ) { return net.minecraft.server.DataPackContents.method_58296(reloadedDynamicRegistries.wrapperContained); }
public Object getReloadableRegistries() { return wrapperContained.getReloadableRegistries(); }
// public static Object getReloadableRegistries() { return net.minecraft.server.DataPackContents.getReloadableRegistries(); }

}