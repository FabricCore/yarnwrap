package yarnwrap.client.render.entity;
public class EndermanEntityRenderer { public net.minecraft.client.render.entity.EndermanEntityRenderer wrapperContained; public EndermanEntityRenderer(net.minecraft.client.render.entity.EndermanEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }

}