package yarnwrap.client.render.entity;
public class GiantEntityRenderer { public net.minecraft.client.render.entity.GiantEntityRenderer wrapperContained; public GiantEntityRenderer(net.minecraft.client.render.entity.GiantEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
// public GiantEntityRenderer(Object ctx,float scale) { this.wrapperContained = new net.minecraft.client.render.entity.GiantEntityRenderer(ctx,scale); }

}