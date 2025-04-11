package yarnwrap.client.render.entity;
public class TurtleEntityRenderer { public net.minecraft.client.render.entity.TurtleEntityRenderer wrapperContained; public TurtleEntityRenderer(net.minecraft.client.render.entity.TurtleEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }

}