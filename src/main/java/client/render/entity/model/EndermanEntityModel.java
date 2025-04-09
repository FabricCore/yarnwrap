package yarnwrap.client.render.entity.model;
public class EndermanEntityModel { public net.minecraft.client.render.entity.model.EndermanEntityModel wrapperContained; public EndermanEntityModel(net.minecraft.client.render.entity.model.EndermanEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean angry() { return wrapperContained.angry; }
public boolean carryingBlock() { return wrapperContained.carryingBlock; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}