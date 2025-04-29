package yarnwrap.client.render.entity.model;
public class EntityModelLoader { public net.minecraft.client.render.entity.model.EntityModelLoader wrapperContained; public EntityModelLoader(net.minecraft.client.render.entity.model.EntityModelLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map modelParts() { return wrapperContained.modelParts; }
// public void modelParts(java.util.Map value) { wrapperContained.modelParts = value; }
// public static java.util.Map modelParts() { return net.minecraft.client.render.entity.model.EntityModelLoader.modelParts; }
// public static void modelParts(java.util.Map value, ) { net.minecraft.client.render.entity.model.EntityModelLoader.modelParts = value; }

public yarnwrap.client.model.ModelPart getModelPart(yarnwrap.client.render.entity.model.EntityModelLayer layer) { return new yarnwrap.client.model.ModelPart(wrapperContained.getModelPart(layer.wrapperContained)); }
// public static yarnwrap.client.model.ModelPart getModelPart(yarnwrap.client.render.entity.model.EntityModelLayer layer, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.EntityModelLoader.getModelPart(layer.wrapperContained)); }

}