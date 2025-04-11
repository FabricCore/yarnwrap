package yarnwrap.client.render.entity.model;
public class StriderEntityModel { public net.minecraft.client.render.entity.model.StriderEntityModel wrapperContained; public StriderEntityModel(net.minecraft.client.render.entity.model.StriderEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightBottomBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBottomBristle); }
// public void rightBottomBristle(yarnwrap.client.model.ModelPart value) { wrapperContained.rightBottomBristle = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightMiddleBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightMiddleBristle); }
// public void rightMiddleBristle(yarnwrap.client.model.ModelPart value) { wrapperContained.rightMiddleBristle = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightTopBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightTopBristle); }
// public void rightTopBristle(yarnwrap.client.model.ModelPart value) { wrapperContained.rightTopBristle = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftTopBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftTopBristle); }
// public void leftTopBristle(yarnwrap.client.model.ModelPart value) { wrapperContained.leftTopBristle = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftMiddleBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftMiddleBristle); }
// public void leftMiddleBristle(yarnwrap.client.model.ModelPart value) { wrapperContained.leftMiddleBristle = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftBottomBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBottomBristle); }
// public void leftBottomBristle(yarnwrap.client.model.ModelPart value) { wrapperContained.leftBottomBristle = value.wrapperContained; }
// public java.lang.String RIGHT_BOTTOM_BRISTLE() { return wrapperContained.RIGHT_BOTTOM_BRISTLE; }
// public void RIGHT_BOTTOM_BRISTLE(java.lang.String value) { wrapperContained.RIGHT_BOTTOM_BRISTLE = value; }
// public java.lang.String RIGHT_MIDDLE_BRISTLE() { return wrapperContained.RIGHT_MIDDLE_BRISTLE; }
// public void RIGHT_MIDDLE_BRISTLE(java.lang.String value) { wrapperContained.RIGHT_MIDDLE_BRISTLE = value; }
// public java.lang.String RIGHT_TOP_BRISTLE() { return wrapperContained.RIGHT_TOP_BRISTLE; }
// public void RIGHT_TOP_BRISTLE(java.lang.String value) { wrapperContained.RIGHT_TOP_BRISTLE = value; }
// public java.lang.String LEFT_TOP_BRISTLE() { return wrapperContained.LEFT_TOP_BRISTLE; }
// public void LEFT_TOP_BRISTLE(java.lang.String value) { wrapperContained.LEFT_TOP_BRISTLE = value; }
// public java.lang.String LEFT_MIDDLE_BRISTLE() { return wrapperContained.LEFT_MIDDLE_BRISTLE; }
// public void LEFT_MIDDLE_BRISTLE(java.lang.String value) { wrapperContained.LEFT_MIDDLE_BRISTLE = value; }
// public java.lang.String LEFT_BOTTOM_BRISTLE() { return wrapperContained.LEFT_BOTTOM_BRISTLE; }
// public void LEFT_BOTTOM_BRISTLE(java.lang.String value) { wrapperContained.LEFT_BOTTOM_BRISTLE = value; }
public StriderEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.StriderEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}