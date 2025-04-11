package yarnwrap.client.render.entity.model;
public class ShulkerBulletEntityModel { public net.minecraft.client.render.entity.model.ShulkerBulletEntityModel wrapperContained; public ShulkerBulletEntityModel(net.minecraft.client.render.entity.model.ShulkerBulletEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public java.lang.String MAIN() { return wrapperContained.MAIN; }
// public void MAIN(java.lang.String value) { wrapperContained.MAIN = value; }
// public yarnwrap.client.model.ModelPart bullet() { return new yarnwrap.client.model.ModelPart(wrapperContained.bullet); }
// public void bullet(yarnwrap.client.model.ModelPart value) { wrapperContained.bullet = value.wrapperContained; }
public ShulkerBulletEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ShulkerBulletEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}