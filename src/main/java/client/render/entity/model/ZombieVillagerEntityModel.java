package yarnwrap.client.render.entity.model;
public class ZombieVillagerEntityModel { public net.minecraft.client.render.entity.model.ZombieVillagerEntityModel wrapperContained; public ZombieVillagerEntityModel(net.minecraft.client.render.entity.model.ZombieVillagerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart hatRim() { return new yarnwrap.client.model.ModelPart(wrapperContained.hatRim); }
public yarnwrap.client.model.TexturedModelData getArmorTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getArmorTexturedModelData(dilation.wrapperContained)); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}