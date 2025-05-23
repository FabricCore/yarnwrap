package yarnwrap.client.render.entity;
public class UndeadHorseEntityRenderer { public net.minecraft.client.render.entity.UndeadHorseEntityRenderer wrapperContained; public UndeadHorseEntityRenderer(net.minecraft.client.render.entity.UndeadHorseEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.UndeadHorseEntityRenderer.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.UndeadHorseEntityRenderer.texture = value.wrapperContained; }

// public UndeadHorseEntityRenderer(Object ctx,Object type) { this.wrapperContained = new net.minecraft.client.render.entity.UndeadHorseEntityRenderer(ctx,type); }

}