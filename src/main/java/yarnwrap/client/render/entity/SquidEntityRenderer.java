package yarnwrap.client.render.entity;
public class SquidEntityRenderer { public net.minecraft.client.render.entity.SquidEntityRenderer wrapperContained; public SquidEntityRenderer(net.minecraft.client.render.entity.SquidEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.SquidEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.SquidEntityRenderer.TEXTURE = value.wrapperContained; }

// public SquidEntityRenderer(Object context,yarnwrap.client.render.entity.model.SquidEntityModel model,yarnwrap.client.render.entity.model.SquidEntityModel babyModel) { this.wrapperContained = new net.minecraft.client.render.entity.SquidEntityRenderer(context,model.wrapperContained,babyModel.wrapperContained); }

}