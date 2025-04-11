package yarnwrap.client.render.entity.model;
public class GoatEntityModel { public net.minecraft.client.render.entity.model.GoatEntityModel wrapperContained; public GoatEntityModel(net.minecraft.client.render.entity.model.GoatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public GoatEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.GoatEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}