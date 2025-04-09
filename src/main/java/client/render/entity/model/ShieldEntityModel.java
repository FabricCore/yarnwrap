package yarnwrap.client.render.entity.model;
public class ShieldEntityModel { public net.minecraft.client.render.entity.model.ShieldEntityModel wrapperContained; public ShieldEntityModel(net.minecraft.client.render.entity.model.ShieldEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String PLATE() { return wrapperContained.PLATE; }
// public java.lang.String HANDLE() { return wrapperContained.HANDLE; }
// public yarnwrap.client.model.ModelPart plate() { return new yarnwrap.client.model.ModelPart(wrapperContained.plate); }
// public yarnwrap.client.model.ModelPart handle() { return new yarnwrap.client.model.ModelPart(wrapperContained.handle); }
public yarnwrap.client.model.ModelPart getPlate() { return new yarnwrap.client.model.ModelPart(wrapperContained.getPlate()); }
public yarnwrap.client.model.ModelPart getHandle() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHandle()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}