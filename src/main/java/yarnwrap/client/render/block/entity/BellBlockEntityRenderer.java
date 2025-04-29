package yarnwrap.client.render.block.entity;
public class BellBlockEntityRenderer { public net.minecraft.client.render.block.entity.BellBlockEntityRenderer wrapperContained; public BellBlockEntityRenderer(net.minecraft.client.render.block.entity.BellBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier BELL_BODY_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BELL_BODY_TEXTURE); }
// public void BELL_BODY_TEXTURE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.BELL_BODY_TEXTURE = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier BELL_BODY_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.block.entity.BellBlockEntityRenderer.BELL_BODY_TEXTURE); }
// public static void BELL_BODY_TEXTURE(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.block.entity.BellBlockEntityRenderer.BELL_BODY_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart bellBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.bellBody); }
// public void bellBody(yarnwrap.client.model.ModelPart value) { wrapperContained.bellBody = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart bellBody() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.block.entity.BellBlockEntityRenderer.bellBody); }
// public static void bellBody(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.block.entity.BellBlockEntityRenderer.bellBody = value.wrapperContained; }

// public java.lang.String BELL_BODY() { return wrapperContained.BELL_BODY; }
// public void BELL_BODY(java.lang.String value) { wrapperContained.BELL_BODY = value; }
// public static java.lang.String BELL_BODY() { return net.minecraft.client.render.block.entity.BellBlockEntityRenderer.BELL_BODY; }
// public static void BELL_BODY(java.lang.String value, ) { net.minecraft.client.render.block.entity.BellBlockEntityRenderer.BELL_BODY = value; }

// public BellBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.BellBlockEntityRenderer(ctx); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.block.entity.BellBlockEntityRenderer.getTexturedModelData()); }

}