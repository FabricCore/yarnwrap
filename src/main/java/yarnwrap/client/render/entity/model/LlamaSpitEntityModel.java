package yarnwrap.client.render.entity.model;
public class LlamaSpitEntityModel { public net.minecraft.client.render.entity.model.LlamaSpitEntityModel wrapperContained; public LlamaSpitEntityModel(net.minecraft.client.render.entity.model.LlamaSpitEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.LlamaSpitEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.LlamaSpitEntityModel.root = value.wrapperContained; }

// public java.lang.String MAIN() { return wrapperContained.MAIN; }
// public void MAIN(java.lang.String value) { wrapperContained.MAIN = value; }
// public static java.lang.String MAIN() { return net.minecraft.client.render.entity.model.LlamaSpitEntityModel.MAIN; }
// public static void MAIN(java.lang.String value, ) { net.minecraft.client.render.entity.model.LlamaSpitEntityModel.MAIN = value; }

public LlamaSpitEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.LlamaSpitEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.LlamaSpitEntityModel.getTexturedModelData()); }

}