package yarnwrap.client.render.entity;
public class ZombifiedPiglinEntityRenderer { public net.minecraft.client.render.entity.ZombifiedPiglinEntityRenderer wrapperContained; public ZombifiedPiglinEntityRenderer(net.minecraft.client.render.entity.ZombifiedPiglinEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ZombifiedPiglinEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ZombifiedPiglinEntityRenderer.TEXTURE = value.wrapperContained; }

// public ZombifiedPiglinEntityRenderer(Object context,yarnwrap.client.render.entity.model.EntityModelLayer mainLayer,yarnwrap.client.render.entity.model.EntityModelLayer babyMainLayer,yarnwrap.client.render.entity.model.EntityModelLayer armorInnerLayer,yarnwrap.client.render.entity.model.EntityModelLayer armorOuterLayer,yarnwrap.client.render.entity.model.EntityModelLayer babyArmorInnerLayer,yarnwrap.client.render.entity.model.EntityModelLayer babyArmorOuterLayer) { this.wrapperContained = new net.minecraft.client.render.entity.ZombifiedPiglinEntityRenderer(context,mainLayer.wrapperContained,babyMainLayer.wrapperContained,armorInnerLayer.wrapperContained,armorOuterLayer.wrapperContained,babyArmorInnerLayer.wrapperContained,babyArmorOuterLayer.wrapperContained); }

}