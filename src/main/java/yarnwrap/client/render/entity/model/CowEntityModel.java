package yarnwrap.client.render.entity.model;
public class CowEntityModel { public net.minecraft.client.render.entity.model.CowEntityModel wrapperContained; public CowEntityModel(net.minecraft.client.render.entity.model.CowEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public CowEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.CowEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}