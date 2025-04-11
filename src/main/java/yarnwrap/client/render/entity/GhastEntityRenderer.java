package yarnwrap.client.render.entity;
public class GhastEntityRenderer { public net.minecraft.client.render.entity.GhastEntityRenderer wrapperContained; public GhastEntityRenderer(net.minecraft.client.render.entity.GhastEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ANGRY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ANGRY_TEXTURE); }
// public void ANGRY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ANGRY_TEXTURE = value.wrapperContained; }

}