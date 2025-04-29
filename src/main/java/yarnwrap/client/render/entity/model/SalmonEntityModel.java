package yarnwrap.client.render.entity.model;
public class SalmonEntityModel { public net.minecraft.client.render.entity.model.SalmonEntityModel wrapperContained; public SalmonEntityModel(net.minecraft.client.render.entity.model.SalmonEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SalmonEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SalmonEntityModel.root = value.wrapperContained; }

// public java.lang.String BODY_FRONT() { return wrapperContained.BODY_FRONT; }
// public void BODY_FRONT(java.lang.String value) { wrapperContained.BODY_FRONT = value; }
// public static java.lang.String BODY_FRONT() { return net.minecraft.client.render.entity.model.SalmonEntityModel.BODY_FRONT; }
// public static void BODY_FRONT(java.lang.String value, ) { net.minecraft.client.render.entity.model.SalmonEntityModel.BODY_FRONT = value; }

// public java.lang.String BODY_BACK() { return wrapperContained.BODY_BACK; }
// public void BODY_BACK(java.lang.String value) { wrapperContained.BODY_BACK = value; }
// public static java.lang.String BODY_BACK() { return net.minecraft.client.render.entity.model.SalmonEntityModel.BODY_BACK; }
// public static void BODY_BACK(java.lang.String value, ) { net.minecraft.client.render.entity.model.SalmonEntityModel.BODY_BACK = value; }

// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SalmonEntityModel.tail); }
// public static void tail(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SalmonEntityModel.tail = value.wrapperContained; }

public SalmonEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SalmonEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SalmonEntityModel.getTexturedModelData()); }

}