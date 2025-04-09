package yarnwrap.client.render.entity.model;
public class LlamaSpitEntityModel { public net.minecraft.client.render.entity.model.LlamaSpitEntityModel wrapperContained; public LlamaSpitEntityModel(net.minecraft.client.render.entity.model.LlamaSpitEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String MAIN() { return wrapperContained.MAIN; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}