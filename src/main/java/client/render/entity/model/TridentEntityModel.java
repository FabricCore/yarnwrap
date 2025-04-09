package yarnwrap.client.render.entity.model;
public class TridentEntityModel { public net.minecraft.client.render.entity.model.TridentEntityModel wrapperContained; public TridentEntityModel(net.minecraft.client.render.entity.model.TridentEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}