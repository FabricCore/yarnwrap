package yarnwrap.client.render.entity.model;
public class WitchEntityModel { public net.minecraft.client.render.entity.model.WitchEntityModel wrapperContained; public WitchEntityModel(net.minecraft.client.render.entity.model.WitchEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean liftingNose() { return wrapperContained.liftingNose; }
public yarnwrap.client.model.ModelPart getNose() { return new yarnwrap.client.model.ModelPart(wrapperContained.getNose()); }
public void setLiftingNose(boolean liftingNose) { wrapperContained.setLiftingNose(liftingNose); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}