package yarnwrap.client.render.model.json;
public class WeightedUnbakedModel { public net.minecraft.client.render.model.json.WeightedUnbakedModel wrapperContained; public WeightedUnbakedModel(net.minecraft.client.render.model.json.WeightedUnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List variants() { return wrapperContained.variants; }
public java.util.List getVariants() { return wrapperContained.getVariants(); }

}