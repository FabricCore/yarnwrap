package yarnwrap.client.render.entity;
public class FoxEntityRenderer { public net.minecraft.client.render.entity.FoxEntityRenderer wrapperContained; public FoxEntityRenderer(net.minecraft.client.render.entity.FoxEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.util.Identifier SLEEPING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLEEPING_TEXTURE); }
// public yarnwrap.util.Identifier SNOW_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SNOW_TEXTURE); }
// public yarnwrap.util.Identifier SLEEPING_SNOW_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLEEPING_SNOW_TEXTURE); }

}