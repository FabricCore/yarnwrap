package yarnwrap.client.render.entity;
public class BreezeEntityRenderer { public net.minecraft.client.render.entity.BreezeEntityRenderer wrapperContained; public BreezeEntityRenderer(net.minecraft.client.render.entity.BreezeEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public yarnwrap.client.render.entity.model.BreezeEntityModel updatePartVisibility(yarnwrap.client.render.entity.model.BreezeEntityModel model,net.minecraft.client.model.ModelPart[] modelParts) { return new yarnwrap.client.render.entity.model.BreezeEntityModel(wrapperContained.updatePartVisibility(model.wrapperContained,modelParts)); }

}