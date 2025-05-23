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

// public yarnwrap.recipe.ServerRecipeManager recipeManager() { return new yarnwrap.recipe.ServerRecipeManager(wrapperContained.recipeManager); }
// public void recipeManager(yarnwrap.recipe.ServerRecipeManager value) { wrapperContained.recipeManager = value.wrapperContained; }
// public static yarnwrap.recipe.ServerRecipeManager recipeManager() { return new yarnwrap.recipe.ServerRecipeManager(net.minecraft.server.DataPackContents.recipeManager); }
// public static void recipeManager(yarnwrap.recipe.ServerRecipeManager value, ) { net.minecraft.server.DataPackContents.recipeManager = value.wrapperContained; }

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

// public Object reloadableRegistries() { return wrapperContained.reloadableRegistries; }
// // public void reloadableRegistries(Object value) { wrapperContained.reloadableRegistries = value; }
// // public static Object reloadableRegistries() { return net.minecraft.server.DataPackContents.reloadableRegistries; }
// // public static void reloadableRegistries(Object value, ) { net.minecraft.server.DataPackContents.reloadableRegistries = value; }

// public java.util.List pendingTagLoads() { return wrapperContained.pendingTagLoads; }
// public void pendingTagLoads(java.util.List value) { wrapperContained.pendingTagLoads = value; }
// public static java.util.List pendingTagLoads() { return net.minecraft.server.DataPackContents.pendingTagLoads; }
// public static void pendingTagLoads(java.util.List value, ) { net.minecraft.server.DataPackContents.pendingTagLoads = value; }

// public DataPackContents(yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,java.util.List pendingTagLoads,int functionPermissionLevel) { this.wrapperContained = new net.minecraft.server.DataPackContents(dynamicRegistries.wrapperContained,registries,enabledFeatures.wrapperContained,environment,pendingTagLoads,functionPermissionLevel); }
public yarnwrap.server.function.FunctionLoader getFunctionLoader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.getFunctionLoader()); }
// public static yarnwrap.server.function.FunctionLoader getFunctionLoader() { return new yarnwrap.server.function.FunctionLoader(net.minecraft.server.DataPackContents.getFunctionLoader()); }
// public java.util.concurrent.CompletableFuture reload(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List pendingTagLoads,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,int functionPermissionLevel,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor) { return wrapperContained.reload(resourceManager.wrapperContained,dynamicRegistries.wrapperContained,pendingTagLoads,enabledFeatures.wrapperContained,environment,functionPermissionLevel,prepareExecutor,applyExecutor); }
// public static java.util.concurrent.CompletableFuture reload(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,java.util.List pendingTagLoads,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,Object environment,int functionPermissionLevel,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor, ) { return net.minecraft.server.DataPackContents.reload(resourceManager.wrapperContained,dynamicRegistries.wrapperContained,pendingTagLoads,enabledFeatures.wrapperContained,environment,functionPermissionLevel,prepareExecutor,applyExecutor); }
public yarnwrap.recipe.ServerRecipeManager getRecipeManager() { return new yarnwrap.recipe.ServerRecipeManager(wrapperContained.getRecipeManager()); }
// public static yarnwrap.recipe.ServerRecipeManager getRecipeManager() { return new yarnwrap.recipe.ServerRecipeManager(net.minecraft.server.DataPackContents.getRecipeManager()); }
public yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(wrapperContained.getCommandManager()); }
// public static yarnwrap.server.command.CommandManager getCommandManager() { return new yarnwrap.server.command.CommandManager(net.minecraft.server.DataPackContents.getCommandManager()); }
public yarnwrap.server.ServerAdvancementLoader getServerAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(wrapperContained.getServerAdvancementLoader()); }
// public static yarnwrap.server.ServerAdvancementLoader getServerAdvancementLoader() { return new yarnwrap.server.ServerAdvancementLoader(net.minecraft.server.DataPackContents.getServerAdvancementLoader()); }
// public yarnwrap.server.DataPackContents method_40425(yarnwrap.server.DataPackContents void_) { return new yarnwrap.server.DataPackContents(wrapperContained.method_40425(void_.wrapperContained)); }
// public static yarnwrap.server.DataPackContents method_40425(yarnwrap.server.DataPackContents void_, ) { return new yarnwrap.server.DataPackContents(net.minecraft.server.DataPackContents.method_40425(void_.wrapperContained)); }
public java.util.List getContents() { return wrapperContained.getContents(); }
// public static java.util.List getContents() { return net.minecraft.server.DataPackContents.getContents(); }
// public java.util.concurrent.CompletionStage method_58296(yarnwrap.resource.featuretoggle.FeatureSet reloadResult) { return wrapperContained.method_58296(reloadResult.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_58296(yarnwrap.resource.featuretoggle.FeatureSet reloadResult, ) { return net.minecraft.server.DataPackContents.method_58296(reloadResult.wrapperContained); }
public Object getReloadableRegistries() { return wrapperContained.getReloadableRegistries(); }
// public static Object getReloadableRegistries() { return net.minecraft.server.DataPackContents.getReloadableRegistries(); }
public void applyPendingTagLoads() { wrapperContained.applyPendingTagLoads(); }
// public static void applyPendingTagLoads() { net.minecraft.server.DataPackContents.applyPendingTagLoads(); }

}