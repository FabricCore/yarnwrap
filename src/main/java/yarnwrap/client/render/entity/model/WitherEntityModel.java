package yarnwrap.client.render.entity.model;
public class WitherEntityModel { public net.minecraft.client.render.entity.model.WitherEntityModel wrapperContained; public WitherEntityModel(net.minecraft.client.render.entity.model.WitherEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart centerHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.centerHead); }
// public void centerHead(yarnwrap.client.model.ModelPart value) { wrapperContained.centerHead = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHead); }
// public void rightHead(yarnwrap.client.model.ModelPart value) { wrapperContained.rightHead = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHead); }
// public void leftHead(yarnwrap.client.model.ModelPart value) { wrapperContained.leftHead = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart ribcage() { return new yarnwrap.client.model.ModelPart(wrapperContained.ribcage); }
// public void ribcage(yarnwrap.client.model.ModelPart value) { wrapperContained.ribcage = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public java.lang.String RIBCAGE() { return wrapperContained.RIBCAGE; }
// public void RIBCAGE(java.lang.String value) { wrapperContained.RIBCAGE = value; }
// public java.lang.String CENTER_HEAD() { return wrapperContained.CENTER_HEAD; }
// public void CENTER_HEAD(java.lang.String value) { wrapperContained.CENTER_HEAD = value; }
// public java.lang.String RIGHT_HEAD() { return wrapperContained.RIGHT_HEAD; }
// public void RIGHT_HEAD(java.lang.String value) { wrapperContained.RIGHT_HEAD = value; }
// public java.lang.String LEFT_HEAD() { return wrapperContained.LEFT_HEAD; }
// public void LEFT_HEAD(java.lang.String value) { wrapperContained.LEFT_HEAD = value; }
// public float RIBCAGE_PITCH_OFFSET() { return wrapperContained.RIBCAGE_PITCH_OFFSET; }
// public void RIBCAGE_PITCH_OFFSET(float value) { wrapperContained.RIBCAGE_PITCH_OFFSET = value; }
// public float TAIL_PITCH_OFFSET() { return wrapperContained.TAIL_PITCH_OFFSET; }
// public void TAIL_PITCH_OFFSET(float value) { wrapperContained.TAIL_PITCH_OFFSET = value; }
public WitherEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.WitherEntityModel(root.wrapperContained); }
// public void rotateHead(yarnwrap.entity.boss.WitherEntity entity,yarnwrap.client.model.ModelPart head,int sigma) { wrapperContained.rotateHead(entity.wrapperContained,head.wrapperContained,sigma); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}