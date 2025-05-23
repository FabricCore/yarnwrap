package yarnwrap.client.render;
public class MapRenderState { public net.minecraft.client.render.MapRenderState wrapperContained; public MapRenderState(net.minecraft.client.render.MapRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.MapRenderState.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.MapRenderState.texture = value.wrapperContained; }

public java.util.List decorations() { return wrapperContained.decorations; }
// public void decorations(java.util.List value) { wrapperContained.decorations = value; }
// public static java.util.List decorations() { return net.minecraft.client.render.MapRenderState.decorations; }
// public static void decorations(java.util.List value, ) { net.minecraft.client.render.MapRenderState.decorations = value; }


}