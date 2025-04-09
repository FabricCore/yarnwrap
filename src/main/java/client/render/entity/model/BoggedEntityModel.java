package yarnwrap.client.render.entity.model;
public class BoggedEntityModel { public net.minecraft.client.render.entity.model.BoggedEntityModel wrapperContained; public BoggedEntityModel(net.minecraft.client.render.entity.model.BoggedEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart mushrooms() { return new yarnwrap.client.model.ModelPart(wrapperContained.mushrooms); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}