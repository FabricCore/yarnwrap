package yarnwrap.client.render.entity.model;
public class EntityModelLoader { public net.minecraft.client.render.entity.model.EntityModelLoader wrapperContained; public EntityModelLoader(net.minecraft.client.render.entity.model.EntityModelLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map modelParts() { return wrapperContained.modelParts; }
public yarnwrap.client.model.ModelPart getModelPart(yarnwrap.client.render.entity.model.EntityModelLayer layer) { return new yarnwrap.client.model.ModelPart(wrapperContained.getModelPart(layer.wrapperContained)); }

}