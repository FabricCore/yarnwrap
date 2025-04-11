package yarnwrap.client.render.entity;
public class SlimeEntityRenderer { public net.minecraft.client.render.entity.SlimeEntityRenderer wrapperContained; public SlimeEntityRenderer(net.minecraft.client.render.entity.SlimeEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }

}