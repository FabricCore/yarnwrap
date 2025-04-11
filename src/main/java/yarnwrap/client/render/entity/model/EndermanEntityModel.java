package yarnwrap.client.render.entity.model;
public class EndermanEntityModel { public net.minecraft.client.render.entity.model.EndermanEntityModel wrapperContained; public EndermanEntityModel(net.minecraft.client.render.entity.model.EndermanEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean angry() { return wrapperContained.angry; }
public void angry(boolean value) { wrapperContained.angry = value; }
public boolean carryingBlock() { return wrapperContained.carryingBlock; }
public void carryingBlock(boolean value) { wrapperContained.carryingBlock = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}