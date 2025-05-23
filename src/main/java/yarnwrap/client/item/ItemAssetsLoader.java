package yarnwrap.client.item;
public class ItemAssetsLoader { public net.minecraft.client.item.ItemAssetsLoader wrapperContained; public ItemAssetsLoader(net.minecraft.client.item.ItemAssetsLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.item.ItemAssetsLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.item.ItemAssetsLoader.LOGGER = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.item.ItemAssetsLoader.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.item.ItemAssetsLoader.FINDER = value.wrapperContained; }

// public void method_65927(yarnwrap.util.Identifier error) { wrapperContained.method_65927(error.wrapperContained); }
// public static void method_65927(yarnwrap.util.Identifier error, ) { net.minecraft.client.item.ItemAssetsLoader.method_65927(error.wrapperContained); }
// public java.util.concurrent.CompletableFuture load(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.load(resourceManager.wrapperContained,executor); }
// public static java.util.concurrent.CompletableFuture load(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor, ) { return net.minecraft.client.item.ItemAssetsLoader.load(resourceManager.wrapperContained,executor); }
// public Object method_65930(java.util.List definitions) { return wrapperContained.method_65930(definitions); }
// public static Object method_65930(java.util.List definitions, ) { return net.minecraft.client.item.ItemAssetsLoader.method_65930(definitions); }
// public void method_65931(java.util.List itemId,Object itemResource) { wrapperContained.method_65931(itemId,itemResource); }
// public static void method_65931(java.util.List itemId,Object itemResource, ) { net.minecraft.client.item.ItemAssetsLoader.method_65931(itemId,itemResource); }
// public java.util.concurrent.CompletionStage method_65932(Object itemAssets) { return wrapperContained.method_65932(itemAssets); }
// public static java.util.concurrent.CompletionStage method_65932(Object itemAssets, ) { return net.minecraft.client.item.ItemAssetsLoader.method_65932(itemAssets); }
// public yarnwrap.client.item.ItemAsset method_67292(yarnwrap.registry.ContextSwappableRegistryLookup itemAsset) { return new yarnwrap.client.item.ItemAsset(wrapperContained.method_67292(itemAsset.wrapperContained)); }
// public static yarnwrap.client.item.ItemAsset method_67292(yarnwrap.registry.ContextSwappableRegistryLookup itemAsset, ) { return new yarnwrap.client.item.ItemAsset(net.minecraft.client.item.ItemAssetsLoader.method_67292(itemAsset.wrapperContained)); }

}