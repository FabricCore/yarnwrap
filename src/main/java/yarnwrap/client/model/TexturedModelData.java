package yarnwrap.client.model;
public class TexturedModelData { public net.minecraft.client.model.TexturedModelData wrapperContained; public TexturedModelData(net.minecraft.client.model.TexturedModelData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelData data() { return new yarnwrap.client.model.ModelData(wrapperContained.data); }
// public void data(yarnwrap.client.model.ModelData value) { wrapperContained.data = value.wrapperContained; }
// public static yarnwrap.client.model.ModelData data() { return new yarnwrap.client.model.ModelData(net.minecraft.client.model.TexturedModelData.data); }
// public static void data(yarnwrap.client.model.ModelData value, ) { net.minecraft.client.model.TexturedModelData.data = value.wrapperContained; }

// public yarnwrap.client.model.TextureDimensions dimensions() { return new yarnwrap.client.model.TextureDimensions(wrapperContained.dimensions); }
// public void dimensions(yarnwrap.client.model.TextureDimensions value) { wrapperContained.dimensions = value.wrapperContained; }
// public static yarnwrap.client.model.TextureDimensions dimensions() { return new yarnwrap.client.model.TextureDimensions(net.minecraft.client.model.TexturedModelData.dimensions); }
// public static void dimensions(yarnwrap.client.model.TextureDimensions value, ) { net.minecraft.client.model.TexturedModelData.dimensions = value.wrapperContained; }

// public TexturedModelData(yarnwrap.client.model.ModelData data,yarnwrap.client.model.TextureDimensions dimensions) { this.wrapperContained = new net.minecraft.client.model.TexturedModelData(data.wrapperContained,dimensions.wrapperContained); }
public yarnwrap.client.model.ModelPart createModel() { return new yarnwrap.client.model.ModelPart(wrapperContained.createModel()); }
// public static yarnwrap.client.model.ModelPart createModel() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.model.TexturedModelData.createModel()); }
// public yarnwrap.client.model.TexturedModelData of(yarnwrap.client.model.ModelData partData,int textureWidth,int textureHeight) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.of(partData.wrapperContained,textureWidth,textureHeight)); }
// public static yarnwrap.client.model.TexturedModelData of(yarnwrap.client.model.ModelData partData,int textureWidth,int textureHeight, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.model.TexturedModelData.of(partData.wrapperContained,textureWidth,textureHeight)); }
public yarnwrap.client.model.TexturedModelData transform(yarnwrap.client.render.entity.model.ModelTransformer transformer) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.transform(transformer.wrapperContained)); }
// public static yarnwrap.client.model.TexturedModelData transform(yarnwrap.client.render.entity.model.ModelTransformer transformer, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.model.TexturedModelData.transform(transformer.wrapperContained)); }

}