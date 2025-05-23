package yarnwrap.client.render.entity.state;
public class VillagerDataRenderState { public net.minecraft.client.render.entity.state.VillagerDataRenderState wrapperContained; public VillagerDataRenderState(net.minecraft.client.render.entity.state.VillagerDataRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.village.VillagerData getVillagerData() { return new yarnwrap.village.VillagerData(wrapperContained.getVillagerData()); }
// public static yarnwrap.village.VillagerData getVillagerData() { return new yarnwrap.village.VillagerData(net.minecraft.client.render.entity.state.VillagerDataRenderState.getVillagerData()); }

}