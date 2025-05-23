package yarnwrap.client.render.block.entity;
public class BellBlockEntityRenderer { public net.minecraft.client.render.block.entity.BellBlockEntityRenderer wrapperContained; public BellBlockEntityRenderer(net.minecraft.client.render.block.entity.BellBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier BELL_BODY_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BELL_BODY_TEXTURE); }
// public void BELL_BODY_TEXTURE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.BELL_BODY_TEXTURE = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier BELL_BODY_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.block.entity.BellBlockEntityRenderer.BELL_BODY_TEXTURE); }
// public static void BELL_BODY_TEXTURE(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.block.entity.BellBlockEntityRenderer.BELL_BODY_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.block.entity.model.BellBlockModel bellBody() { return new yarnwrap.client.render.block.entity.model.BellBlockModel(wrapperContained.bellBody); }
// public void bellBody(yarnwrap.client.render.block.entity.model.BellBlockModel value) { wrapperContained.bellBody = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.model.BellBlockModel bellBody() { return new yarnwrap.client.render.block.entity.model.BellBlockModel(net.minecraft.client.render.block.entity.BellBlockEntityRenderer.bellBody); }
// public static void bellBody(yarnwrap.client.render.block.entity.model.BellBlockModel value, ) { net.minecraft.client.render.block.entity.BellBlockEntityRenderer.bellBody = value.wrapperContained; }

// public BellBlockEntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.block.entity.BellBlockEntityRenderer(context); }

}