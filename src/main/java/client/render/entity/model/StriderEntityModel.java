package yarnwrap.client.render.entity.model;
public class StriderEntityModel { public net.minecraft.client.render.entity.model.StriderEntityModel wrapperContained; public StriderEntityModel(net.minecraft.client.render.entity.model.StriderEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart rightBottomBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBottomBristle); }
// public yarnwrap.client.model.ModelPart rightMiddleBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightMiddleBristle); }
// public yarnwrap.client.model.ModelPart rightTopBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightTopBristle); }
// public yarnwrap.client.model.ModelPart leftTopBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftTopBristle); }
// public yarnwrap.client.model.ModelPart leftMiddleBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftMiddleBristle); }
// public yarnwrap.client.model.ModelPart leftBottomBristle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBottomBristle); }
// public java.lang.String RIGHT_BOTTOM_BRISTLE() { return wrapperContained.RIGHT_BOTTOM_BRISTLE; }
// public java.lang.String RIGHT_MIDDLE_BRISTLE() { return wrapperContained.RIGHT_MIDDLE_BRISTLE; }
// public java.lang.String RIGHT_TOP_BRISTLE() { return wrapperContained.RIGHT_TOP_BRISTLE; }
// public java.lang.String LEFT_TOP_BRISTLE() { return wrapperContained.LEFT_TOP_BRISTLE; }
// public java.lang.String LEFT_MIDDLE_BRISTLE() { return wrapperContained.LEFT_MIDDLE_BRISTLE; }
// public java.lang.String LEFT_BOTTOM_BRISTLE() { return wrapperContained.LEFT_BOTTOM_BRISTLE; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}