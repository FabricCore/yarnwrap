package yarnwrap.client.model;
public class TexturedModelData { public net.minecraft.client.model.TexturedModelData wrapperContained; public TexturedModelData(net.minecraft.client.model.TexturedModelData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelData data() { return new yarnwrap.client.model.ModelData(wrapperContained.data); }
// public void data(yarnwrap.client.model.ModelData value) { wrapperContained.data = value.wrapperContained; }
// public yarnwrap.client.model.TextureDimensions dimensions() { return new yarnwrap.client.model.TextureDimensions(wrapperContained.dimensions); }
// public void dimensions(yarnwrap.client.model.TextureDimensions value) { wrapperContained.dimensions = value.wrapperContained; }
public yarnwrap.client.model.ModelPart createModel() { return new yarnwrap.client.model.ModelPart(wrapperContained.createModel()); }
public yarnwrap.client.model.TexturedModelData of(yarnwrap.client.model.ModelData partData,int textureWidth,int textureHeight) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.of(partData.wrapperContained,textureWidth,textureHeight)); }

}