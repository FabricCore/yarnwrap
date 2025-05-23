package yarnwrap.client.render.entity;
public class ZombieBaseEntityRenderer { public net.minecraft.client.render.entity.ZombieBaseEntityRenderer wrapperContained; public ZombieBaseEntityRenderer(net.minecraft.client.render.entity.ZombieBaseEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ZombieBaseEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ZombieBaseEntityRenderer.TEXTURE = value.wrapperContained; }

// public ZombieBaseEntityRenderer(Object context,yarnwrap.client.render.entity.model.ZombieEntityModel mainModel,yarnwrap.client.render.entity.model.ZombieEntityModel babyMainModel,yarnwrap.client.render.entity.model.ZombieEntityModel armorInnerModel,yarnwrap.client.render.entity.model.ZombieEntityModel armorOuterModel,yarnwrap.client.render.entity.model.ZombieEntityModel babyArmorInnerModel,yarnwrap.client.render.entity.model.ZombieEntityModel babyArmorOuterModel) { this.wrapperContained = new net.minecraft.client.render.entity.ZombieBaseEntityRenderer(context,mainModel.wrapperContained,babyMainModel.wrapperContained,armorInnerModel.wrapperContained,armorOuterModel.wrapperContained,babyArmorInnerModel.wrapperContained,babyArmorOuterModel.wrapperContained); }

}