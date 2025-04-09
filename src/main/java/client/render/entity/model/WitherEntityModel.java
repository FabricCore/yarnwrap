package yarnwrap.client.render.entity.model;
public class WitherEntityModel { public net.minecraft.client.render.entity.model.WitherEntityModel wrapperContained; public WitherEntityModel(net.minecraft.client.render.entity.model.WitherEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart centerHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.centerHead); }
// public yarnwrap.client.model.ModelPart rightHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHead); }
// public yarnwrap.client.model.ModelPart leftHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHead); }
// public yarnwrap.client.model.ModelPart ribcage() { return new yarnwrap.client.model.ModelPart(wrapperContained.ribcage); }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public java.lang.String RIBCAGE() { return wrapperContained.RIBCAGE; }
// public java.lang.String CENTER_HEAD() { return wrapperContained.CENTER_HEAD; }
// public java.lang.String RIGHT_HEAD() { return wrapperContained.RIGHT_HEAD; }
// public java.lang.String LEFT_HEAD() { return wrapperContained.LEFT_HEAD; }
// public float RIBCAGE_PITCH_OFFSET() { return wrapperContained.RIBCAGE_PITCH_OFFSET; }
// public float TAIL_PITCH_OFFSET() { return wrapperContained.TAIL_PITCH_OFFSET; }
// public void rotateHead(yarnwrap.entity.boss.WitherEntity entity,yarnwrap.client.model.ModelPart head,int sigma) { wrapperContained.rotateHead(entity.wrapperContained,head.wrapperContained,sigma); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}