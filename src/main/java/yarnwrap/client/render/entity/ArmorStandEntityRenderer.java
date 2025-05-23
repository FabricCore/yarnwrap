package yarnwrap.client.render.entity;
public class ArmorStandEntityRenderer { public net.minecraft.client.render.entity.ArmorStandEntityRenderer wrapperContained; public ArmorStandEntityRenderer(net.minecraft.client.render.entity.ArmorStandEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.ArmorStandEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.ArmorStandEntityRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel mainModel() { return new yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel(wrapperContained.mainModel); }
// public void mainModel(yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel value) { wrapperContained.mainModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel mainModel() { return new yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel(net.minecraft.client.render.entity.ArmorStandEntityRenderer.mainModel); }
// public static void mainModel(yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel value, ) { net.minecraft.client.render.entity.ArmorStandEntityRenderer.mainModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel smallModel() { return new yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel(wrapperContained.smallModel); }
// public void smallModel(yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel value) { wrapperContained.smallModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel smallModel() { return new yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel(net.minecraft.client.render.entity.ArmorStandEntityRenderer.smallModel); }
// public static void smallModel(yarnwrap.client.render.entity.model.ArmorStandArmorEntityModel value, ) { net.minecraft.client.render.entity.ArmorStandEntityRenderer.smallModel = value.wrapperContained; }


}