package yarnwrap.client.render.entity.model;
public class ZombieVillagerEntityModel { public net.minecraft.client.render.entity.model.ZombieVillagerEntityModel wrapperContained; public ZombieVillagerEntityModel(net.minecraft.client.render.entity.model.ZombieVillagerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart hatRim() { return new yarnwrap.client.model.ModelPart(wrapperContained.hatRim); }
// public void hatRim(yarnwrap.client.model.ModelPart value) { wrapperContained.hatRim = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart hatRim() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ZombieVillagerEntityModel.hatRim); }
// public static void hatRim(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ZombieVillagerEntityModel.hatRim = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getArmorTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getArmorTexturedModelData(dilation.wrapperContained)); }
// public static yarnwrap.client.model.TexturedModelData getArmorTexturedModelData(yarnwrap.client.model.Dilation dilation, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ZombieVillagerEntityModel.getArmorTexturedModelData(dilation.wrapperContained)); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ZombieVillagerEntityModel.getTexturedModelData()); }

}