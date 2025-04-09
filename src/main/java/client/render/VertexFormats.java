package yarnwrap.client.render;
public class VertexFormats { public net.minecraft.client.render.VertexFormats wrapperContained; public VertexFormats(net.minecraft.client.render.VertexFormats wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.VertexFormat POSITION_TEXTURE_COLOR() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_TEXTURE_COLOR); }
public yarnwrap.client.render.VertexFormat POSITION_COLOR() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_COLOR); }
public yarnwrap.client.render.VertexFormat POSITION_TEXTURE_COLOR_NORMAL() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_TEXTURE_COLOR_NORMAL); }
public yarnwrap.client.render.VertexFormat POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL); }
public yarnwrap.client.render.VertexFormat POSITION_TEXTURE_COLOR_LIGHT() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_TEXTURE_COLOR_LIGHT); }
public yarnwrap.client.render.VertexFormat POSITION_TEXTURE() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_TEXTURE); }
public yarnwrap.client.render.VertexFormat POSITION_TEXTURE_LIGHT_COLOR() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_TEXTURE_LIGHT_COLOR); }
public yarnwrap.client.render.VertexFormat POSITION_COLOR_TEXTURE_LIGHT_NORMAL() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_COLOR_TEXTURE_LIGHT_NORMAL); }
public yarnwrap.client.render.VertexFormat POSITION() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION); }
public yarnwrap.client.render.VertexFormat POSITION_COLOR_TEXTURE_LIGHT() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_COLOR_TEXTURE_LIGHT); }
public yarnwrap.client.render.VertexFormat POSITION_COLOR_LIGHT() { return new yarnwrap.client.render.VertexFormat(wrapperContained.POSITION_COLOR_LIGHT); }
public yarnwrap.client.render.VertexFormat BLIT_SCREEN() { return new yarnwrap.client.render.VertexFormat(wrapperContained.BLIT_SCREEN); }
public yarnwrap.client.render.VertexFormat LINES() { return new yarnwrap.client.render.VertexFormat(wrapperContained.LINES); }

}