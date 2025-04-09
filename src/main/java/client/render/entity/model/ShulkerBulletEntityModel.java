package yarnwrap.client.render.entity.model;
public class ShulkerBulletEntityModel { public net.minecraft.client.render.entity.model.ShulkerBulletEntityModel wrapperContained; public ShulkerBulletEntityModel(net.minecraft.client.render.entity.model.ShulkerBulletEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String MAIN() { return wrapperContained.MAIN; }
// public yarnwrap.client.model.ModelPart bullet() { return new yarnwrap.client.model.ModelPart(wrapperContained.bullet); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}