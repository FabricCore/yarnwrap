package yarnwrap.client.render.model;
public class MultipartBakedModel { public net.minecraft.client.render.model.MultipartBakedModel wrapperContained; public MultipartBakedModel(net.minecraft.client.render.model.MultipartBakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sideLit() { return wrapperContained.sideLit; }
// public void sideLit(boolean value) { wrapperContained.sideLit = value; }
// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public yarnwrap.client.render.model.json.ModelTransformation transformations() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformations); }
// public void transformations(yarnwrap.client.render.model.json.ModelTransformation value) { wrapperContained.transformations = value.wrapperContained; }
// public java.util.List components() { return wrapperContained.components; }
// public void components(java.util.List value) { wrapperContained.components = value; }
// public yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.itemPropertyOverrides); }
// public void itemPropertyOverrides(yarnwrap.client.render.model.json.ModelOverrideList value) { wrapperContained.itemPropertyOverrides = value.wrapperContained; }
// public boolean depthGui() { return wrapperContained.depthGui; }
// public void depthGui(boolean value) { wrapperContained.depthGui = value; }
// public boolean ambientOcclusion() { return wrapperContained.ambientOcclusion; }
// public void ambientOcclusion(boolean value) { wrapperContained.ambientOcclusion = value; }
// public java.util.Map stateCache() { return wrapperContained.stateCache; }
// public void stateCache(java.util.Map value) { wrapperContained.stateCache = value; }
public MultipartBakedModel(java.util.List components) { this.wrapperContained = new net.minecraft.client.render.model.MultipartBakedModel(components); }

}