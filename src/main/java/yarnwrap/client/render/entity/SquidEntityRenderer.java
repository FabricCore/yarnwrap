package yarnwrap.client.render.entity;
public class SquidEntityRenderer { public net.minecraft.client.render.entity.SquidEntityRenderer wrapperContained; public SquidEntityRenderer(net.minecraft.client.render.entity.SquidEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }

}