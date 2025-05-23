package yarnwrap.client.render.model.json;
public class WeightedVariant { public net.minecraft.client.render.model.json.WeightedVariant wrapperContained; public WeightedVariant(net.minecraft.client.render.model.json.WeightedVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.Pool variants() { return new yarnwrap.util.collection.Pool(wrapperContained.variants); }
// public void variants(yarnwrap.util.collection.Pool value) { wrapperContained.variants = value.wrapperContained; }
// public static yarnwrap.util.collection.Pool variants() { return new yarnwrap.util.collection.Pool(net.minecraft.client.render.model.json.WeightedVariant.variants); }
// public static void variants(yarnwrap.util.collection.Pool value, ) { net.minecraft.client.render.model.json.WeightedVariant.variants = value.wrapperContained; }

// public yarnwrap.util.collection.Pool variants() { return new yarnwrap.util.collection.Pool(wrapperContained.variants()); }
// // public static yarnwrap.util.collection.Pool variants() { return new yarnwrap.util.collection.Pool(net.minecraft.client.render.model.json.WeightedVariant.variants()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.WeightedVariant.equals(o); }
public yarnwrap.client.render.model.json.WeightedVariant apply(yarnwrap.client.render.model.json.ModelVariantOperator operator) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.apply(operator.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant apply(yarnwrap.client.render.model.json.ModelVariantOperator operator, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.render.model.json.WeightedVariant.apply(operator.wrapperContained)); }
public Object toModel() { return wrapperContained.toModel(); }
// public static Object toModel() { return net.minecraft.client.render.model.json.WeightedVariant.toModel(); }

}