package yarnwrap.client.model;
public class ModelData { public net.minecraft.client.model.ModelData wrapperContained; public ModelData(net.minecraft.client.model.ModelData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPartData data() { return new yarnwrap.client.model.ModelPartData(wrapperContained.data); }
// public void data(yarnwrap.client.model.ModelPartData value) { wrapperContained.data = value.wrapperContained; }
public yarnwrap.client.model.ModelPartData getRoot() { return new yarnwrap.client.model.ModelPartData(wrapperContained.getRoot()); }

}