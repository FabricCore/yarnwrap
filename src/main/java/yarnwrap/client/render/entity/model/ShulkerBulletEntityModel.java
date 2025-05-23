package yarnwrap.client.render.entity.model;
public class ShulkerBulletEntityModel { public net.minecraft.client.render.entity.model.ShulkerBulletEntityModel wrapperContained; public ShulkerBulletEntityModel(net.minecraft.client.render.entity.model.ShulkerBulletEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bullet() { return new yarnwrap.client.model.ModelPart(wrapperContained.bullet); }
// public void bullet(yarnwrap.client.model.ModelPart value) { wrapperContained.bullet = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart bullet() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ShulkerBulletEntityModel.bullet); }
// public static void bullet(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ShulkerBulletEntityModel.bullet = value.wrapperContained; }

// public java.lang.String MAIN() { return wrapperContained.MAIN; }
// public void MAIN(java.lang.String value) { wrapperContained.MAIN = value; }
// public static java.lang.String MAIN() { return net.minecraft.client.render.entity.model.ShulkerBulletEntityModel.MAIN; }
// public static void MAIN(java.lang.String value, ) { net.minecraft.client.render.entity.model.ShulkerBulletEntityModel.MAIN = value; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ShulkerBulletEntityModel.getTexturedModelData()); }

}