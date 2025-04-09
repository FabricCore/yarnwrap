package yarnwrap.client.render.entity.model;
public class ChickenEntityModel { public net.minecraft.client.render.entity.model.ChickenEntityModel wrapperContained; public ChickenEntityModel(net.minecraft.client.render.entity.model.ChickenEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
public java.lang.String RED_THING() { return wrapperContained.RED_THING; }
// public yarnwrap.client.model.ModelPart beak() { return new yarnwrap.client.model.ModelPart(wrapperContained.beak); }
// public yarnwrap.client.model.ModelPart wattle() { return new yarnwrap.client.model.ModelPart(wrapperContained.wattle); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}