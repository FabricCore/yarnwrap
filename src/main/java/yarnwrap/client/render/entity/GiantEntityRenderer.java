package yarnwrap.client.render.entity;
public class GiantEntityRenderer { public net.minecraft.client.render.entity.GiantEntityRenderer wrapperContained; public GiantEntityRenderer(net.minecraft.client.render.entity.GiantEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.GiantEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.GiantEntityRenderer.TEXTURE = value.wrapperContained; }

// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
// public static float scale() { return net.minecraft.client.render.entity.GiantEntityRenderer.scale; }
// public static void scale(float value, ) { net.minecraft.client.render.entity.GiantEntityRenderer.scale = value; }

// public GiantEntityRenderer(Object ctx,float scale) { this.wrapperContained = new net.minecraft.client.render.entity.GiantEntityRenderer(ctx,scale); }

}