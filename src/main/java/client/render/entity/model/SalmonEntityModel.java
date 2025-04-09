package yarnwrap.client.render.entity.model;
public class SalmonEntityModel { public net.minecraft.client.render.entity.model.SalmonEntityModel wrapperContained; public SalmonEntityModel(net.minecraft.client.render.entity.model.SalmonEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String BODY_FRONT() { return wrapperContained.BODY_FRONT; }
// public java.lang.String BODY_BACK() { return wrapperContained.BODY_BACK; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}