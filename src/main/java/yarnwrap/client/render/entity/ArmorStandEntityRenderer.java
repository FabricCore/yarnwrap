package yarnwrap.client.render.entity;
public class ArmorStandEntityRenderer { public net.minecraft.client.render.entity.ArmorStandEntityRenderer wrapperContained; public ArmorStandEntityRenderer(net.minecraft.client.render.entity.ArmorStandEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }

}