package yarnwrap.client.render.entity;
public class ArrowEntityRenderer { public net.minecraft.client.render.entity.ArrowEntityRenderer wrapperContained; public ArrowEntityRenderer(net.minecraft.client.render.entity.ArrowEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TIPPED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TIPPED_TEXTURE); }
// public void TIPPED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TIPPED_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TIPPED_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ArrowEntityRenderer.TIPPED_TEXTURE); }
// public static void TIPPED_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ArrowEntityRenderer.TIPPED_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ArrowEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ArrowEntityRenderer.TEXTURE = value.wrapperContained; }


}