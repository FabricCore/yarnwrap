package yarnwrap.client.render.block.entity;
public class BellBlockEntityRenderer { public net.minecraft.client.render.block.entity.BellBlockEntityRenderer wrapperContained; public BellBlockEntityRenderer(net.minecraft.client.render.block.entity.BellBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.util.SpriteIdentifier BELL_BODY_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BELL_BODY_TEXTURE); }
// public yarnwrap.client.model.ModelPart bellBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.bellBody); }
// public java.lang.String BELL_BODY() { return wrapperContained.BELL_BODY; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}