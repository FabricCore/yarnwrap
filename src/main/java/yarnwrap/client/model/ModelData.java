package yarnwrap.client.model;
public class ModelData { public net.minecraft.client.model.ModelData wrapperContained; public ModelData(net.minecraft.client.model.ModelData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPartData data() { return new yarnwrap.client.model.ModelPartData(wrapperContained.data); }
// public void data(yarnwrap.client.model.ModelPartData value) { wrapperContained.data = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPartData data() { return new yarnwrap.client.model.ModelPartData(net.minecraft.client.model.ModelData.data); }
// public static void data(yarnwrap.client.model.ModelPartData value, ) { net.minecraft.client.model.ModelData.data = value.wrapperContained; }

public yarnwrap.client.model.ModelPartData getRoot() { return new yarnwrap.client.model.ModelPartData(wrapperContained.getRoot()); }
// public static yarnwrap.client.model.ModelPartData getRoot() { return new yarnwrap.client.model.ModelPartData(net.minecraft.client.model.ModelData.getRoot()); }

}