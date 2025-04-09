package yarnwrap.client.render.entity.model;
public class ModelWithHead { public net.minecraft.client.render.entity.model.ModelWithHead wrapperContained; public ModelWithHead(net.minecraft.client.render.entity.model.ModelWithHead wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelPart getHead() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHead()); }

}