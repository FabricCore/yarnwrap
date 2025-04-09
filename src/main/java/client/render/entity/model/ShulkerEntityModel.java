package yarnwrap.client.render.entity.model;
public class ShulkerEntityModel { public net.minecraft.client.render.entity.model.ShulkerEntityModel wrapperContained; public ShulkerEntityModel(net.minecraft.client.render.entity.model.ShulkerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LID() { return wrapperContained.LID; }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public yarnwrap.client.model.ModelPart base() { return new yarnwrap.client.model.ModelPart(wrapperContained.base); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart lid() { return new yarnwrap.client.model.ModelPart(wrapperContained.lid); }
public yarnwrap.client.model.ModelPart getLid() { return new yarnwrap.client.model.ModelPart(wrapperContained.getLid()); }
public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}