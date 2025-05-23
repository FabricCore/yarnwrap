package yarnwrap.client.render.entity.model;
public class CowEntityModel { public net.minecraft.client.render.entity.model.CowEntityModel wrapperContained; public CowEntityModel(net.minecraft.client.render.entity.model.CowEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.BABY_TRANSFORMER); }
// public void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.BABY_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.CowEntityModel.BABY_TRANSFORMER); }
// public static void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.CowEntityModel.BABY_TRANSFORMER = value.wrapperContained; }

public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
// public static yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.CowEntityModel.getHead()); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.CowEntityModel.getTexturedModelData()); }
// public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }
// public static yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.CowEntityModel.getModelData()); }

}