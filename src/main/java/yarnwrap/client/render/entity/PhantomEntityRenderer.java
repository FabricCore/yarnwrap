package yarnwrap.client.render.entity;
public class PhantomEntityRenderer { public net.minecraft.client.render.entity.PhantomEntityRenderer wrapperContained; public PhantomEntityRenderer(net.minecraft.client.render.entity.PhantomEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.PhantomEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.PhantomEntityRenderer.TEXTURE = value.wrapperContained; }


}