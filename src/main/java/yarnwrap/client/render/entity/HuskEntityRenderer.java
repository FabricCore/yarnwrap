package yarnwrap.client.render.entity;
public class HuskEntityRenderer { public net.minecraft.client.render.entity.HuskEntityRenderer wrapperContained; public HuskEntityRenderer(net.minecraft.client.render.entity.HuskEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.HuskEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.HuskEntityRenderer.TEXTURE = value.wrapperContained; }


}