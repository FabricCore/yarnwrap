package yarnwrap.client.render.entity;
public class BoggedEntityRenderer { public net.minecraft.client.render.entity.BoggedEntityRenderer wrapperContained; public BoggedEntityRenderer(net.minecraft.client.render.entity.BoggedEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_TEXTURE); }
// public void OVERLAY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.OVERLAY_TEXTURE = value.wrapperContained; }

}