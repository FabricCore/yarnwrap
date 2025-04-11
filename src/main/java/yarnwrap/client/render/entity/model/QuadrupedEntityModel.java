package yarnwrap.client.render.entity.model;
public class QuadrupedEntityModel { public net.minecraft.client.render.entity.model.QuadrupedEntityModel wrapperContained; public QuadrupedEntityModel(net.minecraft.client.render.entity.model.QuadrupedEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public void rightHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public void leftHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public void rightFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public void leftFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public QuadrupedEntityModel(yarnwrap.client.model.ModelPart root,boolean headScaled,float childHeadYOffset,float childHeadZOffset,float invertedChildHeadScale,float invertedChildBodyScale,int childBodyYOffset) { this.wrapperContained = new net.minecraft.client.render.entity.model.QuadrupedEntityModel(root.wrapperContained,headScaled,childHeadYOffset,childHeadZOffset,invertedChildHeadScale,invertedChildBodyScale,childBodyYOffset); }
public yarnwrap.client.model.ModelData getModelData(int stanceWidth,yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(stanceWidth,dilation.wrapperContained)); }

}