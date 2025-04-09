package yarnwrap.client.render.entity;
public class PufferfishEntityRenderer { public net.minecraft.client.render.entity.PufferfishEntityRenderer wrapperContained; public PufferfishEntityRenderer(net.minecraft.client.render.entity.PufferfishEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel smallModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.smallModel); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.client.render.entity.model.EntityModel largeModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.largeModel); }
// public yarnwrap.client.render.entity.model.EntityModel mediumModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.mediumModel); }
// public int modelSize() { return wrapperContained.modelSize; }

}