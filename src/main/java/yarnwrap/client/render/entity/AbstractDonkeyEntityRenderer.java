package yarnwrap.client.render.entity;
public class AbstractDonkeyEntityRenderer { public net.minecraft.client.render.entity.AbstractDonkeyEntityRenderer wrapperContained; public AbstractDonkeyEntityRenderer(net.minecraft.client.render.entity.AbstractDonkeyEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.AbstractDonkeyEntityRenderer.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.AbstractDonkeyEntityRenderer.texture = value.wrapperContained; }

// public AbstractDonkeyEntityRenderer(Object context,Object type) { this.wrapperContained = new net.minecraft.client.render.entity.AbstractDonkeyEntityRenderer(context,type); }

}