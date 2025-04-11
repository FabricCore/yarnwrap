package yarnwrap.client.render.entity;
public class SpiderEntityRenderer { public net.minecraft.client.render.entity.SpiderEntityRenderer wrapperContained; public SpiderEntityRenderer(net.minecraft.client.render.entity.SpiderEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public SpiderEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.EntityModelLayer layer) { this.wrapperContained = new net.minecraft.client.render.entity.SpiderEntityRenderer(ctx,layer.wrapperContained); }

}