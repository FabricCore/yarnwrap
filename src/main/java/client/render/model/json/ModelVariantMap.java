package yarnwrap.client.render.model.json;
public class ModelVariantMap { public net.minecraft.client.render.model.json.ModelVariantMap wrapperContained; public ModelVariantMap(net.minecraft.client.render.model.json.ModelVariantMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.MultipartUnbakedModel multipartModel() { return new yarnwrap.client.render.model.MultipartUnbakedModel(wrapperContained.multipartModel); }
// public java.util.Map variantMap() { return wrapperContained.variantMap; }
public yarnwrap.client.render.model.MultipartUnbakedModel getMultipartModel() { return new yarnwrap.client.render.model.MultipartUnbakedModel(wrapperContained.getMultipartModel()); }
public boolean hasMultipartModel() { return wrapperContained.hasMultipartModel(); }
public java.util.Map getVariantMap() { return wrapperContained.getVariantMap(); }
// public yarnwrap.client.render.model.json.ModelVariantMap fromJson(Object context,java.io.Reader reader) { return new yarnwrap.client.render.model.json.ModelVariantMap(wrapperContained.fromJson(context,reader)); }
public boolean containsVariant(java.lang.String key) { return wrapperContained.containsVariant(key); }
public java.util.Set getAllModels() { return wrapperContained.getAllModels(); }
public yarnwrap.client.render.model.json.WeightedUnbakedModel getVariant(java.lang.String key) { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(wrapperContained.getVariant(key)); }
// public yarnwrap.client.render.model.json.ModelVariantMap fromJson(Object context,com.google.gson.JsonElement json) { return new yarnwrap.client.render.model.json.ModelVariantMap(wrapperContained.fromJson(context,json)); }

}