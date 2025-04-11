package yarnwrap.client.render.entity;
public class ElderGuardianEntityRenderer { public net.minecraft.client.render.entity.ElderGuardianEntityRenderer wrapperContained; public ElderGuardianEntityRenderer(net.minecraft.client.render.entity.ElderGuardianEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }

}