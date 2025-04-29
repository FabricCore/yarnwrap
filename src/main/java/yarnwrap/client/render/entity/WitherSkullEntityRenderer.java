package yarnwrap.client.render.entity;
public class WitherSkullEntityRenderer { public net.minecraft.client.render.entity.WitherSkullEntityRenderer wrapperContained; public WitherSkullEntityRenderer(net.minecraft.client.render.entity.WitherSkullEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.WitherSkullEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.WitherSkullEntityRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.SkullEntityModel model() { return new yarnwrap.client.render.entity.model.SkullEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.SkullEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.SkullEntityModel model() { return new yarnwrap.client.render.entity.model.SkullEntityModel(net.minecraft.client.render.entity.WitherSkullEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.SkullEntityModel value, ) { net.minecraft.client.render.entity.WitherSkullEntityRenderer.model = value.wrapperContained; }

// public yarnwrap.util.Identifier INVULNERABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INVULNERABLE_TEXTURE); }
// public void INVULNERABLE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.INVULNERABLE_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier INVULNERABLE_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.WitherSkullEntityRenderer.INVULNERABLE_TEXTURE); }
// public static void INVULNERABLE_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.WitherSkullEntityRenderer.INVULNERABLE_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.WitherSkullEntityRenderer.getTexturedModelData()); }

}