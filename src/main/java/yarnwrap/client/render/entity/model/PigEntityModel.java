package yarnwrap.client.render.entity.model;
public class PigEntityModel { public net.minecraft.client.render.entity.model.PigEntityModel wrapperContained; public PigEntityModel(net.minecraft.client.render.entity.model.PigEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public PigEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.PigEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}