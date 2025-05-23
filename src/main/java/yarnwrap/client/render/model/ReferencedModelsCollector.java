package yarnwrap.client.render.model;
public class ReferencedModelsCollector { public net.minecraft.client.render.model.ReferencedModelsCollector wrapperContained; public ReferencedModelsCollector(net.minecraft.client.render.model.ReferencedModelsCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.model.ReferencedModelsCollector.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.model.ReferencedModelsCollector.LOGGER = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectMap modelCache() { return wrapperContained.modelCache; }
// public void modelCache(it.unimi.dsi.fastutil.objects.Object2ObjectMap value) { wrapperContained.modelCache = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectMap modelCache() { return net.minecraft.client.render.model.ReferencedModelsCollector.modelCache; }
// public static void modelCache(it.unimi.dsi.fastutil.objects.Object2ObjectMap value, ) { net.minecraft.client.render.model.ReferencedModelsCollector.modelCache = value; }

// public Object missingModel() { return wrapperContained.missingModel; }
// // public void missingModel(Object value) { wrapperContained.missingModel = value; }
// // public static Object missingModel() { return net.minecraft.client.render.model.ReferencedModelsCollector.missingModel; }
// // public static void missingModel(Object value, ) { net.minecraft.client.render.model.ReferencedModelsCollector.missingModel = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectFunction holder() { return wrapperContained.holder; }
// public void holder(it.unimi.dsi.fastutil.objects.Object2ObjectFunction value) { wrapperContained.holder = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectFunction holder() { return net.minecraft.client.render.model.ReferencedModelsCollector.holder; }
// public static void holder(it.unimi.dsi.fastutil.objects.Object2ObjectFunction value, ) { net.minecraft.client.render.model.ReferencedModelsCollector.holder = value; }

// public Object resolver() { return wrapperContained.resolver; }
// // public void resolver(Object value) { wrapperContained.resolver = value; }
// // public static Object resolver() { return net.minecraft.client.render.model.ReferencedModelsCollector.resolver; }
// // public static void resolver(Object value, ) { net.minecraft.client.render.model.ReferencedModelsCollector.resolver = value; }

// public java.util.Queue queue() { return wrapperContained.queue; }
// public void queue(java.util.Queue value) { wrapperContained.queue = value; }
// public static java.util.Queue queue() { return net.minecraft.client.render.model.ReferencedModelsCollector.queue; }
// public static void queue(java.util.Queue value, ) { net.minecraft.client.render.model.ReferencedModelsCollector.queue = value; }

public ReferencedModelsCollector(java.util.Map unbakedModels,yarnwrap.client.render.model.UnbakedModel missingModel) { this.wrapperContained = new net.minecraft.client.render.model.ReferencedModelsCollector(unbakedModels,missingModel.wrapperContained); }
// public void resolveAll(java.util.List models) { wrapperContained.resolveAll(models); }
// public static void resolveAll(java.util.List models, ) { net.minecraft.client.render.model.ReferencedModelsCollector.resolveAll(models); }
public void resolve(yarnwrap.client.render.model.ResolvableModel model) { wrapperContained.resolve(model.wrapperContained); }
// public static void resolve(yarnwrap.client.render.model.ResolvableModel model, ) { net.minecraft.client.render.model.ReferencedModelsCollector.resolve(model.wrapperContained); }
public yarnwrap.client.render.model.BakedSimpleModel getMissingModel() { return new yarnwrap.client.render.model.BakedSimpleModel(wrapperContained.getMissingModel()); }
// public static yarnwrap.client.render.model.BakedSimpleModel getMissingModel() { return new yarnwrap.client.render.model.BakedSimpleModel(net.minecraft.client.render.model.ReferencedModelsCollector.getMissingModel()); }
// public Object resolve(yarnwrap.util.Identifier id) { return wrapperContained.resolve(id.wrapperContained); }
// public static Object resolve(yarnwrap.util.Identifier id, ) { return net.minecraft.client.render.model.ReferencedModelsCollector.resolve(id.wrapperContained); }
public void addSpecialModel(yarnwrap.util.Identifier id,yarnwrap.client.render.model.UnbakedModel model) { wrapperContained.addSpecialModel(id.wrapperContained,model.wrapperContained); }
// public static void addSpecialModel(yarnwrap.util.Identifier id,yarnwrap.client.render.model.UnbakedModel model, ) { net.minecraft.client.render.model.ReferencedModelsCollector.addSpecialModel(id.wrapperContained,model.wrapperContained); }
// public void method_68025(Object id,yarnwrap.util.Identifier model) { wrapperContained.method_68025(id,model.wrapperContained); }
// public static void method_68025(Object id,yarnwrap.util.Identifier model, ) { net.minecraft.client.render.model.ReferencedModelsCollector.method_68025(id,model.wrapperContained); }
// public boolean isRootModel(yarnwrap.client.render.model.UnbakedModel model) { return wrapperContained.isRootModel(model.wrapperContained); }
// public static boolean isRootModel(yarnwrap.client.render.model.UnbakedModel model, ) { return net.minecraft.client.render.model.ReferencedModelsCollector.isRootModel(model.wrapperContained); }
// public Object method_68027(java.util.Map id) { return wrapperContained.method_68027(id); }
// public static Object method_68027(java.util.Map id, ) { return net.minecraft.client.render.model.ReferencedModelsCollector.method_68027(id); }
public java.util.Map collectModels() { return wrapperContained.collectModels(); }
// public static java.util.Map collectModels() { return net.minecraft.client.render.model.ReferencedModelsCollector.collectModels(); }
// public Object schedule(yarnwrap.util.Identifier id,yarnwrap.client.render.model.UnbakedModel model) { return wrapperContained.schedule(id.wrapperContained,model.wrapperContained); }
// public static Object schedule(yarnwrap.util.Identifier id,yarnwrap.client.render.model.UnbakedModel model, ) { return net.minecraft.client.render.model.ReferencedModelsCollector.schedule(id.wrapperContained,model.wrapperContained); }
// public void checkIfValid(java.util.List models) { wrapperContained.checkIfValid(models); }
// public static void checkIfValid(java.util.List models, ) { net.minecraft.client.render.model.ReferencedModelsCollector.checkIfValid(models); }

}