package yarnwrap.client.render.entity;
public class WitherSkullEntityRenderer { public net.minecraft.client.render.entity.WitherSkullEntityRenderer wrapperContained; public WitherSkullEntityRenderer(net.minecraft.client.render.entity.WitherSkullEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.client.render.entity.model.SkullEntityModel model() { return new yarnwrap.client.render.entity.model.SkullEntityModel(wrapperContained.model); }
// public yarnwrap.util.Identifier INVULNERABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INVULNERABLE_TEXTURE); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}