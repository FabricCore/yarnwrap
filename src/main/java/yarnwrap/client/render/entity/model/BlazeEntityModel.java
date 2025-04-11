package yarnwrap.client.render.entity.model;
public class BlazeEntityModel { public net.minecraft.client.render.entity.model.BlazeEntityModel wrapperContained; public BlazeEntityModel(net.minecraft.client.render.entity.model.BlazeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public net.minecraft.client.model.ModelPart[] rods() { return wrapperContained.rods; }
// public void rods(net.minecraft.client.model.ModelPart[] value) { wrapperContained.rods = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getRodName(int index) { return wrapperContained.getRodName(index); }

}