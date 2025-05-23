package yarnwrap.client.render.entity.state;
public class ZombieVillagerRenderState { public net.minecraft.client.render.entity.state.ZombieVillagerRenderState wrapperContained; public ZombieVillagerRenderState(net.minecraft.client.render.entity.state.ZombieVillagerRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.village.VillagerData villagerData() { return new yarnwrap.village.VillagerData(wrapperContained.villagerData); }
public void villagerData(yarnwrap.village.VillagerData value) { wrapperContained.villagerData = value.wrapperContained; }
// public static yarnwrap.village.VillagerData villagerData() { return new yarnwrap.village.VillagerData(net.minecraft.client.render.entity.state.ZombieVillagerRenderState.villagerData); }
// public static void villagerData(yarnwrap.village.VillagerData value, ) { net.minecraft.client.render.entity.state.ZombieVillagerRenderState.villagerData = value.wrapperContained; }


}