package yarnwrap.client.render.model.json;
public class WeightedUnbakedModel { public net.minecraft.client.render.model.json.WeightedUnbakedModel wrapperContained; public WeightedUnbakedModel(net.minecraft.client.render.model.json.WeightedUnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List variants() { return wrapperContained.variants; }
// public void variants(java.util.List value) { wrapperContained.variants = value; }
// public static java.util.List variants() { return net.minecraft.client.render.model.json.WeightedUnbakedModel.variants; }
// public static void variants(java.util.List value, ) { net.minecraft.client.render.model.json.WeightedUnbakedModel.variants = value; }

public WeightedUnbakedModel(java.util.List variants) { this.wrapperContained = new net.minecraft.client.render.model.json.WeightedUnbakedModel(variants); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.WeightedUnbakedModel.equals(o); }
public java.util.List getVariants() { return wrapperContained.getVariants(); }
// public static java.util.List getVariants() { return net.minecraft.client.render.model.json.WeightedUnbakedModel.getVariants(); }
// public void method_45788(java.util.function.Function id) { wrapperContained.method_45788(id); }
// public static void method_45788(java.util.function.Function id, ) { net.minecraft.client.render.model.json.WeightedUnbakedModel.method_45788(id); }

}