package yarnwrap.village;
public class VillagerDataContainer { public net.minecraft.village.VillagerDataContainer wrapperContained; public VillagerDataContainer(net.minecraft.village.VillagerDataContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public void setVillagerData(yarnwrap.village.VillagerData villagerData) { wrapperContained.setVillagerData(villagerData.wrapperContained); }
// public static void setVillagerData(yarnwrap.village.VillagerData villagerData, ) { net.minecraft.village.VillagerDataContainer.setVillagerData(villagerData.wrapperContained); }
public yarnwrap.village.VillagerData getVillagerData() { return new yarnwrap.village.VillagerData(wrapperContained.getVillagerData()); }
// public static yarnwrap.village.VillagerData getVillagerData() { return new yarnwrap.village.VillagerData(net.minecraft.village.VillagerDataContainer.getVillagerData()); }

}