package yarnwrap.client.render.entity.model;
public class PigEntityModel { public net.minecraft.client.render.entity.model.PigEntityModel wrapperContained; public PigEntityModel(net.minecraft.client.render.entity.model.PigEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.BABY_TRANSFORMER); }
// public void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.BABY_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.PigEntityModel.BABY_TRANSFORMER); }
// public static void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.PigEntityModel.BABY_TRANSFORMER = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }
// public static yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.PigEntityModel.getTexturedModelData(dilation.wrapperContained)); }
// public yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(dilation.wrapperContained)); }
// public static yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation, ) { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.PigEntityModel.getModelData(dilation.wrapperContained)); }

}