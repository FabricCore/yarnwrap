package yarnwrap.client.render.entity.model;
public class SkullEntityModel { public net.minecraft.client.render.entity.model.SkullEntityModel wrapperContained; public SkullEntityModel(net.minecraft.client.render.entity.model.SkullEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SkullEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SkullEntityModel.head = value.wrapperContained; }

// public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }
public static yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.SkullEntityModel.getModelData()); }
// public yarnwrap.client.model.TexturedModelData getHeadTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getHeadTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getHeadTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SkullEntityModel.getHeadTexturedModelData()); }
// public yarnwrap.client.model.TexturedModelData getSkullTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getSkullTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getSkullTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SkullEntityModel.getSkullTexturedModelData()); }

}