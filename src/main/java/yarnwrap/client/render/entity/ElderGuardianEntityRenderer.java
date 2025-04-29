package yarnwrap.client.render.entity;
public class ElderGuardianEntityRenderer { public net.minecraft.client.render.entity.ElderGuardianEntityRenderer wrapperContained; public ElderGuardianEntityRenderer(net.minecraft.client.render.entity.ElderGuardianEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ElderGuardianEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ElderGuardianEntityRenderer.TEXTURE = value.wrapperContained; }


}