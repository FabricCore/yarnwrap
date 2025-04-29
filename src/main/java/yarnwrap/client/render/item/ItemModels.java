package yarnwrap.client.render.item;
public class ItemModels { public net.minecraft.client.render.item.ItemModels wrapperContained; public ItemModels(net.minecraft.client.render.item.ItemModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.BakedModelManager modelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.modelManager); }
// public void modelManager(yarnwrap.client.render.model.BakedModelManager value) { wrapperContained.modelManager = value.wrapperContained; }
// public static yarnwrap.client.render.model.BakedModelManager modelManager() { return new yarnwrap.client.render.model.BakedModelManager(net.minecraft.client.render.item.ItemModels.modelManager); }
// public static void modelManager(yarnwrap.client.render.model.BakedModelManager value, ) { net.minecraft.client.render.item.ItemModels.modelManager = value.wrapperContained; }

public it.unimi.dsi.fastutil.ints.Int2ObjectMap modelIds() { return wrapperContained.modelIds; }
// public void modelIds(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.modelIds = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap modelIds() { return net.minecraft.client.render.item.ItemModels.modelIds; }
// public static void modelIds(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.render.item.ItemModels.modelIds = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap models() { return wrapperContained.models; }
// public void models(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.models = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap models() { return net.minecraft.client.render.item.ItemModels.models; }
// public static void models(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.render.item.ItemModels.models = value; }

public ItemModels(yarnwrap.client.render.model.BakedModelManager modelManager) { this.wrapperContained = new net.minecraft.client.render.item.ItemModels(modelManager.wrapperContained); }
public yarnwrap.client.render.model.BakedModelManager getModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.getModelManager()); }
// public static yarnwrap.client.render.model.BakedModelManager getModelManager() { return new yarnwrap.client.render.model.BakedModelManager(net.minecraft.client.render.item.ItemModels.getModelManager()); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.Item item) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(item.wrapperContained)); }
// public static yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.Item item, ) { return new yarnwrap.client.render.model.BakedModel(net.minecraft.client.render.item.ItemModels.getModel(item.wrapperContained)); }
// public int getModelId(yarnwrap.item.Item item) { return wrapperContained.getModelId(item.wrapperContained); }
// public static int getModelId(yarnwrap.item.Item item, ) { return net.minecraft.client.render.item.ItemModels.getModelId(item.wrapperContained); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.ItemStack stack) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(stack.wrapperContained)); }
// public static yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.client.render.model.BakedModel(net.minecraft.client.render.item.ItemModels.getModel(stack.wrapperContained)); }
public void putModel(yarnwrap.item.Item item,yarnwrap.client.util.ModelIdentifier modelId) { wrapperContained.putModel(item.wrapperContained,modelId.wrapperContained); }
// public static void putModel(yarnwrap.item.Item item,yarnwrap.client.util.ModelIdentifier modelId, ) { net.minecraft.client.render.item.ItemModels.putModel(item.wrapperContained,modelId.wrapperContained); }
public void reloadModels() { wrapperContained.reloadModels(); }
// public static void reloadModels() { net.minecraft.client.render.item.ItemModels.reloadModels(); }

}