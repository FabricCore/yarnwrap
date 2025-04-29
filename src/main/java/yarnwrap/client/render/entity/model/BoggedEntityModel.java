package yarnwrap.client.render.entity.model;
public class BoggedEntityModel { public net.minecraft.client.render.entity.model.BoggedEntityModel wrapperContained; public BoggedEntityModel(net.minecraft.client.render.entity.model.BoggedEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart mushrooms() { return new yarnwrap.client.model.ModelPart(wrapperContained.mushrooms); }
// public void mushrooms(yarnwrap.client.model.ModelPart value) { wrapperContained.mushrooms = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart mushrooms() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.BoggedEntityModel.mushrooms); }
// public static void mushrooms(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.BoggedEntityModel.mushrooms = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.BoggedEntityModel.getTexturedModelData()); }

}