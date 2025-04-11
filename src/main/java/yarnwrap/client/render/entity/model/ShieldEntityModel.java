package yarnwrap.client.render.entity.model;
public class ShieldEntityModel { public net.minecraft.client.render.entity.model.ShieldEntityModel wrapperContained; public ShieldEntityModel(net.minecraft.client.render.entity.model.ShieldEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public java.lang.String PLATE() { return wrapperContained.PLATE; }
// public void PLATE(java.lang.String value) { wrapperContained.PLATE = value; }
// public java.lang.String HANDLE() { return wrapperContained.HANDLE; }
// public void HANDLE(java.lang.String value) { wrapperContained.HANDLE = value; }
// public yarnwrap.client.model.ModelPart plate() { return new yarnwrap.client.model.ModelPart(wrapperContained.plate); }
// public void plate(yarnwrap.client.model.ModelPart value) { wrapperContained.plate = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart handle() { return new yarnwrap.client.model.ModelPart(wrapperContained.handle); }
// public void handle(yarnwrap.client.model.ModelPart value) { wrapperContained.handle = value.wrapperContained; }
public ShieldEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ShieldEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getPlate() { return new yarnwrap.client.model.ModelPart(wrapperContained.getPlate()); }
public yarnwrap.client.model.ModelPart getHandle() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHandle()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}