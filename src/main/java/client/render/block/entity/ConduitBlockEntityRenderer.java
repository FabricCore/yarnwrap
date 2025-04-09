package yarnwrap.client.render.block.entity;
public class ConduitBlockEntityRenderer { public net.minecraft.client.render.block.entity.ConduitBlockEntityRenderer wrapperContained; public ConduitBlockEntityRenderer(net.minecraft.client.render.block.entity.ConduitBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart conduitEye() { return new yarnwrap.client.model.ModelPart(wrapperContained.conduitEye); }
// public yarnwrap.client.model.ModelPart conduitWind() { return new yarnwrap.client.model.ModelPart(wrapperContained.conduitWind); }
// public yarnwrap.client.model.ModelPart conduitShell() { return new yarnwrap.client.model.ModelPart(wrapperContained.conduitShell); }
// public yarnwrap.client.model.ModelPart conduit() { return new yarnwrap.client.model.ModelPart(wrapperContained.conduit); }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher dispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.dispatcher); }
public yarnwrap.client.util.SpriteIdentifier WIND_VERTICAL_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WIND_VERTICAL_TEXTURE); }
public yarnwrap.client.util.SpriteIdentifier WIND_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WIND_TEXTURE); }
public yarnwrap.client.util.SpriteIdentifier BASE_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BASE_TEXTURE); }
public yarnwrap.client.util.SpriteIdentifier CAGE_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.CAGE_TEXTURE); }
public yarnwrap.client.util.SpriteIdentifier OPEN_EYE_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.OPEN_EYE_TEXTURE); }
public yarnwrap.client.util.SpriteIdentifier CLOSED_EYE_TEXTURE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.CLOSED_EYE_TEXTURE); }
public yarnwrap.client.model.TexturedModelData getEyeTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getEyeTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getWindTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getWindTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getShellTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getShellTexturedModelData()); }
public yarnwrap.client.model.TexturedModelData getPlainTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getPlainTexturedModelData()); }

}