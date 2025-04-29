package yarnwrap.client.render.entity;
public class SkeletonEntityRenderer { public net.minecraft.client.render.entity.SkeletonEntityRenderer wrapperContained; public SkeletonEntityRenderer(net.minecraft.client.render.entity.SkeletonEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.SkeletonEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.SkeletonEntityRenderer.TEXTURE = value.wrapperContained; }

// public SkeletonEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.EntityModelLayer layer,yarnwrap.client.render.entity.model.EntityModelLayer legArmorLayer,yarnwrap.client.render.entity.model.EntityModelLayer bodyArmorLayer) { this.wrapperContained = new net.minecraft.client.render.entity.SkeletonEntityRenderer(ctx,layer.wrapperContained,legArmorLayer.wrapperContained,bodyArmorLayer.wrapperContained); }

}