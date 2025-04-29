package yarnwrap.client.render.entity;
public class TridentEntityRenderer { public net.minecraft.client.render.entity.TridentEntityRenderer wrapperContained; public TridentEntityRenderer(net.minecraft.client.render.entity.TridentEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.TridentEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.TridentEntityRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.TridentEntityModel model() { return new yarnwrap.client.render.entity.model.TridentEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.TridentEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.TridentEntityModel model() { return new yarnwrap.client.render.entity.model.TridentEntityModel(net.minecraft.client.render.entity.TridentEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.TridentEntityModel value, ) { net.minecraft.client.render.entity.TridentEntityRenderer.model = value.wrapperContained; }


}