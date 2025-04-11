package yarnwrap.client.render.item;
public class ItemModels { public net.minecraft.client.render.item.ItemModels wrapperContained; public ItemModels(net.minecraft.client.render.item.ItemModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.BakedModelManager modelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.modelManager); }
// public void modelManager(yarnwrap.client.render.model.BakedModelManager value) { wrapperContained.modelManager = value.wrapperContained; }
public it.unimi.dsi.fastutil.ints.Int2ObjectMap modelIds() { return wrapperContained.modelIds; }
// public void modelIds(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.modelIds = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap models() { return wrapperContained.models; }
// public void models(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.models = value; }
public ItemModels(yarnwrap.client.render.model.BakedModelManager modelManager) { this.wrapperContained = new net.minecraft.client.render.item.ItemModels(modelManager.wrapperContained); }
public yarnwrap.client.render.model.BakedModelManager getModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.getModelManager()); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.Item item) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(item.wrapperContained)); }
// public int getModelId(yarnwrap.item.Item item) { return wrapperContained.getModelId(item.wrapperContained); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.item.ItemStack stack) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(stack.wrapperContained)); }
public void putModel(yarnwrap.item.Item item,yarnwrap.client.util.ModelIdentifier modelId) { wrapperContained.putModel(item.wrapperContained,modelId.wrapperContained); }
public void reloadModels() { wrapperContained.reloadModels(); }

}