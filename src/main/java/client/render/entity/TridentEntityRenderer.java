package yarnwrap.client.render.entity;
public class TridentEntityRenderer { public net.minecraft.client.render.entity.TridentEntityRenderer wrapperContained; public TridentEntityRenderer(net.minecraft.client.render.entity.TridentEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.client.render.entity.model.TridentEntityModel model() { return new yarnwrap.client.render.entity.model.TridentEntityModel(wrapperContained.model); }

}