package yarnwrap.client.render.entity.model;
public class WitchEntityModel { public net.minecraft.client.render.entity.model.WitchEntityModel wrapperContained; public WitchEntityModel(net.minecraft.client.render.entity.model.WitchEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean liftingNose() { return wrapperContained.liftingNose; }
// public void liftingNose(boolean value) { wrapperContained.liftingNose = value; }
// public static boolean liftingNose() { return net.minecraft.client.render.entity.model.WitchEntityModel.liftingNose; }
// public static void liftingNose(boolean value, ) { net.minecraft.client.render.entity.model.WitchEntityModel.liftingNose = value; }

public yarnwrap.client.model.ModelPart getNose() { return new yarnwrap.client.model.ModelPart(wrapperContained.getNose()); }
// public static yarnwrap.client.model.ModelPart getNose() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.WitchEntityModel.getNose()); }
public void setLiftingNose(boolean liftingNose) { wrapperContained.setLiftingNose(liftingNose); }
// public static void setLiftingNose(boolean liftingNose, ) { net.minecraft.client.render.entity.model.WitchEntityModel.setLiftingNose(liftingNose); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.WitchEntityModel.getTexturedModelData()); }

}