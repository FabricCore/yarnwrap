package yarnwrap.client.render.model.json;
public class ModelVariantMap { public net.minecraft.client.render.model.json.ModelVariantMap wrapperContained; public ModelVariantMap(net.minecraft.client.render.model.json.ModelVariantMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.MultipartUnbakedModel multipartModel() { return new yarnwrap.client.render.model.MultipartUnbakedModel(wrapperContained.multipartModel); }
// public void multipartModel(yarnwrap.client.render.model.MultipartUnbakedModel value) { wrapperContained.multipartModel = value.wrapperContained; }
// public static yarnwrap.client.render.model.MultipartUnbakedModel multipartModel() { return new yarnwrap.client.render.model.MultipartUnbakedModel(net.minecraft.client.render.model.json.ModelVariantMap.multipartModel); }
// public static void multipartModel(yarnwrap.client.render.model.MultipartUnbakedModel value, ) { net.minecraft.client.render.model.json.ModelVariantMap.multipartModel = value.wrapperContained; }

// public java.util.Map variantMap() { return wrapperContained.variantMap; }
// public void variantMap(java.util.Map value) { wrapperContained.variantMap = value; }
// public static java.util.Map variantMap() { return net.minecraft.client.render.model.json.ModelVariantMap.variantMap; }
// public static void variantMap(java.util.Map value, ) { net.minecraft.client.render.model.json.ModelVariantMap.variantMap = value; }

public ModelVariantMap(java.util.List variantMapList) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelVariantMap(variantMapList); }
public ModelVariantMap(java.util.Map variantMap,yarnwrap.client.render.model.MultipartUnbakedModel multipartModel) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelVariantMap(variantMap,multipartModel.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.ModelVariantMap.equals(o); }
public yarnwrap.client.render.model.MultipartUnbakedModel getMultipartModel() { return new yarnwrap.client.render.model.MultipartUnbakedModel(wrapperContained.getMultipartModel()); }
// public static yarnwrap.client.render.model.MultipartUnbakedModel getMultipartModel() { return new yarnwrap.client.render.model.MultipartUnbakedModel(net.minecraft.client.render.model.json.ModelVariantMap.getMultipartModel()); }
public boolean hasMultipartModel() { return wrapperContained.hasMultipartModel(); }
// public static boolean hasMultipartModel() { return net.minecraft.client.render.model.json.ModelVariantMap.hasMultipartModel(); }
public java.util.Map getVariantMap() { return wrapperContained.getVariantMap(); }
// public static java.util.Map getVariantMap() { return net.minecraft.client.render.model.json.ModelVariantMap.getVariantMap(); }
// public yarnwrap.client.render.model.json.ModelVariantMap fromJson(Object context,java.io.Reader reader) { return new yarnwrap.client.render.model.json.ModelVariantMap(wrapperContained.fromJson(context,reader)); }
// public static yarnwrap.client.render.model.json.ModelVariantMap fromJson(Object context,java.io.Reader reader, ) { return new yarnwrap.client.render.model.json.ModelVariantMap(net.minecraft.client.render.model.json.ModelVariantMap.fromJson(context,reader)); }
public boolean containsVariant(java.lang.String key) { return wrapperContained.containsVariant(key); }
// public static boolean containsVariant(java.lang.String key, ) { return net.minecraft.client.render.model.json.ModelVariantMap.containsVariant(key); }
public java.util.Set getAllModels() { return wrapperContained.getAllModels(); }
// public static java.util.Set getAllModels() { return net.minecraft.client.render.model.json.ModelVariantMap.getAllModels(); }
public yarnwrap.client.render.model.json.WeightedUnbakedModel getVariant(java.lang.String key) { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(wrapperContained.getVariant(key)); }
// public static yarnwrap.client.render.model.json.WeightedUnbakedModel getVariant(java.lang.String key, ) { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(net.minecraft.client.render.model.json.ModelVariantMap.getVariant(key)); }
// public yarnwrap.client.render.model.json.ModelVariantMap fromJson(Object context,com.google.gson.JsonElement json) { return new yarnwrap.client.render.model.json.ModelVariantMap(wrapperContained.fromJson(context,json)); }
// public static yarnwrap.client.render.model.json.ModelVariantMap fromJson(Object context,com.google.gson.JsonElement json, ) { return new yarnwrap.client.render.model.json.ModelVariantMap(net.minecraft.client.render.model.json.ModelVariantMap.fromJson(context,json)); }

}