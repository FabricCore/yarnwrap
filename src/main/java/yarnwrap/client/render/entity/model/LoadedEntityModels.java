package yarnwrap.client.render.entity.model;
public class LoadedEntityModels { public net.minecraft.client.render.entity.model.LoadedEntityModels wrapperContained; public LoadedEntityModels(net.minecraft.client.render.entity.model.LoadedEntityModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map modelParts() { return wrapperContained.modelParts; }
// public void modelParts(java.util.Map value) { wrapperContained.modelParts = value; }
// public static java.util.Map modelParts() { return net.minecraft.client.render.entity.model.LoadedEntityModels.modelParts; }
// public static void modelParts(java.util.Map value, ) { net.minecraft.client.render.entity.model.LoadedEntityModels.modelParts = value; }

// public yarnwrap.client.render.entity.model.LoadedEntityModels EMPTY() { return new yarnwrap.client.render.entity.model.LoadedEntityModels(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.entity.model.LoadedEntityModels value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.LoadedEntityModels EMPTY() { return new yarnwrap.client.render.entity.model.LoadedEntityModels(net.minecraft.client.render.entity.model.LoadedEntityModels.EMPTY); }
// public static void EMPTY(yarnwrap.client.render.entity.model.LoadedEntityModels value, ) { net.minecraft.client.render.entity.model.LoadedEntityModels.EMPTY = value.wrapperContained; }

public LoadedEntityModels(java.util.Map modelParts) { this.wrapperContained = new net.minecraft.client.render.entity.model.LoadedEntityModels(modelParts); }
public yarnwrap.client.model.ModelPart getModelPart(yarnwrap.client.render.entity.model.EntityModelLayer layer) { return new yarnwrap.client.model.ModelPart(wrapperContained.getModelPart(layer.wrapperContained)); }
// public static yarnwrap.client.model.ModelPart getModelPart(yarnwrap.client.render.entity.model.EntityModelLayer layer, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LoadedEntityModels.getModelPart(layer.wrapperContained)); }
// public yarnwrap.client.render.entity.model.LoadedEntityModels copy() { return new yarnwrap.client.render.entity.model.LoadedEntityModels(wrapperContained.copy()); }
public static yarnwrap.client.render.entity.model.LoadedEntityModels copy() { return new yarnwrap.client.render.entity.model.LoadedEntityModels(net.minecraft.client.render.entity.model.LoadedEntityModels.copy()); }

}